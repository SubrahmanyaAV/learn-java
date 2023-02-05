
package com.wipro.hr.ems.db;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.wipro.hr.ems.entity.Book;
import com.wipro.hr.ems.entity.Bookdb;
import com.wipro.hr.ems.exception.SMSException;

public class BookDAO {
	
	public boolean update(Book b)
	{
		String sql = "update Book set bname=? where bid=?";
		int rows = 0;
		
		try(Connection conn = DBConnectionManager.getConnection())
		{
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, b.getBname());
			ps.setInt(2, b.getBid());
			
			rows = ps.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rows >0;
	}
	
	public boolean delete(int bId)
	{
		String sql = "Delete from book where bid =?";
		int rows = 0;
		
		try(Connection conn = DBConnectionManager.getConnection())
		{
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, bId);
			
			rows = ps.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rows >0;
	}
	
	
	public List<Book>getAll()
	{
		String sql = "Select bid,bname from book";
		List<Book>list = new ArrayList<Book>();
		Book b = null;
		
		try(Connection conn = DBConnectionManager.getConnection())
		{
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			
			while( rs != null && rs.next())
			{
				b = new Book(rs.getInt(1), rs.getString(2));
				list.add(b);
			}	
		} catch (SQLException e) {
				e.printStackTrace();
			}
		return list;
		}
	
	public Book getBook(int bid)
	{
		String sql = "select bid,bname from book where bid = ?";
		Book b = null;
		
		try(Connection conn = DBConnectionManager.getConnection())
		{
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, bid);
			ResultSet rs = ps.executeQuery();
			if(rs != null && rs.next())
			{
				b=new Book(rs.getInt(1), rs.getString(2));
			}
		}catch (SQLException e) {
				e.printStackTrace();
			}
		return b;
	}
	
	public boolean create(Book b)
	{
		String sql = " insert into book(bid,bname) values(?,?)";
		int rows = 0;
		
		try(Connection conn = DBConnectionManager.getConnection())
		{
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, b.getBid());
			ps.setString(2, b.getBname());
			rows = ps.executeUpdate();
		}catch (SQLException e) {
			if(e.getMessage().contains("Duplicate"))
			{
				throw new SMSException("Book Id already exists");
			}
			else
			{
				throw new SMSException("DB error during create,contact admin");
			}
		}
		return rows>0;
	}
}
