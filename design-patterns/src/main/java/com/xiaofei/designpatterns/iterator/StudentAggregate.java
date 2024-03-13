package com.xiaofei.designpatterns.iterator;

/**
 * @Description: Created by IntelliJ IDEA.
 * @Author : 小肥居居头
 * @create 2024/3/13 17:40
 */


public interface StudentAggregate {
    /**
     * 添加学生;
     * @param student
     */
    void addStudent(Student student);

    /**
     * 移除学生
     * @param student
     */
    void removeStudent(Student student);

    /**
     * 获取迭代器对象;
     * @return
     */
    StudentIterator getStudentIterator();
}
