package products;

public abstract class Product {
	private String id;
	private double price;
	private boolean isForSale;
	String date_uploaded;
	
	public Product(String id, double price, boolean isForSale, String date_uploaded) {
		this.id = id;
		this.price = price;
		this.isForSale = isForSale;
		this.date_uploaded = date_uploaded;
	}
	
	public String getId() {
		return this.id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public double getPrice() {
		return this.price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public boolean getIsForSale() {
		return this.isForSale;
	}
	
	public void setIsForSale(boolean isForSale) {
		this.isForSale = isForSale;
	}
	
	public String toString() {
		return "\nID :" + this.id + "\nPrice: " + this.price + "\nFor Sale: " + this.isForSale; 
	}

}
