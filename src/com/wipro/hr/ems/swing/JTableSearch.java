package com.wipro.hr.ems.swing;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

public class JTableSearch extends JFrame{

	   private JTextField jtf;
	   private JLabel searchLbl;
	   private TableModel model;
	   private JTable table;
	   private TableRowSorter sorter;
	   private JScrollPane jsp;
	   public JTableSearch() {
		   
	      setTitle("JTableSearch Test");
	      jtf = new JTextField(15);
	      searchLbl = new JLabel("Search");
	      String[] columnNames = {"Name", "Technology"};
	      Object[][] rowData = {{"Raja", "Java"},{"Vineet", "Java Script"},{"Archana", "Python"},{"Krishna", "Scala"},{"Adithya", "AWS"},{"Jai", ".Net"}};
	      model = new DefaultTableModel(rowData, columnNames);
	      sorter = new TableRowSorter<>(model);
	      table = new JTable(model);
	      table.setRowSorter(sorter);
	      setLayout(new FlowLayout(FlowLayout.CENTER));
	      jsp = new JScrollPane(table);
	      add(searchLbl);
	      add(jtf);
	      add(jsp);
	      jtf.getDocument().addDocumentListener(new DocumentListener() {
	         @Override
	         public void insertUpdate(DocumentEvent e) {
	            search(jtf.getText());
	         }
	         @Override
	         public void removeUpdate(DocumentEvent e) {
	            search(jtf.getText());
	         }
	         @Override
	         public void changedUpdate(DocumentEvent e) {
	            search(jtf.getText());
	         }
	         public void search(String str) {
	            if (str.length() == 0) {
	               sorter.setRowFilter(null);
	            } else {
	               sorter.setRowFilter(RowFilter.regexFilter(str));
	            }
	         }
			
	      });
	      setSize(475, 300);
	      setDefaultCloseOperation(EXIT_ON_CLOSE);
	      setLocationRelativeTo(null);
	      setResizable(false);
	      setVisible(true);
	   }
	public static void main(String[] args) {
	      new JTableSearch();
	   }
	
}
