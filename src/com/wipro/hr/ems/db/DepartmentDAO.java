package com.wipro.hr.ems.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import com.wipro.hr.ems.entity.Department;
import com.wipro.hr.ems.exception.SMSException;

public class DepartmentDAO {
                      //data access object	
	
	public Vector<Vector<String>> getTableData()
	{
		String sql = "select deptid,deptname from department";
		Vector<Vector<String>> data = new Vector<Vector<String>>();
		Vector<String> row = null;
		
		try(Connection conn = DBConnectionManager.getConnection())
		{
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			
			while(rs !=null && rs.next())
			{
				row = new Vector<String>();
				row.add(String.valueOf(rs.getInt(1)));  //int to string
				row.add(rs.getString(2));
				data.add(row);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return data;
	}
	
	public boolean update(Department d)
	{
		String sql = "Update department set deptname=? where deptid=?";
	    int rows = 0;
	    
	    try(Connection conn = DBConnectionManager.getConnection())
		{
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, d.getDeptName());
			ps.setInt(2, d.getDeptId());
			
			rows = ps.executeUpdate();
			
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return rows >0;
	}
	
	public boolean delete(int deptId)
	{
		String sql = "Delete from department where deptid =?";
		int rows = 0;
		
		try(Connection conn = DBConnectionManager.getConnection())
		{
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, deptId);
			
			rows = ps.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rows > 0;
	}
	
	public List<Department> getAll()
	{
		String sql = "select deptid,deptname from department";
		List<Department> list = new ArrayList<>();
		Department d = null;
		
		try(Connection conn = DBConnectionManager.getConnection())
		{
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			
			while(rs !=null && rs.next())
			{
				d = new Department(rs.getInt(1), rs.getString(2));
				list.add(d);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public Department getDepartment(int deptid )
	{
		String sql = "Select deptid , deptname from department where deptid = ?";
		Department d = null;
		try(Connection conn = DBConnectionManager.getConnection())
		{
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, deptid);
			ResultSet rs = ps.executeQuery();
			
			if(rs !=null && rs.next())
			{
				d = new Department(rs.getInt(1), rs.getString(2));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return d;
	}
	
	public boolean create(Department d)
	{
		String sql = "insert into department(deptid,deptname) values(?,?)";
		int rows = 0;
		
		try(Connection conn = DBConnectionManager.getConnection())
		{
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, d.getDeptId());
			ps.setString(2,d.getDeptName());
			
			rows = ps.executeUpdate();
			
		} catch (SQLException e) {
			if(e.getMessage().contains("Duplicate"))
			{                          //primary key violation
				throw new SMSException("Dept Id already exists");
			}
			else
			{                          //general msg
				throw new SMSException("DB Error during create,contact admin");
			}
			
		}
		return rows > 0;
	}
	
}
