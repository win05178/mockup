package com.mizuho.mockup;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter(filterName = "testFilter")
public class testFilter implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {

        System.out.println("test");

        chain.doFilter(req, resp);
    }

    public void init(FilterConfig config) throws ServletException {

    }

}
