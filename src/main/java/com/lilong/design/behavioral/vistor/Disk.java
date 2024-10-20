package com.lilong.design.behavioral.vistor;

/**
 * @author : lilong
 * @date : 2024-10-20 11:25
 * @description :
 */
public class Disk extends HardWare{

    public Disk(String command) {
        super(command);
    }

    @Override
    public void work() {
        System.out.println("Disk is working");
    }

    @Override
    public void accept(Visitor vistor) {
        vistor.visitDisk(this);
    }
}
