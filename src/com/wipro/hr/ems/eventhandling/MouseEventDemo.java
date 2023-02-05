package com.wipro.hr.ems.eventhandling;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseEventDemo extends Applet implements MouseListener{
                                   //source and he himself is the listener
	String msg = "";
	int X = 0;
	int Y = 0;
	
	@Override
	public void init() {
		addMouseListener(this);
		
	}
	@Override
	public void paint(Graphics g) {
		g.drawString(msg, X, Y);
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		X = e.getX();
		Y = e.getY();
		msg = "Mouse Clicked at (" + X + "," + Y + ")";
		repaint();
	}

	@Override
	public void mousePressed(MouseEvent e) {
		msg = "Mouse Pressed ";
		repaint();
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		msg = "Mouse Released";
		repaint();
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		msg = "Mouse Entered";
		repaint();
	}

	@Override
	public void mouseExited(MouseEvent e) {
		msg = "Mouse Exited";
		repaint();
	}
	

}
