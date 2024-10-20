package com.lilong.design.behavioral.chain;

/**
 * @author : lilong
 * @date : 2024-10-20 21:21
 * @description :
 */
public class MainTest {
    public static void main(String[] args) {
        Teacher leifengyang = new Teacher("Leifengyang");
        Teacher xiaokui = new Teacher("xiaokui");
        Teacher mengmeng = new Teacher("mengmeng");
        leifengyang.setNext(xiaokui);
        xiaokui.setNext(mengmeng);
        leifengyang.handleRequest();
    }
}
