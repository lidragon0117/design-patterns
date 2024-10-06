package com.lilong.design.structural.bridge;

/**
 * @author : lilong
 * @date : 2024-10-06 9:30
 * @description :
 */
public class Iphone extends AbstractPhone {

    public Iphone(AbstractSale sale) {
        super(sale);
    }

    @Override
    String getPhone() {
        System.out.println("苹果手机"+sale.getSaleInfo());
        return "苹果手机"+sale.getSaleInfo();
    }
}
