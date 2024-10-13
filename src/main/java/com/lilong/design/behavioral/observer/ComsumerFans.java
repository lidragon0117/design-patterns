package com.lilong.design.behavioral.observer;

/**
 * @author : lilong
 * @date : 2024-10-13 20:25
 * @description :
 */
public class ComsumerFans extends AbstractFans{

    @Override
    void acceptMsg(String msg) {
        System.out.println("主播说"+msg);
    }
}
