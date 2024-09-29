package com.lilong.design.structural.adapter.obj;

import com.lilong.design.structural.adapter.EnglishTranslator;
import com.lilong.design.structural.adapter.MoviePlayer;
import com.lilong.design.structural.adapter.Translator;

/**
 * @author : lilong
 * @date : 2024-09-29 22:55
 * @description : 组合的方式：对象结构模型，适配转换到了翻译器的功能上
 */
public class EnglishMoviePlayerAdapter implements MoviePlayer {


    private MoviePlayer player;
    private Translator translator=new EnglishTranslator();
    public EnglishMoviePlayerAdapter(MoviePlayer player){
        this.player=player;
    }

    @Override
    public String playMovie() {
        String movie = player.playMovie();
        // 翻译字幕
        translator.translate(movie);
        return movie;
    }
}
