package com.user;

public class User {
	private int user_id;
	private String username;
	private String password;
	private String first_name;
	private String last_name;
	private String address;
	private String telephone_no;
	private String email;
	private String nic;
	private String type;
	private int status;
	public User(int user_id, String username, String password, String first_name, String last_name, String address,
			String telephone_no, String email, String nic, String type, int status) {
		super();
		this.user_id = user_id;
		this.username = username;
		this.password = password;
		this.first_name = first_name;
		this.last_name = last_name;
		this.address = address;
		this.telephone_no = telephone_no;
		this.email = email;
		this.nic = nic;
		this.type = type;
		this.status = status;
	}
	public int getUser_id() {
		return user_id;
	}
	public String getUsername() {
		return username;
	}
	public String getPassword() {
		return password;
	}
	public String getFirst_name() {
		return first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public String getAddress() {
		return address;
	}
	public String getTelephone_no() {
		return telephone_no;
	}
	public String getEmail() {
		return email;
	}
	public String getNic() {
		return nic;
	}
	public String getType() {
		return type;
	}
	public int getStatus() {
		return status;
	}
		
}
