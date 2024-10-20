package com.lilong.design.behavioral.chain.ext;

/**
 * @author : lilong
 * @date : 2024-10-20 21:26
 * @description :
 */
public class MainTest {
    public static void main(String[] args) {
        FilterChain chain = new FilterChain();

        //web.xml =- filter
        HttpFilter filter = new HttpFilter();
        CharacterFilter characterFilter = new CharacterFilter();
        EncodingFilter encodingFilter = new EncodingFilter();
        chain.addFilter(filter);
        chain.addFilter(characterFilter);
        chain.addFilter(encodingFilter);


        chain.setTarget(new My());

        //filter如何链式执行。

        chain.doFilter(new Request("hello world"),
                new Response("adhkjasdhak"),chain);


    }
}
