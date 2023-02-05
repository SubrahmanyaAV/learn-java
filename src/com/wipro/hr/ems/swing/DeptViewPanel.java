package com.wipro.hr.ems.swing;

import java.awt.CardLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.wipro.hr.ems.db.DepartmentDAO;

public class DeptViewPanel extends JPanel{
	
	private JTable table;
	private JScrollPane pane;
	private JButton btnBack;
	private Container parent;
	private CardLayout layout;
	
	Vector<String> colNames = new Vector<String>();
	
	DepartmentDAO dao = null;
	
	public DeptViewPanel(Container parent, CardLayout layout) {
		
		colNames.add("Dept Id");
		colNames.add("Dept Name");
		
		dao = new DepartmentDAO();     //null pointer
		btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				//layout.next(parent);
				layout.show(parent, "CREATE");
				
			}
		});
		
		table = new JTable(new DefaultTableModel(dao.getTableData(), colNames));
		
		pane = new JScrollPane(table);
		
		addComponentListener(new ComponentAdapter() {
			
			@Override
			public void componentShown(ComponentEvent e) {
				      //refresh
				table.setModel(new DefaultTableModel(dao.getTableData(), colNames));
			}
		});
		
		add(btnBack);
		add(pane);
	}


}
