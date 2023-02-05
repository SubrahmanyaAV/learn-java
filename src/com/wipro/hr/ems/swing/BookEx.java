package com.wipro.hr.ems.swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

import com.wipro.hr.ems.db.BookDAO;
import com.wipro.hr.ems.entity.Book;
import com.wipro.hr.ems.exception.SMSException;

public class BookEx extends JFrame {
	
	JLabel lblBid;
	JLabel lblBname;
	JTextField txtBid;
	JTextField txtBname;
	JButton btnCreate;
	JPanel panel;
	
	BookEx()
	{
		setTitle("Book Ex");
		setSize(300, 300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		panel = new JPanel(); 
		lblBid = new JLabel("Book id:");
		lblBname = new JLabel("Book Name:");
		txtBid = new JTextField(5);
		txtBname = new JTextField(7);
		btnCreate = new JButton("Create");
		
		btnCreate.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

				String strBid = txtBid.getText();
				String strBname = txtBname.getText();
				if(strBname.trim().equals("") || strBid.trim().equals(""))
				{
					getToolkit().beep();
					JOptionPane.showMessageDialog(panel, "Book Id and Name cannot be empty", "Error", JOptionPane.ERROR_MESSAGE);
					return;
				}
				try {
					Book b = new Book(Integer.parseInt(strBid), strBname);
					BookDAO dao = new BookDAO();
					if(dao.create(b))
					{
						JOptionPane.showMessageDialog(panel, "Book successfully created", "Success", JOptionPane.INFORMATION_MESSAGE);
						txtBid.setText("");
						txtBname.setText("");
					}
				} catch (NumberFormatException e2) {
					getToolkit().beep();
					JOptionPane.showMessageDialog(panel, "Invalid Id", "Error", JOptionPane.ERROR_MESSAGE);
				}catch (SMSException sms) {
					getToolkit().beep();
					JOptionPane.showMessageDialog(panel, sms.getInfo(), "Error", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		panel.add(lblBid);
		panel.add(txtBid);
		panel.add(lblBname);
		panel.add(txtBname);
		panel.add(btnCreate);
		
		add(panel);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				
				new BookEx();
			}
		});
	}

}
