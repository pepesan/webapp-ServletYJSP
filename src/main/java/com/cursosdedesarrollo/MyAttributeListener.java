package com.cursosdedesarrollo;

import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

/**
 * Created by pepesan on 16/5/16.
 */
public class MyAttributeListener implements HttpSessionAttributeListener {


    public void attributeAdded(HttpSessionBindingEvent event) {
        String attributeName = event.getName();
        Object attributeValue = event.getValue();
        System.out.println("Attribute added : " + attributeName + " : " + attributeValue);
    }


    public void attributeRemoved(HttpSessionBindingEvent event) {
        String attributeName = event.getName();
        Object attributeValue = event.getValue();
        System.out.println("Attribute removed : " + attributeName + " : " + attributeValue);
    }


    public void attributeReplaced(HttpSessionBindingEvent event) {
        String attributeName = event.getName();
        Object attributeValue = event.getValue();
        System.out.println("Attribute replaced : " + attributeName + " : " + attributeValue);
    }
}