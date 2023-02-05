package com.wipro.hr.ems.swing;

import java.awt.CardLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class DeptMainPanel extends JPanel{
	
	private JButton btn1;
	private JButton btn2;
	
	public DeptMainPanel(Container parent,CardLayout layout)
	{
		setLayout(new GridLayout(2,1));
		btn1 = new JButton("Create Department");
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				layout.show(parent,"CREATE");
				
			}
		});
		btn2 = new JButton("View Department");
		btn2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				layout.show(parent,"VIEW");
				
			}
		});
		add(btn1);
		add(btn2);
	}

}
