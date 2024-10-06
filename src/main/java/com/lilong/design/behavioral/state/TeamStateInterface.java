package com.lilong.design.behavioral.state;

/**
 * @author : lilong
 * @date : 2024-10-06 12:29
 * @description :
 */
public interface TeamStateInterface {
    /**
     * 开始游戏
     */
    void startGame();

    /**
     * 下一个节点
     */
    TeamStateInterface next();
}
