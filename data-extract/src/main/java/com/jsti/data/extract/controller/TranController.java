package com.jsti.data.extract.controller;

import com.alibaba.fastjson.JSONObject;
import com.jsti.data.extract.service.IProjectService;
import com.jsti.data.extract.util.DateUtils;
import com.jsti.data.extract.util.TransportUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

//传输变换Controller
@RestController
@CrossOrigin
@RequestMapping("/oldpm")
public class TranController {
    @Autowired
    private IProjectService projectService;
    //清除迁移脏数据
    @RequestMapping(value="/clean/all",method = RequestMethod.GET)
    public void cleanAll(){

    }

    //迁移数据
    @RequestMapping(value="/move/project",method = RequestMethod.GET)
    public JSONObject doTransport(@RequestParam String projectCodes, String scope){
        JSONObject jsonObject = new JSONObject();
        //获得批次号
        String batchNo = TransportUtils.queryFormatUUID();
        //获得批次时间戳
        String batchTime = DateUtils.getDateTimeNowStr();
        //迁移项目基本信息
        projectService.transportProjectBasicInfo(projectCodes,batchNo,batchTime);
        return jsonObject;
    }
}
