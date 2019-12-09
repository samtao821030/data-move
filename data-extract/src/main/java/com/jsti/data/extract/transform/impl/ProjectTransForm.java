package com.jsti.data.extract.transform.impl;

import com.jsti.data.extract.entity.newpm.NewProject;
import com.jsti.data.extract.entity.oldpm.OldProject;
import com.jsti.data.extract.entity.tran.TranEntity;
import com.jsti.data.extract.transform.ITransForm;
import com.jsti.data.extract.util.IDUtil;
import org.springframework.beans.BeanUtils;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
//项目基本信息转换引擎
public class ProjectTransForm implements ITransForm {
    @Override
    public TranEntity doTransForm(List oldList) {
        TranEntity<NewProject> tranEntity = new TranEntity();
        List<NewProject> newProjectList = new ArrayList<>();
        for(Object o:oldList){
            if(o instanceof OldProject) {
                OldProject oldProject = (OldProject) o;
                //新项目编号(L1)
                String code_l1=oldProject.getContract_projectcode();
                //新项目id(L1)
                BigDecimal id_l1 = IDUtil.generateProjectId(code_l1);
                //新项目编号(L1-D01)
                String code_l1_d01=code_l1+"-D01";
                //新项目id(L1-D01)
                BigDecimal id_l1_d01 = IDUtil.generateProjectId(code_l1_d01);
                //新项目编号(L1-D01-001)
                String code_l1_d01_001=code_l1_d01+"-001";
                //新项目id(L1-D01-001)
                BigDecimal id_l1_d01_001 = IDUtil.generateProjectId(code_l1_d01_001);
                //新项目编号(L1-S01)
                String code_l1_s01=code_l1+"-S01";
                //新项目编号(L1-S01-001)
                String code_l1_s01_001=code_l1_s01+"-001";
                //新项目名称
                String name = oldProject.getPrj_projectname();
                //预计合同金额
                BigDecimal amount = new BigDecimal(oldProject.getPrj_BudgetaryContractMonery());
                //L1-------------------start
                NewProject newProject_l1 = new NewProject();
                newProject_l1.setCode(code_l1);
                newProject_l1.setName(name);
                newProject_l1.setAmount(amount);
                //设置迁移顶级编号
                newProject_l1.setTran_code(code_l1);
                newProject_l1.setId(id_l1);

                newProjectList.add(newProject_l1);
                //L1-------------------end

                //L1-D01-------------------start
                NewProject newProject_l1_d01 = new NewProject();
                //复制对象
                BeanUtils.copyProperties(newProject_l1,newProject_l1_d01);
                newProject_l1_d01.setCode(code_l1_d01);
                //设置Id
                newProject_l1_d01.setId(id_l1_d01);

                newProjectList.add(newProject_l1_d01);
                //L1-D01-------------------end

                //L1-D01-001-------------------start
                NewProject newProject_l1_d01_001 = new NewProject();
                //复制对象
                BeanUtils.copyProperties(newProject_l1,newProject_l1_d01_001);
                newProject_l1_d01_001.setCode(code_l1_d01_001);
                //设置Id
                newProject_l1_d01_001.setId(id_l1_d01_001);

                newProjectList.add(newProject_l1_d01_001);
                //L1-D01-001-------------------end
            }
        }
        tranEntity.setDataList(newProjectList);
        return tranEntity;
    }

    public static void main(String[] args) {
        List list = new ArrayList();
        OldProject oldProject = new OldProject();
        list.add(oldProject);
        oldProject = new OldProject();
        list.add(oldProject);
        Object o = list.get(0);
        if(o instanceof OldProject){
            System.out.println("我是这种类型！");
        }
    }
}
