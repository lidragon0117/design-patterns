package com.lilong.design.behavioral.observer;

import java.util.List;

/**
 * @author : lilong
 * @date : 2024-10-13 20:20
 * @description :
 */
public abstract class AbstractFans {
    /**
     * 关注者
     */
    private List<AbstractTikToker> tikTokers;

    /**
     * 接収消息
     * @param msg
     */
    abstract void acceptMsg(String msg);
}
