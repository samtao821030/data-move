package com.jsti.data.output.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.jsti.data.output.dao.ProjectRepository;
import com.jsti.data.output.entity.Project;
import com.jsti.data.output.service.IOutputService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("projectOutputService")
public class ProjectOutputService implements IOutputService {
    @Autowired
    private ProjectRepository projectRepository;

    @Override
    public void saveData(List<JSONObject> dataList) {
        String dataListJsonStr = JSON.toJSONString(dataList);
        List<Project> projectList = JSON.parseArray(dataListJsonStr,Project.class);
        projectRepository.saveAll(projectList);
        System.out.println();
    }
}
