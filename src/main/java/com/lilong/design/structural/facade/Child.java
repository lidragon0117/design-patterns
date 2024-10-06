package com.lilong.design.structural.facade;

/**
 * @author : lilong
 * @date : 2024-10-06 11:12
 * @description :
 */
public class Child {
    public void child(Person person){
        System.out.println(person.getName()+"给孩子办理");
    }
}
