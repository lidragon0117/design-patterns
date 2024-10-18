package com.lilong.design.behavioral.command;

import java.util.List;

/**
 * @author : lilong
 * @date : 2024-10-18 23:05
 * @description :
 */
public class OnlineCommand extends Command{
    LiLeiReceiver leiReceiver=new LiLeiReceiver();
    @Override
    void execute() {
        leiReceiver.learn();
    }
}
