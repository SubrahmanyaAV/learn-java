package com.wipro.hr.ems.test;
import java.util.List;

import com.wipro.hr.ems.db.DepartmentDAO;
import com.wipro.hr.ems.entity.Department;

public class TestDeptDAO {

	public static void main(String[] args) {
		
		
		
		DepartmentDAO dao = new DepartmentDAO();
		List<Department> list = dao.getAll();
		for(Department d : list)
		{
			System.out.println(d.getDeptId() + "==" + d.getDeptName());
		}
		
		/*DepartmentDAO dao = new DepartmentDAO();
		
		Department d = dao.getDepartment(101);
		System.out.println(d);*/
		
		/*if(dao.create(new Department(333, "Demo")))
		{
			//System.out.println("Rows created");
		}*/
	}
}
