package com.lilong.design.creation.factory.abstractFactory;

/**
 * @author : lilong
 * @date : 2024-09-27 21:32
 * @description :
 */
public class MiniCar extends AbstractCar {
    public MiniCar() {
        this.engine = "MiniCar发动机";
    }

    @Override
    public void run() {
        System.out.println(this.engine+"is running");
    }
}
