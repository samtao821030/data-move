package com.jsti.data.extract.dao.impl;

import com.jsti.data.extract.dao.IProjectDao;
import com.jsti.data.extract.entity.oldpm.OldProject;
import com.jsti.data.extract.util.TransportUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;

@Repository
public class ProjectDao implements IProjectDao {
    @Autowired
    private JdbcTemplate druidJdbcTemplate;
    //获取项目基本信息列表
    public List<OldProject> queryProjectBasicInfoList(Set<String> projectCodeSet){
        List<OldProject> projectBasicInfoList = null;
        String query_sql = " select \n" +
                "top 1000\n" +
                "id,\n" +
                "Contract_ProjectCode,\n" +
                "Prj_ProjectName,\n" +
                "ProjectDirector,\n" +
                "IncludeBrand,\n" +
                "Prj_BudgetaryContractMonery \n" +
                "from Prj_Basic_ProjectRegistInfo \n" +
                "where 1=1 ";
        if(projectCodeSet.size()>0){
            String projectRangeStr = TransportUtils.generateProjectRangeStr(projectCodeSet);
            query_sql+=" and Contract_ProjectCode in "+projectRangeStr;
        }
        Object[] params = new Object[]{};
        projectBasicInfoList = druidJdbcTemplate.query(query_sql,params,new BeanPropertyRowMapper<>(OldProject.class));
        return projectBasicInfoList;
    }
}
