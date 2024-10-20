package com.lilong.design.behavioral.vistor;

/**
 * @author : lilong
 * @date : 2024-10-20 11:28
 * @description :
 */
public class UpdatePackage extends Visitor{

    private String ext;
    public  UpdatePackage(String ext){
        this.ext = ext;
    }

    @Override
    public void visitDisk(Disk disk) {
        disk.command += " >>> "+ext;
    }

    @Override
    public void visitCPU(CPU cpu) {
        //改属性为例
        cpu.command += ">>>> "+ext;
        //装饰模式。改方法
    }

}
