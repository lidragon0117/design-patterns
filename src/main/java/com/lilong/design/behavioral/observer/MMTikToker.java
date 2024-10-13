package com.lilong.design.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : lilong
 * @date : 2024-10-13 20:23
 * @description :
 */
public class MMTikToker extends AbstractTikToker {

    List<AbstractFans> fansList = new ArrayList<>();

    @Override
    void addFans(AbstractFans fans) {
        fansList.add(fans);
    }

    /**
     * 通知所有消费者
     *
     * @param msg
     */
    @Override
    void notifyFans(String msg) {
        for (AbstractFans abstractFans : fansList) {
            abstractFans.acceptMsg(msg);
        }
    }
}
