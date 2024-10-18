package com.lilong.design.behavioral.memento;

/**
 * @author : lilong
 * @date : 2024-10-18 22:24
 * @description : 备忘录模式：在不破坏封装性的前提下，捕获一个对象的内部状态，并保存这个内部状态，以便以后再使用或者恢复状态，
 *  备忘录模式又叫快照模式，对象行为模式
 *  使用案例：session活化钝化 ，游戏的保存，数据库的存点事务
 */
public class MainTest {
    public static void main(String[] args) {
        GameRecord gameRecord = new GameRecord(1, "new game", "暂停");
        GameServer gameServer = new GameServer();
        gameServer.addRecord(gameRecord);
        //获取上个版本
        GameRecord record = gameServer.getRecord(gameRecord.getId());
        System.out.println(record.toString());
    }
}
