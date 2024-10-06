package com.lilong.design.behavioral.state;

/**
 * @author : lilong
 * @date : 2024-10-06 12:41
 * @description :
 */
public class GameState extends TeamState{

    @Override
    public void startGame() {
        System.out.println("游戏状态");
    }

    @Override
    public TeamStateInterface next() {
        return new BeafNodleState();
    }
}
