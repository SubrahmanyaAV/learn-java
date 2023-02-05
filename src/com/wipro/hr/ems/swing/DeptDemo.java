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

import com.wipro.hr.ems.db.DepartmentDAO;
import com.wipro.hr.ems.entity.Department;
import com.wipro.hr.ems.exception.SMSException;

public class DeptDemo extends JFrame {
	
	JLabel lblDeptId;
	JLabel lblDeptName;
	JTextField txtDeptId;
	JTextField txtDeptName;
	JButton btnCreate;
	JPanel panel;
	
	DeptDemo()
	{
		setTitle("Department Demo");
		setSize(300, 300);                        //all basic cons
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		panel = new JPanel();
		lblDeptId = new JLabel("Dept Id:");
		lblDeptName = new JLabel("Dept Name:");
		txtDeptId = new JTextField(5);             //create
		txtDeptName = new JTextField(7);
		btnCreate = new JButton("Create");
		
		btnCreate.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				String strDeptId = txtDeptId.getText();
				String strDeptName = txtDeptName.getText();
				//System.out.println(strDeptId + ":" + strDeptName);
				
				if(strDeptName.trim().equals("") || strDeptId.trim().equals(""))
				{
					getToolkit().beep();          
					JOptionPane.showMessageDialog(panel, "Dept Id and Name cannot be empty", "Error", JOptionPane.ERROR_MESSAGE);
					return;
				}
			
				try {
					Department d = new Department(Integer.parseInt(strDeptId), strDeptName);
					DepartmentDAO dao = new DepartmentDAO();
					if(dao.create(d))
					{
						JOptionPane.showMessageDialog(panel, "Dept successfully created", "Success", JOptionPane.INFORMATION_MESSAGE);
						txtDeptId.setText("");
						txtDeptName.setText("");
					}
				} catch (NumberFormatException e2) {
					getToolkit().beep();  //for string ""    //instead of ID if i use other - NFException
					JOptionPane.showMessageDialog(panel, "Invalid ID", "Error", JOptionPane.ERROR_MESSAGE);
				}catch (SMSException sms) {
					getToolkit().beep(); //also Handle exception in dao  //duplicate entry primary key violation
					JOptionPane.showMessageDialog(panel,sms.getInfo(), "Error", JOptionPane.ERROR_MESSAGE);
					
				}
			}
		});
		
		panel.add(lblDeptId);
		panel.add(txtDeptId);
		panel.add(lblDeptName);
		panel.add(txtDeptName);                    //add
		panel.add(btnCreate);
		
		add(panel);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		
		//new DeptEx();  no -> main thread
		
		 SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() { 
				
				new DeptDemo();          //thread -> event queue
				
			}
		});
	}

}
