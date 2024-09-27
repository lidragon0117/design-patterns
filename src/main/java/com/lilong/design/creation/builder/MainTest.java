package com.lilong.design.creation.builder;

/**
 * @author : lilong
 * @date : 2024-09-27 22:58
 * @description :
 */
public class MainTest {
    public static void main(String[] args) {
        AbstractBuilder builder = new XiaoMiPhoneBuilder();
        Phone phone = builder.customCpu("骁龙8个8")
                .customCam("2亿")
                .customDisk("1T")
                .customMem("16G")
                .getProduct();
        System.out.println(phone);
    }
}
