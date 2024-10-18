package com.lilong.design.behavioral.command;

/**
 * @author : lilong
 * @date : 2024-10-18 23:09
 * @description :
 */
public class MainTest {
    public static void main(String[] args) {
        PublisherCommand publisherCommand = new PublisherCommand(new OnlineCommand());
        publisherCommand.call();
    }
}
