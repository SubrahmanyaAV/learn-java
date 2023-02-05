package com.wipro.hr.ems.swing;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FrameDemo extends Frame {
	
	 FrameDemo() {
		
		 setTitle("Hello");
		 setSize(300, 300);
		 
	}
	 public static void main(String[] args) {
		
		 Frame f = new FrameDemo();
		 f.setVisible(true);
		 
		 f.addWindowListener(new WindowAdapter() {
			 
			 @Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
				           //0 normal exit
			}
		});
		 
	}
}
