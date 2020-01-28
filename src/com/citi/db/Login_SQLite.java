package com.citi.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.citi.model.Contact;



public class Login_SQLite {
	public static Connection connect() {
		String url = "";
		Connection conn = null;
		try {
			try {
				Class.forName("org.sqlite.JDBC");
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			conn = DriverManager.getConnection(url);
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return conn;
	}
public static List<Contact> selectAll() {
	String selectQuery = "SELECT * from contacts";
	Map mapObj = new HashMap();
	Connection conn = connect();
	Statement stmt = null;
	List<Contact> contactDetails = new ArrayList<Contact>();
	try {
		stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery(selectQuery);
		while(rs.next()) {
			Contact contact = new Contact();
			contact.setContactId(rs.getInt(1));
			contact.setFirstName(rs.getString(2));
			contact.setLastName(rs.getString(3));
			contact.setEmailId(rs.getString(4));
			contact.setPhoneNo(rs.getString(5));
			contactDetails.add(contact);
			}
	} catch (SQLException e) {
		System.out.println(e.getMessage());
		mapObj.put("output", "ERROR");
	} finally {
		try {
			if (stmt != null) {
				stmt.close();
			}
			if (conn != null) {
				conn.setAutoCommit(true);
				conn.close();
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} 
	}
	return contactDetails;
	
}
}
