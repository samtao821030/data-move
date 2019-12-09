package com.jsti.data.output.service;

import com.alibaba.fastjson.JSONObject;

import java.util.List;

public interface IOutputService {
    //保存数据
    public void saveData(List<JSONObject> dataList);
}
