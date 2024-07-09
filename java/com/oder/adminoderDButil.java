package com.oder;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.sql.PreparedStatement;

import com.adminusers.adminuser;
import com.items.Item;
import com.items.ItemDBConnect;
import com.user.DBConnect;
import com.user.User;

public class adminoderDButil {
	
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;
	
public static boolean addoder (String itm_id, String itm_name, String qty, String date,String supid) {
	
    	boolean isitSuccess = false;
    	
    	try {
    		con = adminoderDBConnect.getConnection();
    		stmt = con.createStatement();
    		String sql = "insert into orders values (0,'"+itm_id+"','"+itm_name+"','"+qty+"','"+date+"','"+supid+"')";
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


public static List<Oders> selectAllOders() {
	
    List<Oders> Oder = new ArrayList<>();

    try (Connection con = ItemDBConnect.getConnection();
         PreparedStatement ps = con.prepareStatement("SELECT * FROM orders");
         ResultSet rs = ps.executeQuery()) {

        while (rs.next()) {
        	
        	Oders oders = new Oders();
        	oders.setOrder_id(rs.getInt("order_id"));
        	oders.setItem_id(rs.getString("item_id"));
        	oders.setItem_name(rs.getString("item_name"));
        	oders.setQty(rs.getString("qty"));
        	oders.setDate(rs.getString("date"));
        	oders.setSup_id(rs.getString("sup_id"));
        	System.out.println("GFeting ODer Data From Util one by one ids");
            Oder.add(oders);
            
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
    return Oder;
}


public static List<Oders> getOderDetails(String oder_ids) {
	
	int oder_ids1 = Integer.parseInt(oder_ids);
	System.out.println("Redy to Update User ID passed Util = '"+oder_ids1+"'");
	System.out.println("Redy to Update User ID passed Util Convert INt = '"+oder_ids1+"'");
	ArrayList<Oders> odersa = new ArrayList<>();
	
	try {
		
		con = adminoderDBConnect.getConnection();
		stmt = con.createStatement();
		String sql = "select * from orders where order_id='"+oder_ids1+"'";
		rs = stmt.executeQuery(sql);
		
		while(rs.next()) {
			int order_id = rs.getInt(1);
			String item_id = rs.getString(2);
			String item_name = rs.getString(3);
			String qty = rs.getString(4);
			String date = rs.getString(5);
			String sup_id = rs.getString(6);
			
			
			Oders odr1 = new Oders(order_id, item_id, item_name, qty, date, sup_id);
			odersa.add(odr1);
		}
		
	}
	catch(Exception e) {
		e.printStackTrace();
	}	
	return odersa;	
}
	
public static boolean updateoder(String Oder_id, String item_id, String item_name, String qty, String date, String sup_id) {
	
	

	boolean isSuccess = false;
	
	try {
		
		int oderid = Integer.parseUnsignedInt(Oder_id);
		
		con = adminoderDBConnect.getConnection();
		stmt = con.createStatement();
		System.out.println("Passed Value to Update UTIL Servlet = '"+item_id+"'");
		System.out.println("Passed Value to Update UTIL Servlet = '"+item_name+"'");
		String sql = "update orders set item_id='"+item_id+"',item_name='"+item_name+"',qty='"+qty+"',date='"+date+"',sup_id='"+sup_id+"' where order_id='"+oderid+"'";    
		int rs = stmt.executeUpdate(sql);
		
		if(rs > 0) {
			isSuccess = true;
			System.out.println("Display If Update Sucsess = '"+item_id+"'");
		}
		else {
			System.out.println("Display If Update UnSucsess FAIL = '"+item_id+"'");
			isSuccess = false;
		}
		
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	
	return isSuccess;
}


public static boolean deleteOder(String oder_id) {
	boolean isSuccess = false;
	System.out.println("Delete Class String Id val  = '"+oder_id+"'");
	int oder_idi = Integer.parseInt(oder_id);
	System.out.println("Delete Class Converted INT Id val  =  '"+oder_idi+"'");
	
	try {
		
		con = DBConnect.getConnection();
		stmt = con.createStatement();
		String sql = "delete from orders where order_id='"+oder_idi+"'";
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


public static List<suppliers> selectAllSuplier() {
	
    List<suppliers> users = new ArrayList<>();

    try (Connection con = ItemDBConnect.getConnection();
         PreparedStatement ps = con.prepareStatement("SELECT * FROM suplier");
         ResultSet rs = ps.executeQuery()) {

        while (rs.next()) {
        	suppliers user = new suppliers();
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

public static List<Items> selectAllItems() {
	
    List<Items> items = new ArrayList<>();

    try (Connection con = ItemDBConnect.getConnection();
         PreparedStatement ps = con.prepareStatement("SELECT * FROM item");
         ResultSet rs = ps.executeQuery()) {

        while (rs.next()) {
            Items item = new Items();
            item.setItemId(rs.getInt("item_id"));
            item.setItemName(rs.getString("item_name"));
            item.setItemBrand(rs.getString("item_brand"));
            item.setItemQty(rs.getInt("item_qty"));
            item.setItemPrice(rs.getString("item_price"));
            item.setItemSupplier(rs.getString("item_supplier"));
            item.setItemDescription(rs.getString("item_discription"));
            items.add(item);
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
    return items;
}

}















