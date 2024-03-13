package com.xiaofei.designpatterns.mediator;

/**
 * @Description: Created by IntelliJ IDEA.
 * @Author : 小肥居居头
 * @create 2024/3/13 14:47
 */


public class Main {
    public static final String HOUSE1 = "一室一厅";
    public static final String HOUSE2 = "一室两厅";
    public static final String HOUSE3 = "一室三厅";
    public static final String HOUSE4 = "两室一厅";
    public static final String HOUSE5 = "两室两厅";
    public static final String HOUSE6 = "三室一厅";
    public static final String HOUSE7 = "三室两厅";

    public static void main(String[] args) {
        MediatorConstruct mediator = new MediatorConstruct();
        Tenant tenant0 = new Tenant("张0", mediator);
        Tenant tenant1 = new Tenant("张1", mediator);
        Tenant tenant2 = new Tenant("张2", mediator);
        Tenant tenant3 = new Tenant("张3", mediator);
        Tenant tenant4 = new Tenant("张4", mediator);
        Tenant tenant5 = new Tenant("张5", mediator);
        Tenant tenant6 = new Tenant("张6", mediator);
        HouseOwner house0 = new HouseOwner("李0", mediator);
        HouseOwner house1 = new HouseOwner("李1", mediator);
        HouseOwner house2 = new HouseOwner("李2", mediator);
        HouseOwner house3 = new HouseOwner("李3", mediator);
        HouseOwner house4 = new HouseOwner("李4", mediator);
        HouseOwner house5 = new HouseOwner("李5", mediator);
        HouseOwner house6 = new HouseOwner("李6", mediator);
        mediator.setTenants(tenant0).setTenants(tenant1).setTenants(tenant2).setTenants(tenant3)
                .setTenants(tenant4).setTenants(tenant5).setTenants(tenant6);
        mediator.setHouseOwners(house0).setHouseOwners(house1).setHouseOwners(house2).setHouseOwners(house3)
                .setHouseOwners(house4).setHouseOwners(house5).setHouseOwners(house6);
        tenant0.sendMessages(HOUSE6);
        tenant1.sendMessages(HOUSE1);
        tenant2.sendMessages(HOUSE2);
        tenant3.sendMessages(HOUSE3);
        tenant4.sendMessages(HOUSE4);
        tenant5.sendMessages(HOUSE5);

        house2.sendMessages(HOUSE3);
        house3.sendMessages(HOUSE1);
        house4.sendMessages(HOUSE6);
        house5.sendMessages(HOUSE2);
        house6.sendMessages(HOUSE4);

    }
}
