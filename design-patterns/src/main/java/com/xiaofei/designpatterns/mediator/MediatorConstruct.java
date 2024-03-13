package com.xiaofei.designpatterns.mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: Created by IntelliJ IDEA.
 * 实际的黑中介
 * @Author : 小肥居居头
 * @create 2024/3/13 15:49
 */


public class MediatorConstruct extends Mediator {

    /**
     * 中介维护了很多房主和租房者;
     */
    private List<HouseOwner> houseOwners = new ArrayList<>();
    private List<Tenant> tenants = new ArrayList<>();


    public MediatorConstruct setHouseOwners(HouseOwner houseOwner) {
        this.houseOwners.add(houseOwner);
        return this;
    }

    public MediatorConstruct setTenants(Tenant tenant) {
        this.tenants.add(tenant);
        return this;
    }

    /**
     * 哪个人发信息给中介;
     * @param person 租房者或房主人
     * @param message 消息
     */
    @Override
    public void communication(Person person, String message) {
        //房主人
        if (person.getClass() == HouseOwner.class){
            //设置需求
            houseOwners.forEach((h)->{
                if (h == person){
                    h.need = message;
                }
            });
            //寻找需求匹配
            tenants.forEach((t)->{
                if (t.need == message){
                    System.out.println("房主人 " + person.name + " 发出去的房子 " + message +
                            " 匹配到了 " + t.name);
                }
            });
        }
        //租房者
        if (person.getClass() == Tenant.class){
            tenants.forEach((t)->{
                if (t == person){
                    t.need = message;
                }
            });

            //寻找需求匹配
            houseOwners.forEach((h)->{
                if (h.need == message){
                    System.out.println("租客 " + person.name + " 想要 " + message +
                            " 的房子匹配到了,房东 " + h.name);
                }
            });
        }
    }
}
