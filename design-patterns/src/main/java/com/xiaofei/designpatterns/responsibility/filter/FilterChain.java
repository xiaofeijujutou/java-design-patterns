package com.xiaofei.designpatterns.responsibility.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: Created by IntelliJ IDEA.
 * @Author : 小肥居居头
 * @create 2024/3/12 14:38
 */
public class FilterChain { //过滤器链

    private List<Filter> filters = new ArrayList<Filter>();

    private int index = 0;

    // 链式调用
    public FilterChain addFilter(Filter filter) {
        this.filters.add(filter);
        return this;
    }

    /**
     * 这是过滤器,不是拦截器,所以无论什么请求都会给放行;
     * 在Filter里面调用doFilter这个方法的意思是:
     *      1,放行
     *      2,先执行下一个Filter里面的所有操作,执行完了之后再返回来执行本Filter剩下的操作;
     * @param request
     * @param response
     */
    public void doFilter(Request request, Response response) {
        if (index == filters.size()) {
            return;
        }
        Filter filter = filters.get(index);
        index++;
        filter.doFilter(request, response, this);
    }
}
