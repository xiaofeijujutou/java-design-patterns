package com.xiaofei.designpatterns.demeter;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: Created by IntelliJ IDEA.
 * @Author : 小肥居居头
 * @create 2024/3/2 20:17
 */


public class Demeter {

    public static void main(String[] args) {
        //new一个大的
        SchoolManager schoolManager = new SchoolManager();
        //调用大的打印方法,吧小的传进去;
        schoolManager.printAllEmployee(new CollegeManager());
    }
}

/**
 * 学校总部员工实体类
 */
class Employee {
    private String id;

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
}

/**
 * 学院员工实体类
 */
class CollegeEmployee {
    private String id;

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
}

/**
 * 学院员工的管理类
 */
class CollegeManager {
    /**
     * 获取所有员工id(这里是循环10次模拟从dao里面查数据);
     * @return
     */
    public List<CollegeEmployee> getAllEmployee() {
        List<CollegeEmployee> list = new ArrayList<CollegeEmployee>();
        for (int i = 0; i < 10; i++) {
            CollegeEmployee emp = new CollegeEmployee();
            emp.setId("学院员工id= " + i);
            list.add(emp);
        }
        return list;
    }
}

/**
 * 学校员工的管理类
 */
class SchoolManager {
    /**
     * 获取所有员工id(这里是循环10次模拟从dao里面查数据);
     * @return
     */
    public List<Employee> getAllEmployee() {
        List<Employee> list = new ArrayList<Employee>();

        for (int i = 0; i < 5; i++) {
            Employee emp = new Employee();
            emp.setId("学校总部员工id= " + i);
            list.add(emp);
        }
        return list;
    }

    /**
     * 完成打印的方法;
     * 这里是把另一个对象写在了方法的参数里面,属于直接朋友;
     * @param sub 另一个对象
     */
    void printAllEmployee(CollegeManager sub) {
        //打印第一个所有员工
        //这里CollegeEmployee出现在了局部变量里面,属于非直接朋友;
        List<CollegeEmployee> list1 = sub.getAllEmployee();
        System.out.println("------------分公司员工------------");
        for (CollegeEmployee e : list1) {
            System.out.println(e.getId());
        }
        //打印第二个所有员工
        List<Employee> list2 = this.getAllEmployee();
        System.out.println("------------学校总部员工------------");
        for (Employee e : list2) {
            System.out.println(e.getId());
        }
    }
}
