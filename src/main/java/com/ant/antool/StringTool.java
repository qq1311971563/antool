package com.ant.antool;

public class StringTool {


    public static boolean isEmpty(String... strs){
        for (String s : strs) {
            if(s == null){
                return true;
            }
            //去掉所有空格进行判断
            if ("".equals(s.replace("", ""))) {
                return true;
            }
        }
        return false;//没有一个为空
    }
}
