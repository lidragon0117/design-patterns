package com.lilong.design.structural.adapter;

/**
 * @author : lilong
 * @date : 2024-09-29 22:53
 * @description :
 */
public class EnglishTranslator implements Translator {

    @Override
    public void translate(String source) {
        if("你好".equals(source)){
            System.out.println("翻译之后的字幕：hello");
        }
    }
}
