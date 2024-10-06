package com.lilong.design.structural.facade;

/**
 * @author : lilong
 * @date : 2024-10-06 11:13
 * @description :
 */
public class MainTest {
    public static void main(String[] args) {
        new WeChatFacade(new Person("张三")).handle();
    }
}
