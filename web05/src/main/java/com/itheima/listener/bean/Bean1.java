package com.itheima.listener.bean;

import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;

public class Bean1 implements HttpSessionBindingListener {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void valueBound(HttpSessionBindingEvent event) {
		// TODO Auto-generated method stub
		System.out.println("Bean与session绑定了....");
	}

	@Override
	public void valueUnbound(HttpSessionBindingEvent event) {
		// TODO Auto-generated method stub
		System.out.println("Bean与session解除绑定了....");
	}
}
