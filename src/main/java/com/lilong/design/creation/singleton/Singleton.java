package com.lilong.design.creation.singleton;

/**
 * @author : lilong
 * @date : 2024-09-25 23:13
 * @description : 单例模式
 */
public class Singleton {

     //单例只创建一个
    private Singleton(){

    }
    // 单例模式分为懒汉、与饿汉
    /**
     * 什么叫懒汉： 就是只有在使用的时候才加载
     * 什么叫恶汉： 就是不管使用不使用均加载
     *
     */
    // 饿汉
    //private static final Singleton instance=new Singleton();
    // 懒汉 volatile 主要是保证在创建对象，分配对象的分步过程中有其他线程创建
    private static volatile Singleton instance;
    // 锁不加在方法上的原因是锁比较慢，范围小好
    public static Singleton getInstance() {
        // 双检锁
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

}
/**
 * 单线程的使用场景：
 *      池化思想：
 *          多线程线程池、数据库连接池
 *      系统配置信息 ，System类
 *      应用上下文
 */
