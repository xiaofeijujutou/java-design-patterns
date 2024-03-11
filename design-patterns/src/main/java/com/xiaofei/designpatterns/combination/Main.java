package com.xiaofei.designpatterns.combination;

/**
 * @Description: Created by IntelliJ IDEA.
 * @Author : 小肥居居头
 * @create 2024/3/11 15:04
 */


public class Main {
    public static void main(String[] args) {
        MenuComponent systemManager = new Menu("系统管理", 1);

        MenuComponent menuManager = new Menu("菜单管理", 2);
        MenuComponent permissionManager = new Menu("权限管理", 2);
        MenuComponent userManager = new Menu("角色管理", 2);
        systemManager.add(menuManager).add(permissionManager).add(userManager);

        MenuComponent pageAccess = new MenuItem("页面访问", 3);
        MenuComponent expandMenu = new MenuItem("展开菜单", 3);
        MenuComponent editMenu = new MenuItem("编辑菜单", 3);
        MenuComponent deleteMenu = new MenuItem("删除菜单", 3);
        MenuComponent addMenu = new MenuItem("新增菜单", 3);
        menuManager.add(pageAccess).add(expandMenu).add(editMenu).add(deleteMenu).add(addMenu);

        MenuComponent saveChanges = new MenuItem("提交保存", 3);
        permissionManager.add(pageAccess).add(saveChanges);

        MenuComponent addRole = new MenuItem("新增角色", 3);
        MenuComponent editRole = new MenuItem("修改角色", 3);
        userManager.add(pageAccess).add(addRole).add(editRole);

        systemManager.printAll();
    }
}
