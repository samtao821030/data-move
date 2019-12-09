package com.jsti.data.extract.service;


import com.alibaba.fastjson.JSONObject;
import com.jsti.data.extract.entity.tran.TranEntity;

public interface IProjectService {
    //迁移项目基本信息(含合同)
    public TranEntity transportProjectBasicInfo(String projectCodes, String batchNo, String batchTime);
}
