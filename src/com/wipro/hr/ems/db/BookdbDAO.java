package com.wipro.hr.ems.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.wipro.hr.ems.entity.Bookdb;
import com.wipro.hr.ems.util.DateUtil;

public class BookdbDAO {
	
	public int create(Bookdb b)
	{
		String sql = "insert into bookdb(title,price,created_date) values(?,?,?)";
		int bid = 0;
		
		try(Connection conn = DBConnectionManager.getConnection())
		{
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, b.getTitle());
			ps.setFloat(2, b.getPrice());
			ps.setDate(3, DateUtil.strToSQLDate(b.getCreatedDate()));
			
			ps.executeUpdate();
			
			ResultSet rs = ps.getGeneratedKeys();
			if (rs != null && rs.next())
			{
				bid= rs.getInt(1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return bid ;
	}

}
