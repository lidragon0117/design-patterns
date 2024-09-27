package com.lilong.design.creation.factory.factoryMethod;

/**
 * @author : lilong
 * @date : 2024-09-27 22:12
 * @description :
 */
public class WulingCarFactory extends AbstractCarFactory{

    @Override
    public AbstractCar createCar() {
        return new WulingCar();
    }
}
