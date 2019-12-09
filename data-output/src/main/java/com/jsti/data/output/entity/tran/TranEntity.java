package com.jsti.data.output.entity.tran;

import java.util.ArrayList;
import java.util.List;

//迁移实体信息
public class TranEntity<T> {
    //批次流水号
    private String batchNo;
    //批次时间(yyyy-MM-dd HH:mm:ss)
    private String batchTime;
    //迁移目标表
    private String tableName;
    //迁移数据信息
    private List<T> dataList=new ArrayList<T>();

    public String getBatchNo() {
        return batchNo;
    }

    public void setBatchNo(String batchNo) {
        this.batchNo = batchNo;
    }

    public String getBatchTime() {
        return batchTime;
    }

    public void setBatchTime(String batchTime) {
        this.batchTime = batchTime;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public List<T> getDataList() {
        return dataList;
    }

    public void setDataList(List<T> dataList) {
        this.dataList = dataList;
    }
}
