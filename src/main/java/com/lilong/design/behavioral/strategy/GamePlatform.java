package com.lilong.design.behavioral.strategy;

/**
 * @author : lilong
 * @date : 2024-10-06 12:19
 * @description :
 */
public class GamePlatform {
    private AbstractStrategy abstractStrategy;
    public GamePlatform(AbstractStrategy abstractStrategy){
        this.abstractStrategy=abstractStrategy;
    }
    public void startGame(){
        abstractStrategy.game();
    }
}
