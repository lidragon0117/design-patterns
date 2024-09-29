package com.lilong.design.structural.adapter;

/**
 * @author : lilong
 * @date : 2024-09-29 22:48
 * @description : 翻译器，进行字幕翻译
 */
public interface Translator {
    /**
     * 翻译实现方式
     * @param source
     */
    void translate(String source);
}
