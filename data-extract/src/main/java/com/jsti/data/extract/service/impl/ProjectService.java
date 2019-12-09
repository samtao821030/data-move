package com.jsti.data.extract.service.impl;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.jsti.data.extract.dao.IProjectDao;
import com.jsti.data.extract.entity.newpm.NewProject;
import com.jsti.data.extract.entity.oldpm.OldProject;
import com.jsti.data.extract.entity.tran.TranEntity;
import com.jsti.data.extract.service.IProjectService;
import com.jsti.data.extract.transform.ITransForm;
import com.jsti.data.extract.transform.impl.ProjectTransForm;
import com.jsti.data.extract.util.TransportUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Map;
import java.util.Set;

@Service
public class ProjectService implements IProjectService {
    @Autowired
    private IProjectDao projectDao;
    @Autowired
    private RestTemplate restTemplate;
    @Override
    public TranEntity transportProjectBasicInfo(String projectCodes,String batchNo,String batchTime) {
        Set<String> projectCodeSet = TransportUtils.generareProjectCodeListByStr(projectCodes);
        //查询项目基本信息
        List<OldProject> projectBasicInfoList = projectDao.queryProjectBasicInfoList(projectCodeSet);
        ITransForm<OldProject,NewProject> projectTransForm = new ProjectTransForm();
        TranEntity<NewProject> tranEntity = projectTransForm.doTransForm(projectBasicInfoList);
        //设置流水号
        tranEntity.setBatchNo(batchNo);
        //设置批次时间戳
        tranEntity.setBatchTime(batchTime);
        //设置目标表
        tranEntity.setTableName("project");
        //开始调用迁移数据保存服务
        restTemplate.postForObject("http://data-output/newpm/save",tranEntity,JSONObject.class);
        return tranEntity;
    }
}
