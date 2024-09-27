package com.lilong.design.creation.factory.abstractFactory;

/**
 * @author : lilong
 * @date : 2024-09-27 21:42
 * @description : 抽象工厂
 */
public class MainTest {
    public static void main(String[] args) {
        AbstractCar car = new HangZhouMiniFactory().createCar();
        car.run();
        AbstractMask mask = new WuHanMaskFactory().createMask();
        mask.protectedMe();
    }
}
