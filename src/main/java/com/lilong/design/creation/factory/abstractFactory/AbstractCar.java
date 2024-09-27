package com.lilong.design.creation.factory.abstractFactory;

/**
 * @author : lilong
 * @date : 2024-09-27 21:15
 * @description : 抽象类汽车  更像是定义汽车需要的哪些东西
 */
public abstract class AbstractCar {
    /**
     * 引擎
     */
    String engine;

    /**
     * 汽车怎么运行
     */
    public abstract void run();
}
