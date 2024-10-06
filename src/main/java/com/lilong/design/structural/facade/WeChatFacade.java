package com.lilong.design.structural.facade;

/**
 * @author : lilong
 * @date : 2024-10-06 11:13
 * @description :
 */
public class WeChatFacade {
    private Person person;

    public WeChatFacade(Person person) {
        this.person = person;
    }
     public void handle(){
        new Edu().createEdu(person);
        new Police().police(person);
        new Child().child(person);
    }
}
