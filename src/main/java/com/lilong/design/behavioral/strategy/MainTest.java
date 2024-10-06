package com.lilong.design.behavioral.strategy;

/**
 * @author : lilong
 * @date : 2024-10-06 12:21
 * @description :
 */
public class MainTest {
    public static void main(String[] args) {
        WarStrategy warStrategy = new WarStrategy();
        GamePlatform gamePlatform = new GamePlatform(warStrategy);
        gamePlatform.startGame();
    }
}
