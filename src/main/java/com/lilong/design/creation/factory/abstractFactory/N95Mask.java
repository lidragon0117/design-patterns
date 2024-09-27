package com.lilong.design.creation.factory.abstractFactory;

/**
 * @author : lilong
 * @date : 2024-09-27 21:41
 * @description :
 */
public class N95Mask extends AbstractMask{
    public N95Mask(){
        this.price="100";
    }
    @Override
    public void protectedMe() {
        System.out.println("this mask is protected me"+this.price);
    }
}
