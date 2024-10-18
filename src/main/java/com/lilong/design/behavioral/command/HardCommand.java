package com.lilong.design.behavioral.command;

/**
 * @author : lilong
 * @date : 2024-10-18 23:07
 * @description :
 */
public class HardCommand extends Command{
    LiLeiReceiver leiReceiver=new LiLeiReceiver();
    @Override
    void execute() {
        leiReceiver.run();
    }
}
