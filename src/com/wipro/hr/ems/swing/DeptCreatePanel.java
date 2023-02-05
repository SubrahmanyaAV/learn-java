package com.wipro.hr.ems.swing;

import java.awt.CardLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.wipro.hr.ems.db.DepartmentDAO;
import com.wipro.hr.ems.entity.Department;
import com.wipro.hr.ems.exception.SMSException;

public class DeptCreatePanel extends JPanel{
	
	private JLabel lblDeptId;
	private JLabel lblDeptName;
	private JTextField txtDeptId;
	private JTextField txtDeptName;
	private JButton btnCreate;
	private JButton btnHome;
	private Container parent;
	private CardLayout layout;
	private JPanel panel;
	
	public DeptCreatePanel(Container parent, CardLayout layout) {
		
		panel = this;
		this.parent = parent;
		this.layout = layout;
		
		lblDeptId = new JLabel("Dept Id:");
		lblDeptName = new JLabel("Dept Name:");
		txtDeptId = new JTextField(5);             
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
						//layout.next(parent);
						layout.show(parent, "VIEW");
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
		
		btnHome = new JButton("Home");
		btnHome.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				layout.show(parent,"MAIN");
				
			}
		});
		add(lblDeptId);
		add(txtDeptId);
		add(lblDeptName);
		add(txtDeptName); 
		add(btnCreate);
		add(btnHome);
	}

}
