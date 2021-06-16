package com.harsh.case4_10.config;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;
import java.util.logging.LogRecord;

@WebFilter
public class MyFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("MyFilter>>>init");
    }

    @Override
    public void destroy() {
        System.out.println("MyFilter>>>destroy");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("MyFilter>>>doFilter");
        filterChain.doFilter(servletRequest, servletResponse);
    }
}
