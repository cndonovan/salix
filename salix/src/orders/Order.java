package orders;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Date;

import database.Database;


public class Order {
	private int order_id;
	private Date date_created;
	private ArrayList<LineItem> line_items;	
	
	public Order(LineItem line_item) {
		initialize();
		this.line_items = new ArrayList<LineItem>(); 
		this.line_items.add(line_item);
	}
	
	private void initialize(){
		this.order_id = (Database.getHighestOrderID()) + 1;
		this.date_created = new Date();
	}
	
	public Order(LineItem[] line_items) {
		initialize();
		this.line_items = new ArrayList<LineItem>(); 
		for (LineItem line_item : line_items) {
			this.line_items.add(line_item);
		}
	}
	
	public int getOrderID() {
		return order_id;
	}
	
	public void setOrderID(int order_id) {
		this.order_id = order_id;
	}
	
	public Date getDateCreated() {
		return date_created;
	}
	
	public void setDateCreated(Date date_created) {
		this.date_created = date_created;
	}
	
	public LineItem[] getLineItems(){
		return line_items.toArray(new LineItem[0]);
	}
	
	public double getCost() {
		double sum = 0;
		for (LineItem line_item : line_items ) {
			sum = sum + line_item.getCost();
		}
		return sum;
	}
	
	public String getCostString(){
		return NumberFormat.getCurrencyInstance().format(getCost());
	}
}
