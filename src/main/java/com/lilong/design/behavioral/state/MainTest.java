package com.lilong.design.behavioral.state;

/**
 * @author : lilong
 * @date : 2024-10-06 12:53
 * @description :
 */
public class MainTest {
    public static void main(String[] args) {
        SKTTeam sktTeam = new SKTTeam(new BeafNodleState());
        sktTeam.start();
        sktTeam.nextState();
        sktTeam.start();
    }
}
