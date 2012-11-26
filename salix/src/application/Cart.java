package application;

import java.util.HashMap;

public class Cart {
	// add limits?
	private HashMap<String, Integer> items;
	private int total;
		
	public Cart() {
		items = new HashMap<String, Integer>();
		total = 0;
	}
	
	public int getTotal() {
		return total;
	}
	
	public int getQuantityOfItem(String id) {
		return items.get(id);
	}
	
	public void addItem(String id) {
		if (items.containsKey(id)) {
			items.put(id, items.get(id) + 1);
		} else {
			items.put(id, 1);
		}
		total++;
	}
	
	public void removeItem(String id){
		if (items.containsKey(id)) {
			int quantity = items.get(id);
			if (quantity == 1){
				items.remove(id);
			} else {
				items.put(id, quantity - 1);
			}
			total--;
		}
	}
	
	public void removeAllItems(String id) {
		if (items.containsKey(id)) {
			int quantity = items.get(id);
			items.remove(id);
			total = total - quantity;
		}
	}
	
	public String[] getItems() {
		return items.keySet().toArray(new String[0]);
	}
}
