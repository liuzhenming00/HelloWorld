package com.itheima.listener.bean;

import java.io.Serializable;

import javax.servlet.http.HttpSessionActivationListener;
import javax.servlet.http.HttpSessionEvent;
import javax.sound.midi.SysexMessage;

public class Bean2 implements HttpSessionActivationListener,Serializable{
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void sessionDidActivate(HttpSessionEvent se) {
		// TODO Auto-generated method stub
		System.out.println("Bean2被session钝化了");
	}

	@Override
	public void sessionWillPassivate(HttpSessionEvent se) {
		// TODO Auto-generated method stub
		System.out.println("Bean2被session活化了");
	}
	

}
