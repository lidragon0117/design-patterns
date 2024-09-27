package com.lilong.design.creation.factory.abstractFactory;

/**
 * @author : lilong
 * @date : 2024-09-27 21:33
 * @description :
 */
public class WulingCar extends AbstractCar {
    public WulingCar(){
        this.engine = "v8发动机";
    }
    @Override
    public void run() {
        System.out.println(this.engine+" running");
    }
}
