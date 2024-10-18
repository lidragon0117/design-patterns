package com.lilong.design.behavioral.command;

/**
 * @author : lilong
 * @date : 2024-10-18 23:08
 * @description :
 */
public class PublisherCommand {
    Command command;
    public PublisherCommand(Command command) {
        this.command = command;
    }
    void call(){
        command.execute();
    }
}
