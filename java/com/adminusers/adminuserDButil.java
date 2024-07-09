package com.adminusers;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.sql.PreparedStatement;

import com.items.Item;
import com.items.ItemDBConnect;
import com.user.DBConnect;
import com.user.User;

public class adminuserDButil {
	
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;
	
public static boolean adduser (String username, String password, String first_name, String last_name,String address, String telephone_no, String email, String nic, String type, String userStaus) {
    	
    	boolean isitSuccess = false;
    	
    	try {
    		con = adminuserDBConnect.getConnection();
    		stmt = con.createStatement();
    		String sql = "insert into suplier values (0,'"+username+"','"+password+"','"+first_name+"','"+last_name+"','"+address+"','"+telephone_no+"','"+email+"','"+nic+"','"+type+"','"+userStaus+"')";
    		int rs = stmt.executeUpdate(sql);
    		
    		if(rs > 0) {
    			isitSuccess = true;
    		} else {
    			isitSuccess = false;
    		}
    		
    	}
    	catch (Exception e) {
    		e.printStackTrace();
    	}
 	
    	return isitSuccess;
    }


public static List<adminuser> selectAllUsers() {
	
    List<adminuser> users = new ArrayList<>();

    try (Connection con = ItemDBConnect.getConnection();
         PreparedStatement ps = con.prepareStatement("SELECT * FROM suplier");
         ResultSet rs = ps.executeQuery()) {

        while (rs.next()) {
        	adminuser user = new adminuser();
        	user.setUser_id(rs.getInt("sup_id"));
        	user.setUsername(rs.getString("username"));
        	user.setPassword(rs.getString("password"));
        	user.setFirst_name(rs.getString("first_name"));
        	user.setLast_name(rs.getString("last_name"));
        	user.setAddress(rs.getString("address"));
        	user.setTelephone_no(rs.getString("telephone_no"));
        	user.setEmail(rs.getString("email"));
        	user.setNic(rs.getString("nic"));
        	user.setType(rs.getString("type"));
        	user.setStatus(rs.getInt("status"));
        	users.add(user);
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
    return users;
}


public static List<adminuser> getUserDetails(String user_id1) {
	
	int user_idi = Integer.parseInt(user_id1);
	System.out.println("Redy to Update User ID passed Util = '"+user_id1+"'");
	System.out.println("Redy to Update User ID passed Util Convert INt = '"+user_idi+"'");
	ArrayList<adminuser> usr1 = new ArrayList<>();
	
	try {
		
		con = DBConnect.getConnection();
		stmt = con.createStatement();
		String sql = "select * from suplier where sup_id='"+user_idi+"'";
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
			
			adminuser u1 = new adminuser(user_id, username, password, first_name, last_name, address, telephone_no, email, nic, type, status);
			usr1.add(u1);
		}
		
	}
	catch(Exception e) {
		e.printStackTrace();
	}	
	return usr1;	
}


public static boolean updateuser(String user_id, String username, String password, String first_name, String last_name,String address, String telephone_no, String email, String nic, String type) {
	
	boolean isSuccess = false;
	try {
		
		int user_idn = Integer.parseUnsignedInt(user_id);
		
		con = DBConnect.getConnection();
		stmt = con.createStatement();
		System.out.println("Passed Value to Update UTIL Servlet = '"+user_idn+"'");
		System.out.println("Passed Value to Update UTIL Servlet = '"+username+"'");
		String sql = "update suplier set username='"+username+"',password='"+password+"',first_name='"+first_name+"',last_name='"+last_name+"',address='"+address+"',telephone_no='"+telephone_no+"',email='"+email+"',nic='"+nic+"',type='"+type+"' where sup_id='"+user_id+"'";    
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


public static boolean deleteUser(String user_id) {
	boolean isSuccess = false;
	System.out.println("Delete Class String Usr Delete Id val  = '"+user_id+"'");
	int user_ids = Integer.parseInt(user_id);
	System.out.println("Delete Class Converted usrDelete Id val  =  '"+user_ids+"'");
	
	try {
		
		con = DBConnect.getConnection();
		stmt = con.createStatement();
		String sql = "delete from suplier where sup_id='"+user_ids+"'";
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















