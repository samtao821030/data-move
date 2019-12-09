package com.jsti.data.output.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name="PROJECT")
public class Project {

    @Id
    @Column(name="ID")
    private Long id;

    @Column(name="RELATIONID")
    private Long relationId;

    @Column(name="CODE")
    private String code;

    @Column(name="NAME")
    private String name;

    @Column(name="MANAGER")
    private String manager;

    @Column(name="DIRECTOR")
    private String director;

    @Column(name="INDUSTRY")
    private String industry;

    @Column(name="BSTYPE")
    private String bstype;

    @Column(name="CURRENCY")
    private String currency;

    @Column(name="AMOUNT")
    private Long amount;

    @Column(name="AMOUNT_FUNCTIONAL")
    private Long amountFunctional;

    @Column(name="PROVISION")
    private Long provision;

    @Column(name="PROVISION_FUNCTIONAL")
    private Long provisionFunctional;

    @Column(name="DESCRIPTION")
    private String description;

    @Column(name="AREAID")
    private Long areaId;

    @Column(name="CITY")
    private String city;

    @Column(name="CONTRACT_ORG")
    private String contractOrg;

    @Column(name="CONTRACT_ORG_CODE")
    private String contractOrgCode;

    @Column(name="EXECUTE_ORG")
    private String executeOrg;

    @Column(name="EXECUTE_ORG_CODE")
    private String executeOrgCode;

    @Column(name="EXECUTE_DEPARTMENT")
    private Long executeDepartment;

    @Column(name="CUSTOM_ATTR")
    private String customAttr;

    @Column(name="CHIEFLAG")
    private String chiefLag;

    @Column(name="STATUS")
    private String status;

    @Column(name="SYS_STATUS")
    private String sysStatus;

    @Column(name="PROF_FLOW")
    private Long profFlow;

    @Column(name="CREATE_BY")
    private String createBy;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @Column(name="CREATE_TIME")
    private Date createTime;

    @Column(name="UPDATE_BY")
    private String updateBy;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @Column(name="UPDATE_TIME")
    private Date updateTime;

    @Column(name="DEL_FLAG")
    private String delFlag;

    @Column(name="KEYFLAG")
    private String keyFlag;

    @Column(name="MANAGER_NAME")
    private String managerName;

    @Column(name="DIRECTOR_NAME")
    private String directorName;

    @Column(name="CHECK_AMOUNT")
    private Long checkAmount;

    @Column(name="CHECK_FUNCTIONAL")
    private Long checkFunctional;

    @Column(name="VIRTUALFLAG")
    private String virtualFlag;

    @Column(name="BRANDFLAG")
    private String brandFlag;

    @Column(name="BTT")
    private String btt;

    @Column(name="START_NUM")
    private Long startNum;

    @Column(name="CUSTOMER_CODE")
    private String customerCode;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @Column(name="CLOSE_TIME")
    private Date closeTime;

    @Column(name="STATUS_NAME")
    private String statusName;

    @Column(name="CUSTOMER_ID")
    private Long customerId;

    @Column(name="SERVICE_ORDER_FLAG")
    private String serviceOrderFlag;

    @Column(name="QUOTA_FIXED_FLAG")
    private String quotaFixedFlag;

    @Column(name="TRAN_CODE")
    private String tranCode;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getRelationId() {
        return relationId;
    }

    public void setRelationId(Long relationId) {
        this.relationId = relationId;
    }

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

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public String getBstype() {
        return bstype;
    }

    public void setBstype(String bstype) {
        this.bstype = bstype;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public Long getAmountFunctional() {
        return amountFunctional;
    }

    public void setAmountFunctional(Long amountFunctional) {
        this.amountFunctional = amountFunctional;
    }

    public Long getProvision() {
        return provision;
    }

    public void setProvision(Long provision) {
        this.provision = provision;
    }

    public Long getProvisionFunctional() {
        return provisionFunctional;
    }

    public void setProvisionFunctional(Long provisionFunctional) {
        this.provisionFunctional = provisionFunctional;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getAreaId() {
        return areaId;
    }

    public void setAreaId(Long areaId) {
        this.areaId = areaId;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getContractOrg() {
        return contractOrg;
    }

    public void setContractOrg(String contractOrg) {
        this.contractOrg = contractOrg;
    }

    public String getContractOrgCode() {
        return contractOrgCode;
    }

    public void setContractOrgCode(String contractOrgCode) {
        this.contractOrgCode = contractOrgCode;
    }

    public String getExecuteOrg() {
        return executeOrg;
    }

    public void setExecuteOrg(String executeOrg) {
        this.executeOrg = executeOrg;
    }

    public String getExecuteOrgCode() {
        return executeOrgCode;
    }

    public void setExecuteOrgCode(String executeOrgCode) {
        this.executeOrgCode = executeOrgCode;
    }

    public Long getExecuteDepartment() {
        return executeDepartment;
    }

    public void setExecuteDepartment(Long executeDepartment) {
        this.executeDepartment = executeDepartment;
    }

    public String getCustomAttr() {
        return customAttr;
    }

    public void setCustomAttr(String customAttr) {
        this.customAttr = customAttr;
    }

    public String getChiefLag() {
        return chiefLag;
    }

    public void setChiefLag(String chiefLag) {
        this.chiefLag = chiefLag;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSysStatus() {
        return sysStatus;
    }

    public void setSysStatus(String sysStatus) {
        this.sysStatus = sysStatus;
    }

    public Long getProfFlow() {
        return profFlow;
    }

    public void setProfFlow(Long profFlow) {
        this.profFlow = profFlow;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag;
    }

    public String getKeyFlag() {
        return keyFlag;
    }

    public void setKeyFlag(String keyFlag) {
        this.keyFlag = keyFlag;
    }

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    public String getDirectorName() {
        return directorName;
    }

    public void setDirectorName(String directorName) {
        this.directorName = directorName;
    }

    public Long getCheckAmount() {
        return checkAmount;
    }

    public void setCheckAmount(Long checkAmount) {
        this.checkAmount = checkAmount;
    }

    public Long getCheckFunctional() {
        return checkFunctional;
    }

    public void setCheckFunctional(Long checkFunctional) {
        this.checkFunctional = checkFunctional;
    }

    public String getVirtualFlag() {
        return virtualFlag;
    }

    public void setVirtualFlag(String virtualFlag) {
        this.virtualFlag = virtualFlag;
    }

    public String getBrandFlag() {
        return brandFlag;
    }

    public void setBrandFlag(String brandFlag) {
        this.brandFlag = brandFlag;
    }

    public String getBtt() {
        return btt;
    }

    public void setBtt(String btt) {
        this.btt = btt;
    }

    public Long getStartNum() {
        return startNum;
    }

    public void setStartNum(Long startNum) {
        this.startNum = startNum;
    }

    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    public Date getCloseTime() {
        return closeTime;
    }

    public void setCloseTime(Date closeTime) {
        this.closeTime = closeTime;
    }

    public String getStatusName() {
        return statusName;
    }

    public void setStatusName(String statusName) {
        this.statusName = statusName;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public String getServiceOrderFlag() {
        return serviceOrderFlag;
    }

    public void setServiceOrderFlag(String serviceOrderFlag) {
        this.serviceOrderFlag = serviceOrderFlag;
    }

    public String getQuotaFixedFlag() {
        return quotaFixedFlag;
    }

    public void setQuotaFixedFlag(String quotaFixedFlag) {
        this.quotaFixedFlag = quotaFixedFlag;
    }

    public String getTranCode() {
        return tranCode;
    }

    public void setTranCode(String tranCode) {
        this.tranCode = tranCode;
    }
}
