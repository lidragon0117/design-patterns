package com.lilong.design.structural.decorator;

/**
 * @author : lilong
 * @date : 2024-10-06 10:35
 * @description :
 */
public class MainTest {
    public static void main(String[] args) {
        MeiYanDecorator meiYanDecorator = new MeiYanDecorator(new LeiTikTok());
        meiYanDecorator.tiktok();
    }
}
