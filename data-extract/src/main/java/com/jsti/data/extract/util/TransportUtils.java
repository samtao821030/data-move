package com.jsti.data.extract.util;

import org.springframework.util.StringUtils;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

public class TransportUtils {
    //将逗号分隔的项目编号字符串转化为项目编号集
    public static Set<String> generareProjectCodeListByStr(String projectCodes){
        Set<String> projectCodeSet = new HashSet<String>();
        if(!StringUtils.isEmpty(projectCodes)){
            String[] projectCodeArray = projectCodes.split(",");
            for(String projectCode:projectCodeArray){
                projectCodeSet.add(projectCode);
            }
        }
        return projectCodeSet;
    }

    //生成项目范围SQL语句拼接字符串
    public static String generateProjectRangeStr(Set<String> projectCodeSet){
        String projectRangeStr = null;
        StringBuffer projectRangeBuffer = new StringBuffer();
        projectRangeBuffer.append("(");
        for(String projectCode:projectCodeSet){
            projectRangeBuffer.append("'");
            projectRangeBuffer.append(projectCode);
            projectRangeBuffer.append("'");
            projectRangeBuffer.append(",");
        }
        int commaLastIndex = projectRangeBuffer.lastIndexOf(",");
        projectRangeBuffer.deleteCharAt(commaLastIndex);
        projectRangeBuffer.append(")");
        projectRangeStr=projectRangeBuffer.toString();
        return projectRangeStr;
    }

    public static String queryFormatUUID(){
        String uuid = UUID.randomUUID().toString().replaceAll("-","");
        return uuid;
    }

    public static void main(String[] args) {
        String projectCodes="0001,0002,0003";
        Set<String> projectCodeSet =TransportUtils.generareProjectCodeListByStr(projectCodes);
        System.out.println(TransportUtils.generateProjectRangeStr(projectCodeSet));
    }
}
