package com.lilong.design.behavioral.chain.ext;

/**
 * @author : lilong
 * @date : 2024-10-20 21:26
 * @description :
 */
public class HttpFilter implements Filter {
    @Override
    public void doFilter(Request request, Response response, FilterChain chain) {
        //第一个filter的功能
        request.msg+=">>>";

        System.out.println("HttpFilter...doFilter之前");

        //放行
        chain.doFilter(request,response,chain);


        System.out.println("HttpFilter...doFilter之后");
    }
}
