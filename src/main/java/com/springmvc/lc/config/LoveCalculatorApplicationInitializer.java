package com.springmvc.lc.config;

import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRegistration;

public class LoveCalculatorApplicationInitializer {

	public void onStartup(ServletContext servletContext) throws ServletException {
		AnnotationConfigWebApplicationContext webAppContext = new AnnotationConfigWebApplicationContext();
		webAppContext.register(LoveCalculatorAppConfig.class);
		DispatcherServlet servlet = new DispatcherServlet(webAppContext);
		ServletRegistration.Dynamic customDispatcherServlet = servletContext.addServlet("myDispatcherServlet", servlet);
		customDispatcherServlet.setLoadOnStartup(1);
		customDispatcherServlet.addMapping("/*");
	}
}
