package com.xiaofei.framework.beans;

/**
 * @Description: Created by IntelliJ IDEA.
 * Bean的所有信息;
 * id, class, property;
 * @Author : 小肥居居头
 * @create 2024/3/14 17:34
 */


public class BeanDefinition  {
    private String id;
    private String className;
    private MultiplePropertyValues multiplePropertyValues;


    public BeanDefinition() {
        multiplePropertyValues = new MultiplePropertyValues();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public MultiplePropertyValues getMultiplePropertyValues() {
        return multiplePropertyValues;
    }

    public void setMultiplePropertyValues(MultiplePropertyValues multiplePropertyValues) {
        this.multiplePropertyValues = multiplePropertyValues;
    }
}
