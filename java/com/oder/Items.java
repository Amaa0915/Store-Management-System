package com.oder;

public class Items {
	private int itemId;
	private String itemName;
    private String itemBrand;
    private int itemQty;
    private String itemPrice;
    private String itemSupplier;
    private String itemDescription;

    
    /**
	 * @param itemId
	 * @param itemName
	 * @param itemBrand
	 * @param itemQty
	 * @param itemPrice
	 * @param itemSupplier
	 * @param itemDescription
	 */
	public Items(int itemId, String itemName, String itemBrand, int itemQty, String itemPrice, String itemSupplier,
			String itemDescription) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.itemBrand = itemBrand;
		this.itemQty = itemQty;
		this.itemPrice = itemPrice;
		this.itemSupplier = itemSupplier;
		this.itemDescription = itemDescription;
	}
	 
	
	public Items() {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.itemBrand = itemBrand;
		this.itemQty = itemQty;
		this.itemPrice = itemPrice;
		this.itemSupplier = itemSupplier;
		this.itemDescription = itemDescription;
	}
	
	 
	public int getItemId() {
			return itemId;
		}
		public String getItemName() {
			return itemName;
		}
		public String getItemBrand() {
			return itemBrand;
		}
		public int getItemQty() {
			return itemQty;
		}
		public String getItemPrice() {
			return itemPrice;
		}
		public String getItemSupplier() {
			return itemSupplier;
		}
		public String getItemDescription() {
			return itemDescription;
		}
		public void setItemId(int itemId) {
			this.itemId = itemId;
		}
		public void setItemName(String itemName) {
			this.itemName = itemName;
		}
		public void setItemBrand(String itemBrand) {
			this.itemBrand = itemBrand;
		}
		public void setItemQty(int itemQty) {
			this.itemQty = itemQty;
		}
	
		public void setItemPrice(String itemPrice) {
			this.itemPrice = itemPrice;
		}
		public void setItemSupplier(String itemSupplier) {
			this.itemSupplier = itemSupplier;
		}
		public void setItemDescription(String itemDescription) {
			this.itemDescription = itemDescription;
		}
}
