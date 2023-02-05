package com.wipro.hr.ems.db;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.wipro.hr.ems.Student;
import com.wipro.hr.ems.entity.Address;
import com.wipro.hr.ems.exception.SMSException;

public class StudentDAO {
	
/*	public boolean update(Student s)
	{
		String sql = "Update Student set name=? where rollno = ? ";
		int rows = 0;
		
		try(Connection conn = DBConnectionManager.getConnection())
		{
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, s.getName());
			ps.setInt(2, s.getRollNo());
			
			rows = ps.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rows > 0;
	}
	
	public boolean delete(int rollno)
	{
		String sql = "Delete from student where rollno = ?";
		int rows =0;
		
		try(Connection conn = DBConnectionManager.getConnection())
		{
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, rollno);
			
			rows = ps.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rows > 0;
	}*/
	
	public List<Student> getAll()
	{
		String sql = "select s.rollno, s.name, a.id, a.street, a.city from student s ,address a ";
		List<Student> list = new ArrayList<Student>();
		Student s = null;
		
		try(Connection conn = DBConnectionManager.getConnection())
		{
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			
			while(rs != null && rs.next())
			{
				Address addr = new Address(rs.getInt(3), rs.getString(4), rs.getString(5));
				 s = new Student(rs.getInt(1), rs.getString(2), addr);
				 list.add(s);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public Student getStudent(int rollno)
	{
		String sql = "select s.rollno, s.name, a.id, a.street, a.city from student s ,address a where s.rollno = a.rollno and s.rollno = ? ";
		Student s =null;
		
		try(Connection conn = DBConnectionManager.getConnection())
		{
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, rollno);
			
			ResultSet rs= ps.executeQuery();
			if(rs != null && rs.next())
			{
				Address addr = new Address(rs.getInt(3),rs.getString(4),rs.getString(5));
				s = new Student(rs.getInt(1), rs.getString(2), addr);
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return s;
	}
	
	public boolean create(Student s)
	{
		String sql = "insert into student(rollno,name) values (?,?)";
		String sql2 = "insert into address(street,city,rollno) values (?,?,?)";
		int srow=0,arow=0;
		
		try(Connection conn = DBConnectionManager.getConnection())
		{
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, s.getRollNo());
			ps.setString(2, s.getName());
			srow = ps.executeUpdate();
			
			PreparedStatement ps2 = conn.prepareStatement(sql2);
			ps2.setString(1, s.getAddress().getStreet());
			ps2.setString(2, s.getAddress().getCity());
			ps2.setInt(3, s.getRollNo());
			
			arow = ps2.executeUpdate();
			
		} catch (SQLException e) {
			if(e.getMessage().contains("Duplicate"))
			{
				throw new SMSException("Student roll no already exists");
			}
			else
			{
				throw new SMSException("DB error during create,contact admin");
			}
			
		}
		return (srow > 0 && arow > 0);
	}
	
}
