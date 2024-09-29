package com.lilong.design.structural.adapter;

/**
 * @author : lilong
 * @date : 2024-09-29 22:45
 * @description :
 */
public class ChineseMovie implements MoviePlayer{

    @Override
    public String playMovie() {
        System.out.println("播放电影：你好,world");
        String content = "你好";
        //并且打印出字幕
        System.out.println(content);
        return content;
    }
}
