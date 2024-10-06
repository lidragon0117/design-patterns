package com.lilong.design.behavioral.mediator;

/**
 * @author : lilong
 * @date : 2024-10-06 17:19
 * @description :
 */
public class BeijingControlTowor extends ControlTower{

    @Override
    void register() {

    }

    private Boolean enabled= true;
    @Override
    void acceptRequest(String  action, AbstractCaptain captain) {
        if("fly".equals(action)||"stop".equals(action)){
            //
            if(enabled == true){
                System.out.println("允许......");
                enabled = false;
            }else {
                System.out.println("不允许.....");
            }
        }
        if("success".equals(action)){
            enabled = true;
        }
    }
}
