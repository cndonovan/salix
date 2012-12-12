package orders;

import java.text.NumberFormat;

import products.Product;

public class LineItem {
	private Product product;
	private int quantity;
	
	public LineItem(Product product) {
		this.product = product;
		this.quantity = 1;
	}
	
	public LineItem(Product product, int quantity) {
		this.product = product;
		this.quantity = quantity;
	}
	
	public Product getProduct() {
		return product;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public double getCost() {
		return product.getPrice() * quantity;
	}
	
	public String getCostString() {
		return NumberFormat.getCurrencyInstance().format(getCost());
	}
}