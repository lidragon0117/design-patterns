package com.lilong.design.structural.bridge;

/**
 * @author : lilong
 * @date : 2024-10-06 9:35
 * @description : 桥接模式
 */
public class MainTest {
    public static void main(String[] args) {
        AbstractPhone iphone = new Iphone(new OfflineSale("线下", 100));
        AbstractPhone miPhone = new MiPhone(new OnlineSale("线上", 100));
        System.out.println(iphone.getPhone());
        System.out.println(miPhone.getPhone());
    }
}
