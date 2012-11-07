package products;

import java.text.NumberFormat;

public class LineItem {
	private Product product;
	private int quantity;
	private double totalPrice;
	
	public LineItem() {
		product = null;
		quantity = 0;
	} // there is nothing in the line item
	
	public LineItem(Product product, int quantity) {
		this.product = product;
		this.quantity = quantity;
	}
	
	public Product getProduct() {
		return product;
	}
	
	public void setProduct(Product product) {
		this.product = product;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public double getTotalPrice() {
		if (product==null) {
			return 0;
		}
		double individualPrice = product.getPrice();
		totalPrice = quantity * individualPrice;
		return totalPrice;
	}
	
	public String getTotalPriceString() {
		String totalPriceString = NumberFormat.getCurrencyInstance().format(totalPrice);
		return totalPriceString;
	}
}