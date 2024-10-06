package com.lilong.design.behavioral.state;

/**
 * @author : lilong
 * @date : 2024-10-06 12:42
 * @description :
 */
public class BeafNodleState extends TeamState{

    @Override
    public void startGame() {
        System.out.println("吃面条。。。。");
    }

    @Override
    public TeamStateInterface next() {
        return new GameState();
    }
}
