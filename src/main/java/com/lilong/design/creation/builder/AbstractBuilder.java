package com.lilong.design.creation.builder;

/**
 * @author : lilong
 * @date : 2024-09-27 22:47
 * @description :
 */
public abstract class AbstractBuilder {
    Phone phone;
    abstract AbstractBuilder customCpu(String cpu);
    abstract AbstractBuilder customMem(String mem);
    abstract AbstractBuilder customDisk(String disk);
    abstract AbstractBuilder customCam(String cam);

    Phone getProduct(){
        return phone;
    }
}
