package com.lilong.design.behavioral.strategy;

/**
 * @author : lilong
 * @date : 2024-10-06 12:16
 * @description :
 */
public class StopStrategy extends AbstractStrategy{

    @Override
    void game() {
        System.out.println("Stop strategy is running");
    }
}
