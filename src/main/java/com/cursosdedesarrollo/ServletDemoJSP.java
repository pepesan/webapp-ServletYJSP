package com.cursosdedesarrollo;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by pepesan on 16/5/16.
 */
public class ServletDemoJSP extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        ServletContext sc = this.getServletContext();
        RequestDispatcher rd = sc.getRequestDispatcher("/mipagina.jsp?username=pepesan");
        try {
            rd.include(request, response);
            //rd.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        }


    }
}