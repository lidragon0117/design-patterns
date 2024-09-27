package com.lilong.design.creation.factory.abstractFactory;

/**
 * @author : lilong
 * @date : 2024-09-27 21:06
 * @description : 抽象工厂
 * 抽象工厂  是在简单工厂上的升级-更像是一个集团 只定义规章制度 不负责执行
 */
public abstract class AbstractFactory {
    /**
     * 创建车
     *
     * @return
     */
    public abstract AbstractCar createCar();

    /**
     * 生产口罩
     *
     * @return
     */

    public abstract AbstractMask createMask();
}
