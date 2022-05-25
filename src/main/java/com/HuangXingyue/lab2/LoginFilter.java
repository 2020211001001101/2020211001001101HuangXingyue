package com.HuangXingyue.lab2;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebFilter(filterName = "LoginFilter",urlPatterns = {"/lab2/validation.jsp","/lab2/welcome.jsp"})
//if filter validate,it will loop redirect to login.jsp
public class LoginFilter implements Filter {

    public void init(FilterConfig config) throws ServletException {
        System.out.println("i am in LoginFilter--init()");
    }

    public void destroy() {
        System.out.println("i am in LoginFilter--destroy()");
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        System.out.println("i am in LoginFilter--doFilter()-- request before chain()");
        HttpServletRequest request= (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) resp;
        HttpSession session=request.getSession();
//        if (request.getSession(false)!=null&&request.getSession(false).isNew()) {
//            request.getRequestDispatcher("welcome.jsp").forward(request,response);
//        }
        if(session.getAttribute("user")==null){
            request.getRequestDispatcher("login.jsp").forward(request,response);
        }
//        else {
//            response.sendRedirect("login.jsp");
//            return;//to resolve the error java.lang.IllegalStateException
//        }
        chain.doFilter(request, response);
        System.out.println("i am in LoginFilter--destroy()-- response after chain()");
    }


}