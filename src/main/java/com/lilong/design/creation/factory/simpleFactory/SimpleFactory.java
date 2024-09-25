package com.lilong.design.creation.factory.simpleFactory;

/**
 * @author : lilong
 * @date : 2024-09-25 23:35
 * @description : 简单工厂 :在产品数量及其少的情况下可以使用 违反开闭原则
 */
public class SimpleFactory {
    /**
     * 创建 一个类，不管什么产品均可以使用该类创建一个车 ，缺点： 更多的产品，违反开闭原则。应该直接扩展出一个类来造
     * @param engine
     * @return
     */
    public Car createCar(String engine){
        Car car=null;
        if("MiniCar".equals(engine)){
            car= new MiniCar();
        }else if("MiniCar".equals(engine)){
            car= new MiniCar();
        }
        // 当产品过多的时候，要不断在这加
        return car;
    }
}
