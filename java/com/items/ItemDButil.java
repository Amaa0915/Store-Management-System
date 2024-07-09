package com.items;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.sql.PreparedStatement;

import com.adminusers.adminuser;
import com.user.DBConnect;
import com.user.User;

public class ItemDButil {
	
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;
	
public static boolean additem(String item_name, String item_brand, String item_qty, String item_price, String item_supplier, String item_discription) {
    	
    	boolean isitSuccess = false;
    	
    	try {
    		con = ItemDBConnect.getConnection();
    		stmt = con.createStatement();
    	    String sql = "insert into item values (0,'"+item_name+"','"+item_brand+"','"+item_qty+"','"+item_price+"','"+item_supplier+"','"+item_discription+"')";
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


public static List<Item> selectAllItems() {
    	
        List<Item> items = new ArrayList<>();

        try (Connection con = ItemDBConnect.getConnection();
             PreparedStatement ps = con.prepareStatement("SELECT * FROM item");
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                Item item = new Item();
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


public static List<Item> getItemData(String item_ids) {
	int itemId = Integer.parseInt(item_ids);
	ArrayList<Item> items = new ArrayList<>();
	System.out.println("Redy to Update Items DB util passed converted Val item id = '"+item_ids+"'");
	System.out.println("Redy to Update Items DB util passed converted Val item id = '"+itemId+"'");
	try {
		
		con = DBConnect.getConnection();
		stmt = con.createStatement();
		String sql = "select * from item where item_id='"+itemId+"'";
		rs = stmt.executeQuery(sql);
		
		while (rs.next()) {
			int item_id = rs.getInt(1);
			String item_name = rs.getString(2);
			String item_brand = rs.getString(3);
			int item_qty = rs.getInt(4);
			String item_price = rs.getString(5);
			String item_supplier = rs.getString(6);
			String item_discription = rs.getString(7);

			System.out.println("Redy to Update Items DB util Receved item name Val  = '"+item_name+"'");
			System.out.println("Redy to Update Items DB util Receved item name Val  = '"+item_brand+"'");
		    Item itm = new Item(item_id, item_name, item_brand, item_qty, item_price, item_supplier, item_discription);
			items.add(itm);
		}
		
		
	} catch (Exception e) {
		
	}
	
	return items;	
}




public static boolean updateitem(String item_id, String item_name, String item_brand, String item_qty,
		String item_price, String item_supplier, String item_discription) {

	boolean isSuccess = false;
	try {
		
		int item_idn = Integer.parseUnsignedInt(item_id);
		
		con = DBConnect.getConnection();
		stmt = con.createStatement();
		System.out.println("Passed Value to Update UTIL Servlet = '"+item_idn+"'");
		System.out.println("Passed Value to Update UTIL Servlet = '"+item_name+"'");
		String sql = "update item set item_name='"+item_name+"',item_brand='"+item_brand+"',item_qty='"+item_qty+"',item_price='"+item_price+"',item_supplier='"+item_supplier+"',item_discription='"+item_discription+"' where item_id='"+item_idn+"'";    
		int rs = stmt.executeUpdate(sql);
		
		if(rs > 0) {
			isSuccess = true;
			System.out.println("Display If Update Sucsess = '"+item_idn+"'");
		}
		else {
			System.out.println("Display If Update UnSucsess FAIL = '"+item_idn+"'");
			isSuccess = false;
		}
		
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	
	return isSuccess;
}


public static boolean deleteItem(String item_id) {
	boolean isSuccess = false;
	System.out.println("Delete Class String Id val  = '"+item_id+"'");
	int item_ids = Integer.parseInt(item_id);
	System.out.println("Delete Class Converted INT Id val  =  '"+item_ids+"'");
	
	try {
		
		con = DBConnect.getConnection();
		stmt = con.createStatement();
		String sql = "delete from item where item_id='"+item_ids+"'";
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

public static List<Supplier> selectAllUsers() {
	
    List<Supplier> users = new ArrayList<>();

    try (Connection con = ItemDBConnect.getConnection();
         PreparedStatement ps = con.prepareStatement("SELECT * FROM suplier");
         ResultSet rs = ps.executeQuery()) {

        while (rs.next()) {
        	Supplier user = new Supplier();
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
	
}















