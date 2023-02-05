package com.wipro.hr.ems.eventhandling;

import java.applet.Applet;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MouseEventDemo2 extends Applet {
	                                //source  
	@Override
	public void init() {
                                            //reference 
		addMouseListener(new MyMouseListener(this));
	}
}

      //listener                       //dummy implementation
class MyMouseListener extends MouseAdapter{
	
	Applet app;
	
	MyMouseListener(Applet app) {
		this.app = app;
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		app.showStatus("Mouse clicked");
	}
	
}