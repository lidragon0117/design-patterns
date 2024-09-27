package com.lilong.design.creation.factory.abstractFactory;

/**
 * @author : lilong
 * @date : 2024-09-27 21:16
 * @description : 定义口罩的构成， 可以理解为口罩的说明书
 */
public abstract class AbstractMask {
    /**
     * 售价
     */
    public String price;

    /**
     * 保护着我
     */
    public abstract void protectedMe();
}
