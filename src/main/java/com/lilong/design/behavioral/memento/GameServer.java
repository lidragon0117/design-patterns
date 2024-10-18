package com.lilong.design.behavioral.memento;

import java.util.HashMap;
import java.util.Map;

/**
 * @author : lilong
 * @date : 2024-10-18 22:20
 * @description : 游戏服务器
 */
public class GameServer {

    Map<Integer,GameRecord> records = new HashMap<Integer,GameRecord>();

    public void addRecord(GameRecord record){
        records.put(record.getId(),record);
    }

    public GameRecord getRecord(Integer id){
       return records.getOrDefault(id,null);
    }
}
