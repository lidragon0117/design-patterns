package com.lilong.design.behavioral.vistor;

/**
 * @author : lilong
 * @date : 2024-10-20 11:17
 * @description :
 */
public abstract class HardWare {
     String command;
    public HardWare(String command){
        this.command = command;
    }

    /**
     * 收到命令以后进行工作
     */
    abstract public void work();

    /**
     * 定义接受软件升级包的方法。这个方法应该具体硬件去实现
     * @param vistor
     */
    abstract public void accept(Visitor vistor);

}
