package com.it.servlet;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;
import javax.servlet.http.*;

/**
 * @author Howe Hsiang
 */
@WebServlet("/HelloWorld")
public class HelloWorldServlet extends HttpServlet{
    private String message;

    @Override
    public void init() throws ServletException
    {
        // 初始化
        message = "Hello World, First Servlet!";
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 设置:响应内容类型
        response.setContentType("text/html");

        // 输出文本
        PrintWriter out = response.getWriter();
        out.write("<h1> " + message + " </h1>");
    }
}
