package com.lilong.design.structural.adapter.clazz;

import com.lilong.design.structural.adapter.ChineseMovie;

/**
 * @author : lilong
 * @date : 2024-09-29 22:58
 * @description :
 */
public class MainTest {
    public static void main(String[] args) {
        // 外国人也是通过配适器模式
        EnglishMoviePlayerAdapter englishMoviePlayerAdapter = new EnglishMoviePlayerAdapter(new ChineseMovie());
        englishMoviePlayerAdapter.playMovie();
    }
}
