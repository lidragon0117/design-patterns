package com.lilong.design.structural.adapter;

/**
 * @author : lilong
 * @date : 2024-09-29 22:46
 * @description :
 */
public class MainTest {
    public static void main(String[] args) {
        ChineseMovie chineseMovie = new ChineseMovie();
        // 中国人看中国电影
        chineseMovie.playMovie();
        // 外国人想看中国电影，需要加英文字母,这时候就用配适器进行转换

    }
}
