package com.lilong.design.behavioral.vistor;

/**
 * @author : lilong
 * @date : 2024-10-20 11:18
 * @description :
 */
public abstract class Visitor {
   /**
    * 升级CPU
    * @param cpu
    */
   abstract void visitCPU(CPU cpu);

   /**
    *  升级磁盘空间
    * @param disk
    */
   abstract void visitDisk(Disk disk);
}
