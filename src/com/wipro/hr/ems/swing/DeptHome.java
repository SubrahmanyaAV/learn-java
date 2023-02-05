package com.wipro.hr.ems.swing;

import java.awt.CardLayout;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class DeptHome extends JFrame{
	
	Container cpane;
	CardLayout layout = new CardLayout();
	
	public DeptHome() {
		
		cpane = getContentPane();
		cpane.setLayout(layout);
		setTitle("Card Layout Demo");
		setSize(400, 400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		cpane.add("MAIN",new DeptMainPanel(cpane, layout));
		cpane.add("CREATE",new DeptCreatePanel(cpane, layout));
		cpane.add("VIEW",new DeptViewPanel(cpane, layout));
		
		setVisible(true);
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				new DeptHome();
				
			}
		});
		
	}

}
