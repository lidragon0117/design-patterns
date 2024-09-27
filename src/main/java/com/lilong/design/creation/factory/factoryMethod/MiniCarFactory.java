package com.lilong.design.creation.factory.factoryMethod;

/**
 * @author : lilong
 * @date : 2024-09-27 22:14
 * @description :
 */
public class MiniCarFactory extends AbstractCarFactory{

    @Override
    public AbstractCar createCar() {
        return new MiniCar();
    }
}
