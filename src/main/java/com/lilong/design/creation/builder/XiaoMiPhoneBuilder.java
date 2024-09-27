package com.lilong.design.creation.builder;

/**
 * @author : lilong
 * @date : 2024-09-27 22:48
 * @description :
 */
public class XiaoMiPhoneBuilder extends AbstractBuilder{

    public XiaoMiPhoneBuilder(){
        this.phone=new Phone();
    }

    @Override
    AbstractBuilder customCpu(String cpu) {
        this.phone.cpu=cpu;
        return this;
    }

    @Override
    AbstractBuilder customMem(String mem) {
        this.phone.mem=mem;
        return this;
    }

    @Override
    AbstractBuilder customDisk(String disk) {
        this.phone.disk=disk;
        return this;
    }

    @Override
    AbstractBuilder customCam(String cam) {
        this.phone.cam=cam;
        return this;
    }
}
