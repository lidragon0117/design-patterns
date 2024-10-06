package com.lilong.design.structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : lilong
 * @date : 2024-10-06 10:42
 * @description :  使用组合模式，组织层级结构的数据
 */
public class Menu {
    private Integer id;
    private String name;

    public Menu(Integer id, String name) {
        this.id=id;
        this.name=name;
    }
    private List<Menu> childs=new ArrayList<Menu>();

    void addChild(Menu child) {
        childs.add(child);
    }
    void printChild(){
        System.out.println(name);
        if(childs.size()>0){
            for (Menu menu : childs) {
                menu.printChild();
            }
        }
    }
}
