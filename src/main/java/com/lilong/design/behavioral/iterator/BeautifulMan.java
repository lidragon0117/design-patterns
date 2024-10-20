package com.lilong.design.behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : lilong
 * @date : 2024-10-19 11:00
 * @description :
 */
public abstract class BeautifulMan {
    private List<String> manList=new ArrayList<String>();

    public void love(String name){
        manList.add(name);
    }
    public void noLove(String name){
        manList.remove(name);
    }
    public class Iterator implements  Itr{
         int index=0;
        @Override
        public boolean hasNext() {
            return index<manList.size();
        }

        @Override
        public String next() {
            return manList.get(index++);
        }

        @Override
        public String firstLove() {
            return manList.get(0);
        }

        @Override
        public String current() {
            return manList.get(manList.size()-1);
        }
    }
    /**
     * 获取迭代器
     * @return
     */
    public Itr getIterator(){
        return new Iterator();
    }
    interface  Itr{
        //有没有下一个
        boolean hasNext();
        //返回下一个
        String next();

        //返回初恋（第一个）
        String firstLove();

        //返回现任（最后一个女朋友）
        String current();
    }
}
