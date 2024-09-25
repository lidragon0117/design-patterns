package com.lilong.design.creation.factory.simpleFactory;

/**
 * @author : lilong
 * @date : 2024-09-25 23:40
 * @description :
 */
public class MiniCar extends Car{
    public MiniCar(){
        this.engine="MiniCar";
    }

    @Override
    public void run() {
        System.out.println("MinCar is running");
    }
}
