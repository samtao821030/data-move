package com.jsti.data.output.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name="TRAN_PROJECT",schema = "PROJECT")
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
    private Long amount_functional;

    @Column(name="PROVISION")
    private Long provision;

    @Column(name="PROVISION_FUNCTIONAL")
    private Long provision_functional;

    @Column(name="DESCRIPTION")
    private String description;

    @Column(name="AREAID")
    private Long areaId;

    @Column(name="CITY")
    private String city;

    @Column(name="CONTRACT_ORG")
    private String contract_org;

    @Column(name="CONTRACT_ORG_CODE")
    private String contract_or_code;

    @Column(name="EXECUTE_ORG")
    private String execute_org;

    @Column(name="EXECUTE_ORG_CODE")
    private String execute_org_code;

    @Column(name="EXECUTE_DEPARTMENT")
    private Long execute_department;

    @Column(name="CUSTOM_ATTR")
    private String custom_attr;

    @Column(name="CHIEFLAG")
    private String chieflag;

    @Column(name="STATUS")
    private String status;

    @Column(name="SYS_STATUS")
    private String sys_status;

    @Column(name="PROF_FLOW")
    private Long prof_flow;

    @Column(name="CREATE_BY")
    private String create_by;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @Column(name="CREATE_TIME")
    private Date create_time;

    @Column(name="UPDATE_BY")
    private String update_by;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @Column(name="UPDATE_TIME")
    private Date update_time;

    @Column(name="DEL_FLAG")
    private String del_flag;

    @Column(name="KEYFLAG")
    private String keyflag;

    @Column(name="MANAGER_NAME")
    private String manager_name;

    @Column(name="DIRECTOR_NAME")
    private String director_name;

    @Column(name="CHECK_AMOUNT")
    private Long check_amount;

    @Column(name="CHECK_FUNCTIONAL")
    private Long check_functional;

    @Column(name="VIRTUALFLAG")
    private String virtualflag;

    @Column(name="BRANDFLAG")
    private String brandflag;

    @Column(name="BTT")
    private String btt;

    @Column(name="START_NUM")
    private Long start_num;

    @Column(name="CUSTOMER_CODE")
    private String customer_code;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @Column(name="CLOSE_TIME")
    private Date close_time;

    @Column(name="STATUS_NAME")
    private String status_name;

    @Column(name="CUSTOMER_ID")
    private Long customer_id;

    @Column(name="SERVICE_ORDER_FLAG")
    private String service_orde_flag;

    @Column(name="QUOTA_FIXED_FLAG")
    private String quota_fixed_flag;

    @Column(name="TRAN_CODE")
    private String tran_code;

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

    public Long getAmount_functional() {
        return amount_functional;
    }

    public void setAmount_functional(Long amount_functional) {
        this.amount_functional = amount_functional;
    }

    public Long getProvision() {
        return provision;
    }

    public void setProvision(Long provision) {
        this.provision = provision;
    }

    public Long getProvision_functional() {
        return provision_functional;
    }

    public void setProvision_functional(Long provision_functional) {
        this.provision_functional = provision_functional;
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

    public String getContract_org() {
        return contract_org;
    }

    public void setContract_org(String contract_org) {
        this.contract_org = contract_org;
    }

    public String getContract_or_code() {
        return contract_or_code;
    }

    public void setContract_or_code(String contract_or_code) {
        this.contract_or_code = contract_or_code;
    }

    public String getExecute_org() {
        return execute_org;
    }

    public void setExecute_org(String execute_org) {
        this.execute_org = execute_org;
    }

    public String getExecute_org_code() {
        return execute_org_code;
    }

    public void setExecute_org_code(String execute_org_code) {
        this.execute_org_code = execute_org_code;
    }

    public Long getExecute_department() {
        return execute_department;
    }

    public void setExecute_department(Long execute_department) {
        this.execute_department = execute_department;
    }

    public String getCustom_attr() {
        return custom_attr;
    }

    public void setCustom_attr(String custom_attr) {
        this.custom_attr = custom_attr;
    }

    public String getChieflag() {
        return chieflag;
    }

    public void setChieflag(String chieflag) {
        this.chieflag = chieflag;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSys_status() {
        return sys_status;
    }

    public void setSys_status(String sys_status) {
        this.sys_status = sys_status;
    }

    public Long getProf_flow() {
        return prof_flow;
    }

    public void setProf_flow(Long prof_flow) {
        this.prof_flow = prof_flow;
    }

    public String getCreate_by() {
        return create_by;
    }

    public void setCreate_by(String create_by) {
        this.create_by = create_by;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public String getUpdate_by() {
        return update_by;
    }

    public void setUpdate_by(String update_by) {
        this.update_by = update_by;
    }

    public Date getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(Date update_time) {
        this.update_time = update_time;
    }

    public String getDel_flag() {
        return del_flag;
    }

    public void setDel_flag(String del_flag) {
        this.del_flag = del_flag;
    }

    public String getKeyflag() {
        return keyflag;
    }

    public void setKeyflag(String keyflag) {
        this.keyflag = keyflag;
    }

    public String getManager_name() {
        return manager_name;
    }

    public void setManager_name(String manager_name) {
        this.manager_name = manager_name;
    }

    public String getDirector_name() {
        return director_name;
    }

    public void setDirector_name(String director_name) {
        this.director_name = director_name;
    }

    public Long getCheck_amount() {
        return check_amount;
    }

    public void setCheck_amount(Long check_amount) {
        this.check_amount = check_amount;
    }

    public Long getCheck_functional() {
        return check_functional;
    }

    public void setCheck_functional(Long check_functional) {
        this.check_functional = check_functional;
    }

    public String getVirtualflag() {
        return virtualflag;
    }

    public void setVirtualflag(String virtualflag) {
        this.virtualflag = virtualflag;
    }

    public String getBrandflag() {
        return brandflag;
    }

    public void setBrandflag(String brandflag) {
        this.brandflag = brandflag;
    }

    public String getBtt() {
        return btt;
    }

    public void setBtt(String btt) {
        this.btt = btt;
    }

    public Long getStart_num() {
        return start_num;
    }

    public void setStart_num(Long start_num) {
        this.start_num = start_num;
    }

    public String getCustomer_code() {
        return customer_code;
    }

    public void setCustomer_code(String customer_code) {
        this.customer_code = customer_code;
    }

    public Date getClose_time() {
        return close_time;
    }

    public void setClose_time(Date close_time) {
        this.close_time = close_time;
    }

    public String getStatus_name() {
        return status_name;
    }

    public void setStatus_name(String status_name) {
        this.status_name = status_name;
    }

    public Long getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(Long customer_id) {
        this.customer_id = customer_id;
    }

    public String getService_orde_flag() {
        return service_orde_flag;
    }

    public void setService_orde_flag(String service_orde_flag) {
        this.service_orde_flag = service_orde_flag;
    }

    public String getQuota_fixed_flag() {
        return quota_fixed_flag;
    }

    public void setQuota_fixed_flag(String quota_fixed_flag) {
        this.quota_fixed_flag = quota_fixed_flag;
    }

    public String getTran_code() {
        return tran_code;
    }

    public void setTran_code(String tran_code) {
        this.tran_code = tran_code;
    }
}
