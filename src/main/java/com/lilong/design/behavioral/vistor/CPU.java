package com.lilong.design.behavioral.vistor;

/**
 * @author : lilong
 * @date : 2024-10-20 11:19
 * @description :
 */
public class CPU extends HardWare{

    public CPU(String command) {
        super(command);
    }

    @Override
    public void work() {
        System.out.println("CPU + is working");
    }

    @Override
    public void accept(Visitor vistor) {
            vistor.visitCPU(this);
    }
}
