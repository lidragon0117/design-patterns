package com.lilong.design.creation.factory.factoryMethod;

/**
 * @author : lilong
 * @date : 2024-09-27 22:10
 * @description :
 */
public class WulingCar extends AbstractCar{
    public WulingCar(){
        this.engine="WulingCar";
    }
    @Override
    public void run() {
        System.out.println("WulingCar is running"+this.engine);
    }
}
