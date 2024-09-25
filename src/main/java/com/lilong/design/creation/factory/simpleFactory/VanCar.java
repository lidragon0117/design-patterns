package com.lilong.design.creation.factory.simpleFactory;

/**
 * @author : lilong
 * @date : 2024-09-25 23:38
 * @description :
 */
public class VanCar extends Car{

    public VanCar(){
        this.engine="Van";
    }
    @Override
    public void run() {
        System.out.println("Van Car is running");
    }
}
