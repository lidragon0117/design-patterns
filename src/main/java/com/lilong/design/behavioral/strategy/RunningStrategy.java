package com.lilong.design.behavioral.strategy;

/**
 * @author : lilong
 * @date : 2024-10-06 12:19
 * @description :
 */
public class RunningStrategy extends AbstractStrategy{

    @Override
    void game() {
        System.out.println("Running strategy is running");
    }
}
