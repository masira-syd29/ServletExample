package com.example;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class HelloServlets extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        System.out.println("Welcome to service! ");
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("<h2><b>Hello Client!</b></h2>");
    }
}
