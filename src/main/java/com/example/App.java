package com.example;

import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

import javax.servlet.annotation.WebServlet;

/**
 * Hello world!
 *
 */

public class App 
{
    public static void main( String[] args ) throws LifecycleException {
        Tomcat tomcat = new Tomcat();
        tomcat.setPort(8081);

        Context context = tomcat.addContext("",null);
        Tomcat.addServlet(context,"HelloServlet", new HelloServlets());
        context.addServletMappingDecoded("/hello","HelloServlet");

        tomcat.start();
        tomcat.getServer().await();


    }
}
