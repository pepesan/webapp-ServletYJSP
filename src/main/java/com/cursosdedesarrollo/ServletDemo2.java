package com.cursosdedesarrollo;

import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by pepesan on 16/5/16.
 */
public class ServletDemo2 extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        PrintWriter out = response.getWriter();
        out.println("<h1>Hello Servlet 2 Get</h1>");
        if (request.getAttribute("user")!=null){
            String user=request.getAttribute("user").toString();
            out.println("<h1>User: "+user+"</h1>");
        }else{
            out.println("No user attribute");
        }



    }
}