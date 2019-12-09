package com.jsti.data.extract.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

//字典映射类
@Configuration
public class DictMapper {
    //项目状态新老映射关系
    @Bean(name="projectStatusMapper")
    public Map<String,String> initProjectStatusMapper(){
        Map<String,String> projectStatusMapper = new HashMap<>();
        //项目状态--结题(老)->结束(新)
        projectStatusMapper.put("NormalJieTi","finished");
        return projectStatusMapper;
    }
}
