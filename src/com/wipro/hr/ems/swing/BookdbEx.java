package com.wipro.hr.ems.swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

import com.wipro.hr.ems.db.BookdbDAO;
import com.wipro.hr.ems.entity.Bookdb;

public class BookdbEx extends JFrame {
	
	//JTextField txtBid;
	JTextField txtTitle;
	JTextField txtPrice;
	JTextField txtCreatedDate;
	JButton btnCreate;
	JPanel panel;
	
	BookdbEx()
	{
		setTitle("Book Ex 2");
		setSize(300, 300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		panel = new JPanel();
		//txtBid = new JTextField(4);
		txtTitle = new JTextField(5);
		txtPrice = new JTextField(5);
		txtCreatedDate = new JTextField(8);
		
		btnCreate = new JButton("Create");
		
		btnCreate.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
			
				//String strBid = txtBid.getText();
				String strTitle = txtTitle.getText();
				String strPrice = txtPrice.getText();
				String strCreatedDate = txtCreatedDate.getText();
				
				Bookdb b = new Bookdb(strTitle, Float.parseFloat(strPrice),strCreatedDate);
				BookdbDAO dao = new BookdbDAO();
				dao.create(b);
				
			}
		}); 
			
			//panel.add(txtBid);
			panel.add(txtTitle);
			panel.add(txtPrice);
			panel.add(txtCreatedDate);
			panel.add(btnCreate);
			
			add(panel);
			setVisible(true);
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				new BookdbEx();
				
			}
		});
		
		

	}

}
