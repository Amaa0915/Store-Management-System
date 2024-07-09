package com.oder;

public class Oders {
	private int order_id;
	private String item_id;
	private String item_name;
	private String qty;
	private String date;
	private String sup_id;
	
	public Oders() {
		
	}

	public Oders(int order_id, String item_id, String item_name, String qty, String date, String sup_id) {
		super();
		this.order_id = order_id;
		this.item_id = item_id;
		this.item_name = item_name;
		this.qty = qty;
		this.date = date;
		this.sup_id = sup_id;
	}

	public int getOrder_id() {
		return order_id;
	}

	public String getItem_id() {
		return item_id;
	}

	public String getItem_name() {
		return item_name;
	}

	public String getQty() {
		return qty;
	}

	public String getDate() {
		return date;
	}

	public String getSup_id() {
		return sup_id;
	}

	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}

	public void setItem_id(String item_id) {
		this.item_id = item_id;
	}

	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}

	public void setQty(String qty) {
		this.qty = qty;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public void setSup_id(String sup_id) {
		this.sup_id = sup_id;
	}
	

	
}
