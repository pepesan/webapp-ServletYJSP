package com.cursosdedesarrollo;

import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by pepesan on 16/5/16.
 */
public class ServletDemo extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<body>");
        out.println("<h1>Hello Servlet Get</h1>");
        PrintWriter pw = response.getWriter();
        pw.println(getServletConfig().getInitParameter("email"));
        pw.println(getServletContext().getInitParameter("email2"));
        HttpSession session = request.getSession();
        if(session.isNew()){
            pw.println("New session is just created");
        }else{
            pw.println("This is old session");
        }
        session = request.getSession(false);
        if(session ==null){
            pw.println("No session available");
        }else{
            pw.println("This is old session");
        }
        session.setMaxInactiveInterval(20*60);
        Cookie cookie = new Cookie("url","http://cursosdedesarrollo.com/");
        cookie.setMaxAge(60*60); //1 hour
        response.addCookie(cookie);
        session.setAttribute("app","Valor");
        pw.println("Cookies created");
        out.println("<a href='/Demo2'>Enlace a /Demo2</a>");
        out.println("</body>");
        out.println("</html>");


    }
}