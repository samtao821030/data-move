package com.jsti.data.extract.util;

import java.math.BigDecimal;

//ID生成工具类
public class IDUtil {
    //生成项目id
    public static BigDecimal generateProjectId(String project_code){
        BigDecimal prj_id = null;
        //MD5化
        String project_code_md5 = MD5Util.MD5(project_code);
        //将MD5化项目编码进一步Hash
        String project_code_md5_hash = project_code_md5.hashCode()+"";
        StringBuffer project_code_buff = new StringBuffer(project_code_md5_hash);
        if(project_code_md5_hash.length()<18){
            int n = 18-project_code_md5_hash.length();
            for(int i=0;i<n;i++){
                project_code_buff.append("0");
            }
        }
        try {
            BigDecimal project_code_first = new BigDecimal(project_code_buff.toString());
            BigDecimal project_code_second = new BigDecimal(project_code.hashCode());
            prj_id=project_code_first.add(project_code_second);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        System.out.println(prj_id.doubleValue());
        return prj_id;
    }

    public static void main(String[] args) {
        System.out.println(IDUtil.generateProjectId("19000360"));
    }
}
