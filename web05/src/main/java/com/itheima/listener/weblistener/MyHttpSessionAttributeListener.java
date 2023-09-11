package com.itheima.listener.weblistener;

import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

public class MyHttpSessionAttributeListener implements HttpSessionAttributeListener {

	@Override
	public void attributeAdded(HttpSessionBindingEvent event) {
		// TODO Auto-generated method stub
		System.out.println("向session中添加了属性....");
	}

	@Override
	public void attributeRemoved(HttpSessionBindingEvent event) {
		// TODO Auto-generated method stub
		System.out.println("向session中移除了属性....");
	}

	@Override
	public void attributeReplaced(HttpSessionBindingEvent event) {
		// TODO Auto-generated method stub
		System.out.println("向session中替换了属性....");
	}

}
