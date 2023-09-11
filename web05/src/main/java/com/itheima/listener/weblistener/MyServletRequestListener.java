package com.itheima.listener.weblistener;

import javax.servlet.ServletContextListener;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

public class MyServletRequestListener implements ServletRequestListener {

	@Override
	public void requestDestroyed(ServletRequestEvent sre) {
		// TODO Auto-generated method stub
		System.out.println("ServletRrquest对象被创建了");
	}

	@Override
	public void requestInitialized(ServletRequestEvent sre) {
		// TODO Auto-generated method stub
		System.out.println("ServletRrquest对象被销毁了");
	}

}
