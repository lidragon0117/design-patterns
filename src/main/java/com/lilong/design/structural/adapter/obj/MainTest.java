package com.lilong.design.structural.adapter.obj;

import com.lilong.design.structural.adapter.ChineseMovie;

/**
 * @author : lilong
 * @date : 2024-09-29 22:58
 * @description :
 */
public class MainTest {
    public static void main(String[] args) {
        EnglishMoviePlayerAdapter englishMoviePlayerAdapter = new EnglishMoviePlayerAdapter(new ChineseMovie());
        englishMoviePlayerAdapter.playMovie();
    }
}
