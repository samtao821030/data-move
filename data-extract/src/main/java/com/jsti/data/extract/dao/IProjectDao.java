package com.jsti.data.extract.dao;

import com.jsti.data.extract.entity.oldpm.OldProject;

import java.util.List;
import java.util.Set;

public interface IProjectDao {
    //获取项目基本信息列表
    public List<OldProject> queryProjectBasicInfoList(Set<String> projectCodeSet);
}
