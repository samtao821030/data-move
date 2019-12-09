package com.jsti.data.extract.entity.oldpm;
//旧项目信息实体
public class OldProject {
    //项目编号
    private String contract_projectcode;
    //项目名称
    private String prj_projectname;
    //项目总监id
    private String projectdirector;
    //是否包括特定的品牌要素
    private String includebrand;
    //预计合同金额(万元)
    private Float Prj_BudgetaryContractMonery;

    public String getContract_projectcode() {
        return contract_projectcode;
    }

    public void setContract_projectcode(String contract_projectcode) {
        this.contract_projectcode = contract_projectcode;
    }

    public String getPrj_projectname() {
        return prj_projectname;
    }

    public void setPrj_projectname(String prj_projectname) {
        this.prj_projectname = prj_projectname;
    }

    public String getProjectdirector() {
        return projectdirector;
    }

    public void setProjectdirector(String projectdirector) {
        this.projectdirector = projectdirector;
    }

    public String getIncludebrand() {
        return includebrand;
    }

    public void setIncludebrand(String includebrand) {
        this.includebrand = includebrand;
    }

    public Float getPrj_BudgetaryContractMonery() {
        return Prj_BudgetaryContractMonery;
    }

    public void setPrj_BudgetaryContractMonery(Float prj_BudgetaryContractMonery) {
        Prj_BudgetaryContractMonery = prj_BudgetaryContractMonery;
    }
}
