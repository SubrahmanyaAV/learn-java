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

import com.wipro.hr.ems.Student;
import com.wipro.hr.ems.db.StudentDAO;
import com.wipro.hr.ems.entity.Address;
import com.wipro.hr.ems.exception.SMSException;

public class StudentEx extends JFrame {
	
	JLabel lblRollno;
	JLabel lblName;
	JLabel lblStreet;
	JLabel lblCity;
	JTextField txtRollno ;
	JTextField txtName;
	//JTextField txtId; => auto increment
	JTextField txtStreet;
	JTextField txtCity;
	JButton btnCreate;
	JPanel panel;
	
	public StudentEx() {
		
		setTitle("Student Ex");
		setSize(300, 300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		panel = new JPanel();
		lblRollno = new JLabel("Rollno:");
		lblName = new JLabel("Name:");
		lblStreet = new JLabel("street:");
		lblCity = new JLabel("City:");
		txtRollno = new JTextField(5);
		txtName = new JTextField(7);
		txtStreet = new JTextField(5);
		txtCity = new JTextField(5);
		btnCreate = new JButton("Create");

		btnCreate.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

				String strRollno = txtRollno.getText();
				String strName = txtName.getText();
				String strStreet = txtStreet.getText();
				String strCity = txtCity.getText();
				if(strName.trim().equals("") || strRollno.trim().equals("") || strStreet.trim().equals("") || strCity.trim().equals(""))
				{
					getToolkit().beep();
					JOptionPane.showMessageDialog(panel, "student details cannot be empty", "Error", JOptionPane.ERROR_MESSAGE);
					return;
				}
				try {

					Address a = new Address( strStreet, strCity);
					Student s = new Student(Integer.parseInt(strRollno), strName, a);
					StudentDAO dao = new StudentDAO();
					if(dao.create(s))
					{
						JOptionPane.showMessageDialog(panel, "Student details created successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
						txtRollno.setText("");
						txtName.setText("");
						txtStreet.setText("");
						txtCity.setText("");
					}
				} catch (NumberFormatException nfe) {
					getToolkit().beep();
					JOptionPane.showMessageDialog(panel, "Invalid rollno", "Error", JOptionPane.ERROR_MESSAGE);
				}catch (SMSException sms) {
					getToolkit().beep();
					JOptionPane.showMessageDialog(panel,sms.getInfo(),"Error",JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		
		panel.add(lblRollno);
		panel.add(txtRollno);
		panel.add(lblName);
		panel.add(txtName);
	//	panel.add(txtId); -> auto increment
		panel.add(lblStreet);
		panel.add(txtStreet);
		panel.add(lblCity);
		panel.add(txtCity);
	
		panel.add(btnCreate);
		
		add(panel);
		setVisible(true);
	}

	public static void main(String[] args) {
		
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {

				new StudentEx();
			}
		});
	}
	
}
