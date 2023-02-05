package com.wipro.hr.ems.eventhandling;

import java.applet.Applet;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class InnerClassDemo extends Applet{
	
	@Override
	public void init() {
		addMouseListener(new Mylistener());
	}
	
	class Mylistener extends MouseAdapter{
		@Override
		public void mouseClicked(MouseEvent e) {
			showStatus("Mouse clicked");
		}
	}
}
