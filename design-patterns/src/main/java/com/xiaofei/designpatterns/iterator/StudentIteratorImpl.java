package com.xiaofei.designpatterns.iterator;

import java.util.List;
import java.util.concurrent.atomic.LongAdder;

/**
 * @Description: Created by IntelliJ IDEA.
 * 具体迭代器,是一次性使用品;
 * 给一个List<Student>生成一个foreach的简易版本;
 * @Author : 小肥居居头
 * @create 2024/3/13 16:55
 */


public class StudentIteratorImpl implements StudentIterator {

    private List<Student> students;

    public StudentIteratorImpl(List<Student> students) {
        this.students = students;
    }

    private int position = 0;

    @Override
    public boolean hasNext() {
        return position < students.size();
    }

    @Override
    public Student next() {
        Student currentStudent = students.get(position);
        position++;
        return currentStudent;
    }
}
