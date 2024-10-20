package com.lilong.design.behavioral.chain.ext;

/**
 * @author : lilong
 * @date : 2024-10-20 21:22
 * @description :
 */
public interface Filter {
    void doFilter(Request request,Response response,FilterChain chain);
}
