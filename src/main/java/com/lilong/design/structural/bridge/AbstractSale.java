package com.lilong.design.structural.bridge;

/**
 * @author : lilong
 * @date : 2024-09-29 23:23
 * @description : 抽象销售渠道
 */
public abstract class AbstractSale {
    private String type;

    private Integer price;

    public AbstractSale(String type,Integer price){
        this.type = type;
        this.price = price;
    }

    String getSaleInfo(){
        return "渠道："+type+"==>"+"价格："+price;
    }

    void howToSale(){
        //都不一样
    }
}
