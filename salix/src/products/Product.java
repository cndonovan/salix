package products;

public abstract class Product {
	private int product_id;
	private double price;
	private boolean for_sale;
	
	public Product(int product_id, double price, boolean for_sale) {
		this.product_id = product_id;
		this.price = price;
		this.for_sale = for_sale;
	}
	
	public int getProductID() {
		return this.product_id;
	}
	
	public void setProductID(int product_id) {
		this.product_id = product_id;
	}
	
	public double getPrice() {
		return this.price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public boolean isForSale() {
		return this.for_sale;
	}
	
	public void setForSale(boolean for_sale) {
		this.for_sale = for_sale;
	}
	
	public String toString() {
		return "\nProduct ID: " + this.product_id + 
				"\nPrice: " + this.price + 
				"\nFor Sale: " + this.for_sale; 
	}

}
