package com.xiaofei.framework.utils;

/**
 * @Description: Created by IntelliJ IDEA.
 * @Author : 小肥居居头
 * @create 2024/3/14 21:04
 */


public class StringUtils {
    private StringUtils(){

    }

    /**
     * 根据属性名字获取set方法,userDao->setUserDao
     * @param fieldName 属性名字;
     * @return
     */
    public static String getSetterMethodByFieldName(String fieldName){
        return "set" + fieldName.substring(0, 1).toUpperCase() + fieldName.substring(1);
    }

    /**
     * 判断字符串是否为空
     * @param str
     * @return
     */
    public static boolean isEmpty(final String str) {
        return str == null || str.length() == 0;
    }
}
