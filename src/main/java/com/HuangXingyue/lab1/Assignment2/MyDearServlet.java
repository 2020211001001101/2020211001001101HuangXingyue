package com.HuangXingyue.lab1.Assignment2;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "MyDearServlet",value = "/myDear")
public class MyDearServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String name=request.getParameter("name");
        String cla=request.getParameter("Class");
        String id=request.getParameter("id");
        request.setAttribute("id",id);
        request.setAttribute("cla",cla);
        request.setAttribute("name",name);
        request.getRequestDispatcher("lab1/MyDearJsp.jsp").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("lab1/MyJsp1.jsp").forward(request,response);
    }
}


