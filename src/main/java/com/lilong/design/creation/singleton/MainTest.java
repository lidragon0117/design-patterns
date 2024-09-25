package com.lilong.design.creation.singleton;

import java.util.Properties;

/**
 * @author : lilong
 * @date : 2024-09-25 23:30
 * @description :
 */
public class MainTest {
    public static void main(String[] args) {
        Singleton obj = Singleton.getInstance();
        System.out.println(obj);
        Properties properties = System.getProperties();
        System.out.println(properties);
    }
}
