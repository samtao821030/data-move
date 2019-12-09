package com.jsti.data.output.controller;

import com.alibaba.fastjson.JSONObject;
import com.jsti.data.output.entity.tran.TranEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/newpm")
public class OutputController {
    @RequestMapping(value="/save",method = RequestMethod.POST)
    public JSONObject saveDate(@RequestBody TranEntity tranEntity){
        JSONObject jsonObject = new JSONObject();
        System.out.println(tranEntity.getTableName());
        return jsonObject;
    }
}
