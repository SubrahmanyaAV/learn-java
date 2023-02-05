package com.wipro.hr.ems.entity;

import java.util.List;
import java.util.Scanner;

import com.wipro.hr.ems.db.DepartmentDAO;

public class TestDept {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		DepartmentDAO dao = new DepartmentDAO();
		String choice = "";
		
		do {
			System.out.println("Please select a choice:");
			System.out.println("1.Add Department");
			System.out.println("2.show all Department");
			System.out.println("3.Search Dept by ID");
			System.out.println("4.Delete Dept by ID");
			System.out.println("5.Update department");
			System.out.println("6.Exit");
			
			choice = sc.nextLine();
			
			switch (choice) {
			case "1":
				System.out.println("Please enter the dept name");
				String deptname = sc.nextLine();
				System.out.println("Please enter the dept id");
				int deptid = sc.nextInt(); sc.nextLine();
				
				Department d = new Department(deptid, deptname);
				
				dao.create(d);
				break;
				
			case "2":
				List<Department> list = dao.getAll();
				
				for(Department d1 : list)
				{
					System.out.println(d1.getDeptId() + "==" + d1.getDeptName());
				}
				break;
				
			case "3":
				System.out.println("Please enter dept id to search");
				int searchId = sc.nextInt(); sc.nextLine();
				Department result = dao.getDepartment(searchId);
				if(result == null)
				{
					System.out.println("Sorry dept id not found");
				}
				else
				{
					System.out.println(result.getDeptId() + "==" + result.getDeptName());
				}
				
			case "4":
				System.out.println("Please enter the dept id to delete");
				int delId = sc.nextInt(); sc.nextLine();
				if(dao.delete(delId))
				{
					System.out.println(delId + " deleted successfully");
				}
				else
				{
					System.out.println("Sorry Dept with Id " + delId + " not found");
				}
				break;
				
			case "5":
				System.out.println("Please enter the new dept name");
				String deptNewName = sc.nextLine();
				
				System.out.println("Please enter the dept id");
				int deptId = sc.nextInt(); sc.nextLine();
				
				if(dao.update(new Department(deptId, deptNewName)))
				{
					System.out.println(" New name updated successfully");
				}
				else
				{
					System.out.println(" Sorry dept id does not exit " + deptId);
				}
				break;
				
			case "6":
				System.out.println("Exit");
				break;
			default:
				break;
			}
		}while(!choice.equals("6"));
		sc.close();
	}
	
}
