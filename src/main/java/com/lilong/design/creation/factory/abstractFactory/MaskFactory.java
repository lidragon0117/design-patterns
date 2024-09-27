package com.lilong.design.creation.factory.abstractFactory;

/**
 * @author : lilong
 * @date : 2024-09-27 21:38
 * @description :
 */
public abstract class MaskFactory  extends AbstractFactory{
    @Override
    public abstract AbstractMask createMask();

    @Override
    public AbstractCar createCar() {
        return null;
    }
}
