package com.cursosdedesarrollo;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * Created by pepesan on 16/5/16.
 */
public class MyAppServletContextListener  implements ServletContextListener {


    public void contextDestroyed(ServletContextEvent arg0) {
        System.out.println("ServletContextListener destroyed");
    }

    //Run this before web application is started
    public void contextInitialized(ServletContextEvent arg0) {
        System.out.println("ServletContextListener started");
    }
}