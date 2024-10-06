package com.lilong.design.behavioral.mediator;

/**
 * @author : lilong
 * @date : 2024-10-06 17:18
 * @description :
 */
public class BeijingCaptain extends AbstractCaptain{

    private ControlTower controlTower;

    public BeijingCaptain(ControlTower controlTower){
        this.controlTower=controlTower;
    }
    @Override
    void fly() {
        System.out.println("北京航空公司请求起飞");
        controlTower.acceptRequest("fly",this);
    }

    @Override
    void stop() {
        System.out.println("北京航空公司请求降落");
        controlTower.acceptRequest("stop",this);
    }

    @Override
    void success() {
        System.out.println("北京航空公司请求成功");
        controlTower.acceptRequest("success",this);
    }
}
