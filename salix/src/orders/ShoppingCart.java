package orders;

import java.util.HashMap;

import database.Database;
import products.Product;

public class ShoppingCart {
	private HashMap<Integer, LineItem> cart;
		
	public ShoppingCart() {
		cart = new HashMap<Integer, LineItem>();
	}
	
	public Product getProduct(int product_id) {
		return cart.get(product_id).getProduct();
	}
	
	public int getQuantity(int product_id) {
		return cart.get(product_id).getQuantity();
	}
	
	public int getNumberOfProducts() {
		int sum = 0;
		for (Integer key : cart.keySet()) {
			sum = sum + getQuantity(key);
		}
		return sum;
	}
	
	public void addProduct(int product_id) {
		if (cart.containsKey(product_id)) {
			cart.put(product_id, new LineItem(getProduct(product_id), getQuantity(product_id) + 1));
		} else {
			cart.put(product_id, new LineItem(Database.getPainting(product_id)));
		}
	}
	
	public void removeProduct(int product_id){
		if (cart.containsKey(product_id)) {
			int quantity = getQuantity(product_id);
			if (quantity == 1) {
				cart.remove(product_id);
			} else {
				cart.put(product_id, new LineItem(getProduct(product_id), quantity - 1));
			}
		}
	}
	
	public void removeLineItem(int product_id) {
		if (cart.containsKey(product_id)) {
			cart.remove(product_id);
		}
	}
	
	public LineItem[] getLineItems() {
		return cart.values().toArray(new LineItem[0]);
	}

	public void emptyCart() {
		cart = new HashMap<Integer, LineItem>();
	}

}
