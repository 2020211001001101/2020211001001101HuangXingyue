package com.HuangXingyue.lab2;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter(filterName = "HuangXingyueFilter",urlPatterns = {"/lab2/validation.jsp","/lab2/welcome.jsp"})
public class HuangXingyueFilter implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        System.out.println("HuangXingyueFilter-->before chain");
        chain.doFilter(req, resp);
        System.out.println("HuangXingyueFilter-->after chain");
    }

    public void init(FilterConfig config) throws ServletException {

    }

}
