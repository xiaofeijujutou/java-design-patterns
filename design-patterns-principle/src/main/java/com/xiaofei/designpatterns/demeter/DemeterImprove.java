package com.xiaofei.designpatterns.demeter;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: Created by IntelliJ IDEA.
 * @Author : 小肥居居头
 * @create 2024/3/2 20:17
 */


public class DemeterImprove {

    public static void main(String[] args) {
        //new一个大的
        SchoolManagerImprove schoolManagerImprove = new SchoolManagerImprove();
        //调用大的打印方法,吧小的传进去;
        schoolManagerImprove.printAllEmployeeImprove(new CollegeManagerImprove());
    }
}

/**
 * 学校总部员工实体类
 */
class EmployeeImprove {
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
class CollegeEmployeeImprove {
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
class CollegeManagerImprove {
    /**
     * 获取所有员工id(这里是循环10次模拟从dao里面查数据);
     * @return
     */
    public List<CollegeEmployeeImprove> getAllEmployeeImprove() {
        List<CollegeEmployeeImprove> list = new ArrayList<CollegeEmployeeImprove>();
        for (int i = 0; i < 10; i++) {
            CollegeEmployeeImprove emp = new CollegeEmployeeImprove();
            emp.setId("学院员工id= " + i);
            list.add(emp);
        }
        return list;
    }

    public void printEmployeeImprove() {
        List<CollegeEmployeeImprove> list1 = getAllEmployeeImprove();
        System.out.println("------------分公司员工------------");
        for (CollegeEmployeeImprove e : list1) {
            System.out.println(e.getId());
        }
    }
}

/**
 * 学校员工的管理类
 */
class SchoolManagerImprove {
    /**
     * 获取所有员工id(这里是循环10次模拟从dao里面查数据);
     * @return
     */
    public List<EmployeeImprove> getAllEmployeeImprove() {
        List<EmployeeImprove> list = new ArrayList<EmployeeImprove>();

        for (int i = 0; i < 5; i++) {
            EmployeeImprove emp = new EmployeeImprove();
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
    void printAllEmployeeImprove(CollegeManagerImprove sub) {
        //改进
        //原来这里需要用到别的对象里面的属性,然后要对这个属性进行操作,在这里写耦合度会增加;
        //方案:把获取别的对象的属性和对属性的操作封装到他本身的代码块中,对外暴露一个方法就行;
        sub.printEmployeeImprove();
        //打印第二个所有员工
        List<EmployeeImprove> list2 = this.getAllEmployeeImprove();
        System.out.println("------------学校总部员工------------");
        for (EmployeeImprove e : list2) {
            System.out.println(e.getId());
        }
    }
}
