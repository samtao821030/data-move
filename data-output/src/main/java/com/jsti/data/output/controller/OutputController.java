package com.jsti.data.output.controller;

import com.alibaba.fastjson.JSONObject;
import com.jsti.data.output.entity.tran.TranEntity;
import com.jsti.data.output.service.IOutputService;
import com.jsti.data.output.service.impl.ProjectOutputService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/newpm")
public class OutputController {
    @Autowired
    @Qualifier("projectOutputService")
    private IOutputService projectOutputService;

    @RequestMapping(value="/save",method = RequestMethod.POST)
    public JSONObject saveDate(@RequestBody TranEntity tranEntity){
        JSONObject jsonObject = new JSONObject();
        String tableName = tranEntity.getTableName();
        IOutputService outputService = null;
        if("project".equalsIgnoreCase(tableName)){
            projectOutputService.saveData(tranEntity.getDataList());
        }
        return jsonObject;
    }
}
