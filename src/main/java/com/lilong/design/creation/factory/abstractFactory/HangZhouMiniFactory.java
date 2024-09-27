package com.lilong.design.creation.factory.abstractFactory;

/**
 * @author : lilong
 * @date : 2024-09-27 21:37
 * @description :
 */
public class HangZhouMiniFactory extends MiniFactory{

    @Override
    public AbstractCar createCar() {
        return new MiniCar();
    }
}
