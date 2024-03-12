package com.xiaofei.designpatterns.responsibility.filter;

/**
 * @Description: Created by IntelliJ IDEA.
 * @Author : 小肥居居头
 * @create 2024/3/12 14:38
 */
public interface Filter {
    public void doFilter(Request req, Response res, FilterChain c);
}
