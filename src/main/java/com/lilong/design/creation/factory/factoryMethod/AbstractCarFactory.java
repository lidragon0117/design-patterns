package com.lilong.design.creation.factory.factoryMethod;

/**
 * @author : lilong
 * @date : 2024-09-27 21:53
 * @description : 抽象 可以是 抽象类，也可以是接口
 */
public abstract class AbstractCarFactory {
    /**
     * 创建汽车
     * @return
     */
    public abstract AbstractCar createCar();
}
