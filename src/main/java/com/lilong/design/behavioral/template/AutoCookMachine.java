package com.lilong.design.behavioral.template;

/**
 * @author : lilong
 * @date : 2024-10-06 11:37
 * @description :
 */
public class AutoCookMachine extends AbstractTemplate{

    @Override
    public void addfood() {
        System.out.println("放入食物");
    }

    @Override
    public void addsalt() {
        System.out.println("放盐");
    }
}
