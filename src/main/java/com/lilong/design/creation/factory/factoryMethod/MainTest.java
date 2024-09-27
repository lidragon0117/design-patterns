package com.lilong.design.creation.factory.factoryMethod;

/**
 * @author : lilong
 * @date : 2024-09-27 22:15
 * @description :  工厂方法： 系统复杂度增加，产品单一   工厂方法与抽象工厂的区别在于，工厂方法产品单一，当抽象工厂一个工厂只生产一个
 * 产品就是工厂方法   工厂方法抽象工厂与具体工厂合并，并采用统一的工厂来创建 同时采用静态方法提供，， 即为简单工厂
 */
public class MainTest {
    public static void main(String[] args) {
        AbstractCar car = new WulingCarFactory().createCar();
        car.run();
        AbstractCar car1 = new MiniCarFactory().createCar();
        car1.run();
    }
}
