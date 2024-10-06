package com.lilong.design.template;

/**
 * @author : lilong
 * @date : 2024-10-06 11:29
 * @description :
 */
public abstract class AbstractTemplate {
    public void cook(){
        //定义算法步骤
        heating();   //v
        addfood();
        addsalt();
        stirfry();   //v
        end();      //v
    }

    //加热方法
    public void heating(){
        System.out.println("开火...");
    };

    //添加食物
    public abstract void addfood();

    //加盐
    public abstract void addsalt();

    //翻炒
    public  void stirfry(){
        System.out.println("翻炒中...");
    };

    //出锅
    public  void end(){
        System.out.println("出锅....");
    };

}
