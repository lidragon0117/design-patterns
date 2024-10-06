package com.lilong.design.behavioral.mediator;

/**
 * @author : lilong
 * @date : 2024-10-06 17:27
 * @description :
 */
public class MainTest {
    public static void main(String[] args) {
        BeijingControlTowor beijingControlTowor = new BeijingControlTowor();
        BeijingCaptain beijingCaptain = new BeijingCaptain(beijingControlTowor);
        beijingCaptain.fly();
        XiAnCaptain xiAnCaptain = new XiAnCaptain(beijingControlTowor);
        xiAnCaptain.fly();
    }
}
