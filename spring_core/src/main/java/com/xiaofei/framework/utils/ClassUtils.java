package com.xiaofei.framework.utils;

import java.lang.reflect.Field;

/**
 * @Description: Created by IntelliJ IDEA.
 * @Author : 小肥居居头
 * @create 2024/3/14 21:38
 */


public class ClassUtils {
    private ClassUtils(){

    }

    public static Class getFieldType(Field field) {
        Class<?> fieldType = field.getType();
        return getClass(fieldType);
    }

    /**
     * 判断类属于什么基本数据类型;
     * @param fieldType
     * @return
     */
    private static Class getClass(Class<?> fieldType) {
        if (fieldType == int.class) {
            return Integer.class;
        } else if (fieldType == Integer.class) {
            return Integer.class;
        } else if (fieldType == long.class) {
            return Long.class;
        } else if (fieldType == Long.class) {
            return Long.class;
        } else if (fieldType == float.class) {
            return Float.class;
        } else if (fieldType == Float.class) {
            return Float.class;
        } else if (fieldType == double.class) {
            return Double.class;
        } else if (fieldType == Double.class) {
            return Double.class;
        } else if (fieldType == byte.class) {
            return Byte.class;
        } else if (fieldType == Byte.class) {
            return Byte.class;
        } else if (fieldType == short.class) {
            return Short.class;
        } else if (fieldType == Short.class) {
            return Short.class;
        } else if (fieldType == char.class) {
            return Character.class;
        } else if (fieldType == Character.class) {
            return Character.class;
        } else if (fieldType == boolean.class) {
            return Boolean.class;
        } else if (fieldType == Boolean.class) {
            return Boolean.class;
        }
        // String
        return String.class;
    }

    /**
     * 将字符串根据指定基本数据类型来转换;
     * @param propertyValue
     * @param fieldType
     * @return
     */
    public static Object castStringByType(String propertyValue, Class fieldType) {
        if (fieldType == int.class || fieldType == Integer.class) {
            return Integer.parseInt(propertyValue);
        } else if (fieldType == long.class || fieldType == Long.class) {
            return Long.parseLong(propertyValue);
        } else if (fieldType == float.class || fieldType == Float.class) {
            return Float.parseFloat(propertyValue);
        } else if (fieldType == double.class || fieldType == Double.class) {
            return Double.parseDouble(propertyValue);
        } else if (fieldType == byte.class || fieldType == Byte.class) {
            return Byte.parseByte(propertyValue);
        } else if (fieldType == short.class || fieldType == Short.class) {
            return Short.parseShort(propertyValue);
        } else if (fieldType == char.class || fieldType == Character.class) {
            if (propertyValue.length() == 1) {
                return propertyValue.charAt(0);
            } else {
                // 可以添加逻辑处理非单个字符的情况
                return null;
            }
        } else if (fieldType == boolean.class || fieldType == Boolean.class) {
            return Boolean.parseBoolean(propertyValue);
        } else {
            // String
            return propertyValue;
        }
    }
}
