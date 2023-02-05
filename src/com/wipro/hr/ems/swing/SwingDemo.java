package com.wipro.hr.ems.swing;

import javax.swing.JFrame;

public class SwingDemo extends JFrame {

	SwingDemo()
	{
		setTitle("Hello World");
		setSize(300, 300);
		setLocation(200, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		
		new SwingDemo();
		
	}

}
