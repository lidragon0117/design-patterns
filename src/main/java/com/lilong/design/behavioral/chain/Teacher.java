package com.lilong.design.behavioral.chain;

/**
 * @author : lilong
 * @date : 2024-10-20 21:19
 * @description :
 */
public class Teacher {

    private String name;


    //下一个处理的老师；1、链条的引用点
    private Teacher next;


    public Teacher(String name) {
        this.name = name;
    }


    public void setNext(Teacher next) {
        this.next = next;
    }

    public Teacher getNext() {
        return next;
    }

    void handleRequest() {
        System.out.println(this + "正在处理.....");
        //2、下一个继续
        if (next != null)
            next.handleRequest();
    }

    ;

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                '}';
    }
}
