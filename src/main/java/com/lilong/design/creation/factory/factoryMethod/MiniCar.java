package com.lilong.design.creation.factory.factoryMethod;

/**
 * @author : lilong
 * @date : 2024-09-27 22:06
 * @description :
 */
public class MiniCar extends AbstractCar{

    public MiniCar(){
        this.engine="MiniCar";
    }

    @Override
    public void run() {
        System.out.println("MiniCar is running"+this.engine);
    }
}
