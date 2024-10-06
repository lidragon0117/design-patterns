package com.lilong.design.behavioral.state;

/**
 * @author : lilong
 * @date : 2024-10-06 12:52
 * @description : 环境类
 */
public class SKTTeam {
    private TeamStateInterface teamStateInterface;

    public SKTTeam(TeamStateInterface teamStateInterface){
        this.teamStateInterface = teamStateInterface;
    }
    public void start(){
        this.teamStateInterface.startGame();
    }
    //下一个状态
    void nextState(){
        this.teamStateInterface = teamStateInterface.next();
    }

}
