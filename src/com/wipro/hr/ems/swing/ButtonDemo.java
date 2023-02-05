package com.wipro.hr.ems.swing;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class ButtonDemo extends JFrame{
	
	JButton btnClose;
	JButton btnBeep;
	JPanel panel;
	
	public ButtonDemo() {
		
		setTitle("Button Demo");
		setSize(300, 300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		panel = new JPanel();//create
		btnClose = new JButton("Close");
		btnBeep = new JButton("Beep");
		
		
		btnClose.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				System.exit(0);
				
			}
		});
		
		
		btnBeep.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				getToolkit().beep();
				
			}
		});
		
		panel.add(btnClose);//add buttons to panel
		panel.add(btnBeep);
		add(panel);//add panel to jframe
		
		setVisible(true);
		
	}

	public static void main(String[] args) {
		
		
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override                     //work packet
			public void run() {
				
				new ButtonDemo();
				
			}
		});
		
	}

}
