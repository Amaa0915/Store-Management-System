package com.user;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class UserDButil {
	
	private static boolean isSuccess;
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;
	

    
	public static boolean validate(String username, String password) {
		System.out.println("User name Password Passed username='"+username+"' and password='"+password+"' !!!");
		
		try {
			
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "select * from user where username='"+username+"' and  password='"+password+"'";
			rs = stmt.executeQuery(sql);
			System.out.println("Database Data Results = '"+rs+"'");
			if (rs.next()) {
				isSuccess = true;
				System.out.println("Data Result Is True");
			} else {
				isSuccess = false;
				System.out.println("Data Result Is False");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return isSuccess;
	}
	
	
	
	
	public static List<User> getUser(String userName) {
		
		ArrayList<User> user = new ArrayList<>();
		
		try {
			
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "select * from user where username='"+userName+"'";
			rs = stmt.executeQuery(sql);
			
			while (rs.next()) {
				int user_id = rs.getInt(1);
				String username = rs.getString(2);
				String password = rs.getString(3);
				String first_name = rs.getString(4);
				String last_name = rs.getString(5);
				String address = rs.getString(6);
				String telephone_no = rs.getString(7);
				String email = rs.getString(8);
				String nic = rs.getString(9);
				String type = rs.getString(10);
				int status = rs.getInt(11);
				
				User usr = new User(user_id, username, password, first_name, last_name, address, telephone_no, email, nic, type, status);
				user.add(usr);
			}
			
		} catch (Exception e) {
			
		}
		
		return user;	
	}
	
	
public static boolean registeruser(String username, String password, String first_name, String last_name,String address, String telephone_no, String email, String nic, String type) {
    	
    	boolean isSuccess = false;
    	
    	try {
    		con = DBConnect.getConnection();
    		stmt = con.createStatement();
    	    String sql = "insert into user values (0,'"+username+"','"+password+"','"+first_name+"','"+last_name+"','"+address+"','"+telephone_no+"','"+email+"','"+nic+"','"+type+"',0)";
    		int rs = stmt.executeUpdate(sql);
    		
    		if(rs > 0) {
    			isSuccess = true;
    		} else {
    			isSuccess = false;
    		}
    		
    	}
    	catch (Exception e) {
    		e.printStackTrace();
    	}
 	
    	return isSuccess;
    }


public static boolean updateuser(String user_id, String username, String password, String first_name, String last_name,String address, String telephone_no, String email, String nic, String type) {
	
	try {
		
		int user_idn = Integer.parseUnsignedInt(user_id);
		
		con = DBConnect.getConnection();
		stmt = con.createStatement();
		System.out.println("Passed Value to Update UTIL Servlet = '"+user_idn+"'");
		System.out.println("Passed Value to Update UTIL Servlet = '"+username+"'");
		String sql = "update user set username='"+username+"',password='"+password+"',first_name='"+first_name+"',last_name='"+last_name+"',address='"+address+"',telephone_no='"+telephone_no+"',email='"+email+"',nic='"+nic+"',type='"+type+"' where user_id='"+user_id+"'";    
		int rs = stmt.executeUpdate(sql);
		
		if(rs > 0) {
			isSuccess = true;
			System.out.println("Display If Update Sucsess = '"+user_id+"'");
		}
		else {
			System.out.println("Display If Update UnSucsess FAIL = '"+user_id+"'");
			isSuccess = false;
		}
		
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	
	return isSuccess;
}



public static List<User> getUserDetails(String user_id2) {
	
	
	
	ArrayList<User> usr = new ArrayList<>();
	
	try {
		
		con = DBConnect.getConnection();
		stmt = con.createStatement();
		String sql = "select * from user where id='"+user_id2+"'";
		rs = stmt.executeQuery(sql);
		
		while(rs.next()) {
			int user_id = rs.getInt(1);
			String username = rs.getString(2);
			String password = rs.getString(3);
			String first_name = rs.getString(4);
			String last_name = rs.getString(5);
			String address = rs.getString(6);
			String telephone_no = rs.getString(7);
			String email = rs.getString(8);
			String nic = rs.getString(9);
			String type = rs.getString(10);
			int status = rs.getInt(11);
			
			User u = new User(user_id, username, password, first_name, last_name, address, telephone_no, email, nic, type, status);
			usr.add(u);
		}
		
	}
	catch(Exception e) {
		e.printStackTrace();
	}	
	return usr;	
}


public static boolean deleteUser(String user_id) {
	System.out.println("Delete Class String Id val  = '"+user_id+"'");
	int user_ids = Integer.parseInt(user_id);
	System.out.println("Delete Class Converted INT Id val  =  '"+user_ids+"'");
	
	try {
		
		con = DBConnect.getConnection();
		stmt = con.createStatement();
		String sql = "delete from user where user_id='"+user_ids+"'";
		int r = stmt.executeUpdate(sql);
		
		if (r > 0) {
			isSuccess = true;
		}
		else {
			isSuccess = false;
		}
		
	}
	catch (Exception e) {
		e.printStackTrace();
	}
	
	return isSuccess;
}






    
}
