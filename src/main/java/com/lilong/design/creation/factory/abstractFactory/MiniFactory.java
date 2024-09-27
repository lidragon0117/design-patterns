package com.lilong.design.creation.factory.abstractFactory;

/**
 * @author : lilong
 * @date : 2024-09-27 21:13
 * @description : mini汽车制造厂
 */
public abstract class MiniFactory extends AbstractFactory {


    @Override
    public AbstractMask createMask() {
        return null;
    }
}
