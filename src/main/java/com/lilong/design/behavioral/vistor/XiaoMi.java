package com.lilong.design.behavioral.vistor;

/**
 * @author : lilong
 * @date : 2024-10-20 11:29
 * @description :
 */
public class XiaoMi {
    private CPU cpu = new CPU("武汉天气");
    private Disk disk = new Disk("武汉天气");

    void answerQuestion(){
        cpu.work();
        disk.work();
    }



    //接受升级包
    public void acceptUpdate(Visitor aPackage) {
        //访问模式
        //升级CPU
        aPackage.visitCPU(cpu);
        aPackage.visitDisk(disk);
    }
}
