package com.wipro.hr.ems.swing;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

import com.wipro.hr.ems.db.DepartmentDAO;
import com.wipro.hr.ems.entity.Department;
import com.wipro.hr.ems.exception.SMSException;

public class JTableDemo extends JFrame{

	private JTextField txtDeptId;
	private JTextField txtDeptName;
	private JTable table;
	private JScrollPane pane;
	private JPanel panel;
	private JButton btnDelete;
	private JButton btnCreate;
	private JLabel lblDeptId;
	private JLabel lblDeptName;

	//Object[] colNames = {"Dept Id","Dept Name"};
	//Object[][] data = {{"101","HR"},{"102","Production"},{"103","Sales"}};

	Vector<String> colNames = new Vector<String>();
	//Vector<Vector<String>> data = new Vector<>();

	DepartmentDAO dao = null;

	public JTableDemo() {

		setTitle("Table Demo");
		setSize(300, 300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		colNames.add("Dept Id");
		colNames.add("Dept Name");

		dao = new DepartmentDAO();     //null pointer
		panel = new JPanel();
		lblDeptId = new JLabel("Dept Id:");
		lblDeptName = new JLabel("Dept Name:");
		txtDeptId = new JTextField(5);             
		txtDeptName = new JTextField(7);
		table = new JTable(new DefaultTableModel(dao.getTableData(), colNames));

		pane = new JScrollPane(table);

		btnCreate = new JButton("Create");

		btnCreate.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				String strDeptId = txtDeptId.getText();
				String strDeptName = txtDeptName.getText();

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

					table.setModel(new DefaultTableModel(dao.getTableData(),colNames));

				} catch (NumberFormatException nfe) {
					getToolkit().beep(); 
					JOptionPane.showMessageDialog(panel, "Invalid ID", "Error", JOptionPane.ERROR_MESSAGE);
				}catch (SMSException e2) {
					getToolkit().beep(); 
					JOptionPane.showMessageDialog(panel,e2.getInfo(), "Error", JOptionPane.ERROR_MESSAGE);
				}

			}
		});

		btnDelete = new JButton("Delete");

		btnDelete.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				int rowidx = table.getSelectedRow();
				//type cast string
				String strDeptId = (String) table.getModel().getValueAt(rowidx, 0); 
				dao.delete(Integer.parseInt(strDeptId));

				table.setModel(new DefaultTableModel(dao.getTableData(),colNames));//refresh table

			}
		});;

		/*	Vector<String> row1 = new Vector<String>();
		row1.add("101");
		row1.add("HR");

		Vector<String> row2 = new Vector<String>();
		row2.add("102");
		row2.add("Production");

		data.add(row1);
		data.add(row2);

		panel = new JPanel();
		table = new JTable(data, colNames);
		pane = new JScrollPane(table);*/


		panel.add(lblDeptId);
		panel.add(txtDeptId);
		panel.add(lblDeptName);
		panel.add(txtDeptName);
		panel.add(btnCreate);
		add(panel);
		add(btnDelete,BorderLayout.SOUTH);
		panel.add(pane);
		setVisible(true);

	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {

				new JTableDemo();
			}
		});

	}

}
