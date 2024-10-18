package com.lilong.design.behavioral.interpreter;

/**
 * @author : lilong
 * @date : 2024-10-18 22:48
 * @description :
 */
public class MainTest {
    public static void main(String[] args) {
        Area area = new Area();
        /**
         *  上海市：张文宏-医生
         *  武汉市:雷丰阳-程序员
         *  北京市：宋宋-老人
         */
        String sr = "武汉市:张三丰-程序员";
        area.getTicket(sr);
    }

}
