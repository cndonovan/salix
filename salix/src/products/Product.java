package products;

public abstract class Product {
	private int id;
	private double price;
	private boolean isForSale;
	String date_uploaded;
	
	// Check this implementation
	private static int highest_index = 0;
	
	public Product(double price, boolean isForSale, String date_uploaded) {
		this.id = highest_index++;
		this.price = price;
		this.isForSale = isForSale;
		this.date_uploaded = date_uploaded;
	}
	
	public int getId() {
		return this.id;
	}
	
	public void setId(int id) {
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
