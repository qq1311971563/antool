package com.ant.antool;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class IdTool {
    /**
     * ID生成器
     *
     * @param prefix 前缀 (ID)
     * @return prefix+yyMMddxxx(ID180812029)
     */
    public static String genId(String prefix) {
        return prefix + genDateFormat("yyMMdd") + genRandomStr(3);
    }

    /**
     * 生成指定位数的随机数
     *
     * @param length
     * @return
     */
    public static String genRandomStr(int length) {
        String val = "";
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            val += String.valueOf(random.nextInt(10));
        }
        return val;
    }

    /**
     * 生成当前时间的指定格式
     *
     * @param pattern 日期格式化类型
     * @return
     */
    private static String genDateFormat(String pattern) {
        return new SimpleDateFormat(pattern).format(new Date());
    }

    private IdTool() {
    }
}
