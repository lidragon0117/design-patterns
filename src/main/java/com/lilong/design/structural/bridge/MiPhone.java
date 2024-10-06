package com.lilong.design.structural.bridge;

/**
 * @author : lilong
 * @date : 2024-10-06 9:34
 * @description :
 */
public class MiPhone extends AbstractPhone{

    public MiPhone(AbstractSale sale) {
        super(sale);
    }

    @Override
    String getPhone() {
        return "小米手机"+sale.getSaleInfo();
    }
}
