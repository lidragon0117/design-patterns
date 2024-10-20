package com.lilong.design.behavioral.chain.ext;

/**
 * @author : lilong
 * @date : 2024-10-20 21:26
 * @description :
 */
public class CharacterFilter implements Filter{
    @Override
    public void doFilter(Request request, Response response, FilterChain chain) {
        //功能
        request.msg +=" ====";

        System.out.println("CharacterFilter...doFilter之前");

        //放行
        chain.doFilter(request,response,chain);


        System.out.println("CharacterFilter...doFilter之后");
    }
}
