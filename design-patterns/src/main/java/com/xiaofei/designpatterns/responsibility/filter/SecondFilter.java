package com.xiaofei.designpatterns.responsibility.filter;

/**
 * @Description: Created by IntelliJ IDEA.
 * @Author : 小肥居居头
 * @create 2024/3/12 14:38
 */
public class SecondFilter implements Filter {
    public void doFilter(Request req, Response res, FilterChain chain) {
        System.out.println("过滤器2 前置处理");

        // 先执行所有request再倒序执行所有response
        chain.doFilter(req, res);

        System.out.println("过滤器2 后置处理");
    }
}
