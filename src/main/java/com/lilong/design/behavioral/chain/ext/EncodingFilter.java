package com.lilong.design.behavioral.chain.ext;

/**
 * @author : lilong
 * @date : 2024-10-20 21:27
 * @description :
 */
public class EncodingFilter implements Filter{
    @Override
    public void doFilter(Request request, Response response, FilterChain chain) {
        request.msg+=" oooo";
        System.out.println("EncodingFilter...doFilter之前");

        //放行
        chain.doFilter(request,response,chain);


        System.out.println("EncodingFilter...doFilter之后");
    }
}
