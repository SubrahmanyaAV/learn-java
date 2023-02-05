package com.wipro.hr.ems.eventhandling;

import java.applet.Applet;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class AnonymousDemo extends Applet {
	         //source
	@Override
	public void init() { 
		                    //listener
		addMouseListener(new MouseAdapter() {   //inner class
		//register 	
			
			@Override
			public void mouseClicked(MouseEvent e) {  //Method
				showStatus("Mouse clicked");
			}
		});
		
	}

}
