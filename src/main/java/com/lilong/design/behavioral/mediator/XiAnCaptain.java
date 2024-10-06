package com.lilong.design.behavioral.mediator;

/**
 * @author : lilong
 * @date : 2024-10-06 17:25
 * @description :
 */
public class XiAnCaptain extends AbstractCaptain{

    private ControlTower controlTower;
    public XiAnCaptain(ControlTower controlTower){
        this.controlTower= controlTower;
    }
    @Override
    void fly() {
        System.out.println("西北航空公司请求起飞");
        controlTower.acceptRequest("fly",this);
    }

    @Override
    void stop() {
        System.out.println("西北航空公司请求迫降");
        controlTower.acceptRequest("stop",this);
    }

    @Override
    void success() {
        System.out.println("西北航空公司请求入库");
        controlTower.acceptRequest("success",this);
    }
}
