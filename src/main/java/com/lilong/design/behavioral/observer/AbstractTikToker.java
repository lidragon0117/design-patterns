package com.lilong.design.behavioral.observer;

/**
 * @author : lilong
 * @date : 2024-10-13 20:19
 * @description : tikToker 抽象类
 */
public abstract class AbstractTikToker {
    /**
     * 添加粉丝
     *
     * @param fans
     */
    abstract void addFans(AbstractFans fans);

    /**
     * 通知粉丝
     */
    abstract void notifyFans(String msg);
}
