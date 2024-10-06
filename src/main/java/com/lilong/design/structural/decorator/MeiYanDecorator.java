package com.lilong.design.structural.decorator;

/**
 * @author : lilong
 * @date : 2024-10-06 10:29
 * @description : 适配器是连接两个类，可以增强一个类，装饰器是增强一个类
 * 向一个现有的对象添加新的功能，同时又不改变其结构。属于对象结构型模式。
 * 创建了一个装饰类，用来包装原有的类，并在保持类方法签名完整性的前提下，提供了额外的功能
 */
public class MeiYanDecorator extends AbstractDecorator{

    private ManTikTok manTikTok;
    public MeiYanDecorator(ManTikTok manTikTok){
        this.manTikTok = manTikTok;
    }

    @Override
    void enable() {
        System.out.println("看这个美女.....");
        System.out.println("花花花花花花花花花花花");
    }

    @Override
    public void tiktok() {
        manTikTok.tiktok();
        //开启美颜
        enable();

    }
}
