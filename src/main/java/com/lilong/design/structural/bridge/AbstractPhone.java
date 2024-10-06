package com.lilong.design.structural.bridge;

/**
 * @author : lilong
 * @date : 2024-09-29 23:22
 * @description : 桥接模式
 */
public abstract class AbstractPhone {

    //桥接在此.....设计期间就得想好
    //【真正会引起此类变化的一个维度直接抽取出来，通过组合的方式接起来】
    //桥接+适配器 ...
    //分离渠道【桥接的关注点】
    AbstractSale sale;
    /**
     * 获取手机名称
     * @return
     */
    abstract String getPhone();

    public AbstractPhone(AbstractSale sale){
        this.sale=sale;
    }
}
