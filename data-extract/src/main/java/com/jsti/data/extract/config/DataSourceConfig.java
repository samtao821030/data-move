package com.jsti.data.extract.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

@Configuration
@EnableConfigurationProperties(DruidProperties.class)
public class DataSourceConfig {
    @Autowired
    private DruidProperties druidProperties;

    @Bean(name="druidDataSource",initMethod = "init",destroyMethod = "close")
    public DruidDataSource initBasicDataSource(){
        DruidDataSource basicDataSource = new DruidDataSource();
        basicDataSource.setDriverClassName(druidProperties.getDriver());
        basicDataSource.setUrl(druidProperties.getJdbc_url());
        basicDataSource.setUsername(druidProperties.getDb_username());
        basicDataSource.setPassword(druidProperties.getDb_password());
        basicDataSource.setInitialSize(druidProperties.getInitialSize());
        basicDataSource.setMaxActive(druidProperties.getMaxActive());
        basicDataSource.setMinIdle(druidProperties.getMinIdle());
        basicDataSource.setValidationQuery("select GETDATE() ");
        basicDataSource.setTestOnBorrow(true);
        basicDataSource.setDefaultAutoCommit(true);
        return basicDataSource;
    }

    @Bean(name="druidJdbcTemplate")
    public JdbcTemplate initJdbcTemplate(@Qualifier("druidDataSource")DruidDataSource xeDataSource){
        JdbcTemplate druidJdbcTemplate = new JdbcTemplate();
        druidJdbcTemplate.setDataSource(xeDataSource);
        return druidJdbcTemplate;
    }

}
