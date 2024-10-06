package com.lilong.design.behavioral.mediator;

/**
 * @author : lilong
 * @date : 2024-10-06 13:00
 * @description : 塔台 -- 即为中介者
 */
public abstract class ControlTower {
    abstract void register();
    abstract void acceptRequest(String  action, AbstractCaptain captain);
}
