package com.lilong.design.creation.factory.abstractFactory;

/**
 * @author : lilong
 * @date : 2024-09-27 21:41
 * @description :
 */
public class WuHanMaskFactory extends MaskFactory{

    @Override
    public AbstractMask createMask() {
        return new N95Mask();
    }
}
