package com.xiaofei.framework.beans;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Description: Created by IntelliJ IDEA.
 * PropertyValues封装的是<property></property>
 * 但是一个Bean可能有多个属性,多个属性就由这个类来管理;
 * @Author : 小肥居居头
 * @create 2024/3/14 16:48
 */


public class MultiplePropertyValues implements Iterable<PropertyValue> {

    /**
     * 声明为final,表示只能被赋值一次,必须在构造方法结束之前进行赋值;
     */
    private final List<PropertyValue> propertyValues;

    public MultiplePropertyValues(List<PropertyValue> propertyValues) {
        if (propertyValues == null) {
            this.propertyValues = new ArrayList<PropertyValue>();
        } else {
            this.propertyValues = propertyValues;
        }
    }

    public MultiplePropertyValues() {
        this.propertyValues = new ArrayList<PropertyValue>();
    }

    /**
     * 以数组的形式返回所有属性
     * @return
     */
    public PropertyValue[] getPropertyValues(){
        return propertyValues.toArray(new PropertyValue[0]);
    }

    /**
     * 根据名字name来获取整个属性对象;
     * @param propertyName
     * @return
     */
    public PropertyValue getPropertyValue(String propertyName){
        for (PropertyValue p : propertyValues) {
            if (p.getName().equals(propertyName)){
                return p;
            }
        }
        return null;
    }

    /**
     * 判断集合是否为空;
     * @return 集合是否为空;
     */
    public boolean isEmpty(){
        return propertyValues.isEmpty();
    }

    /**
     * 添加属性实体类,添加之前要判断属性名字是否重复,如果重复就覆盖;
     * @param propertyValue
     * @return
     */
    public MultiplePropertyValues addPropertyValue(PropertyValue propertyValue){
        for (int i = 0; i < propertyValues.size(); i++) {
            PropertyValue p = propertyValues.get(i);
            if (p.getName().equals(propertyValue.getName())){
                propertyValues.set(i, propertyValue);
                return this;
            }
        }
        propertyValues.add(propertyValue);
        return this;
    }

    /**
     * 判断是否有这个属性名的属性;
     * @param propertyName 属性名
     * @return
     */
    public boolean isContains(String propertyName){
        return getPropertyValue(propertyName) != null;
    }

    /**
     * 获取迭代器对象;
     *
     * @return 代器对象;
     */
    public Iterator<PropertyValue> iterator() {
        return propertyValues.iterator();
    }
}
