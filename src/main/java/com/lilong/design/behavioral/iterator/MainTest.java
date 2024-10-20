package com.lilong.design.behavioral.iterator;

/**
 * @author : lilong
 * @date : 2024-10-20 10:48
 * @description :
 */
public class MainTest {
    public static void main(String[] args) {
        BeautifulMan beautifulMan = new Lilong();
        beautifulMan.love("张三");
        beautifulMan.love("张四");
        beautifulMan.love("张五");
        BeautifulMan.Itr itr = beautifulMan.getIterator();
        boolean b = itr.hasNext();
        System.out.println(b);
    }
}
