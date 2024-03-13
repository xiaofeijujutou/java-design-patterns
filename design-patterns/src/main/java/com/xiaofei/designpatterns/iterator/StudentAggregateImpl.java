package com.xiaofei.designpatterns.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: Created by IntelliJ IDEA.
 * Student的聚合类,可以实现操作Student的多种操作,比如说迭代器;
 * @Author : 小肥居居头
 * @create 2024/3/13 17:55
 */


public class StudentAggregateImpl implements StudentAggregate {

    private List<Student> students = new ArrayList<>();
    @Override
    public void addStudent(Student student) {
        students.add(student);
    }

    @Override
    public void removeStudent(Student student) {
        students.remove(student);
    }

    @Override
    public StudentIterator getStudentIterator() {
        return new StudentIteratorImpl(students);
    }
}
