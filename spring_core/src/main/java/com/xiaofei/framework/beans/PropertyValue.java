package com.xiaofei.framework.beans;

/**
 * @Description: Created by IntelliJ IDEA.
 * pojo,对应业务实体类的Entity;
 * 封装xml文件里面<property></property>属性标签里面的实际数据;
 * @Author : 小肥居居头
 * @create 2024/3/14 16:32
 */


public class PropertyValue {
    private String name;
    private String ref;
    private String value;

    public PropertyValue(String name, String ref, String value) {
        this.name = name;
        this.ref = ref;
        this.value = value;
    }

    public PropertyValue() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
