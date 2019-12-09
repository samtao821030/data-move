package com.jsti.data.extract.entity.newpm;

import java.math.BigDecimal;

//新项目信息实体
public class NewProject {
    //项目编号
    private String code;
    //项目名称
    private String name;
    //项目总监id
    private String director;
    //是否包括特定的品牌要素
    private String brandflag;
    //预计合同金额(万元)
    private BigDecimal amount;
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getBrandflag() {
        return brandflag;
    }

    public void setBrandflag(String brandflag) {
        this.brandflag = brandflag;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
}
