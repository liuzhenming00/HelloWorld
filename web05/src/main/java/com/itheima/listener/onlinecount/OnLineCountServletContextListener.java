package com.itheima.listener.onlinecount;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class OnLineCountServletContextListener implements ServletContextListener {

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		// TODO Auto-generated method stub
		sce.getServletContext().setAttribute("count", 0);
	}

}
