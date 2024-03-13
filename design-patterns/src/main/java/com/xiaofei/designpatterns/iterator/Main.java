package com.xiaofei.designpatterns.iterator;

import java.util.concurrent.atomic.LongAdder;

/**
 * @Description: Created by IntelliJ IDEA.
 * @Author : 小肥居居头
 * @create 2024/3/13 16:53
 */


public class Main {
    public static void main(String[] args) {
        StudentAggregate studentAggregate = new StudentAggregateImpl();
        studentAggregate.addStudent(new Student("xiaofei1", 1));
        studentAggregate.addStudent(new Student("xiaofei2", 2));
        studentAggregate.addStudent(new Student("xiaofei3", 3));
        studentAggregate.addStudent(new Student("xiaofei4", 4));
        studentAggregate.addStudent(new Student("xiaofei5", 5));
        studentAggregate.addStudent(new Student("xiaofei6", 6));
        StudentIterator studentIterator = studentAggregate.getStudentIterator();
        while (studentIterator.hasNext()){
            System.out.println(studentIterator.next());
        }
    }
}
