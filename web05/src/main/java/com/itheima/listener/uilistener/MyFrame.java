package com.itheima.listener.uilistener;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;

public class MyFrame extends JFrame {
	public static void main(String[] args) {
		MyFrame myFrame = new MyFrame();
		myFrame.setName("小窗口");
		myFrame.setBounds(0,0,200,180);
		myFrame.setVisible(true);
		myFrame.addWindowListener(new MyWindowListener());
	}

}
class MyWindowListener implements WindowListener{

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
	
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		MyFrame myFrame = (MyFrame) e.getSource();
		System.out.println(myFrame.getName());
		System.out.println("窗口关闭...");
		System.exit(0);
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}

