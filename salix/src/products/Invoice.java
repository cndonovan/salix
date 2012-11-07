package products;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Date;

public class Invoice {
	private static int invoices = 0;
	private Date date_submitted;
	private double total_price;
	private int invoice_id;
	// collection of line items
	private ArrayList<LineItem> line_items;
	
	public Invoice() {
		this.line_items = new ArrayList<LineItem>(); 
		this.total_price = 0;
		initializeInvoice();
	} // constructor for an empty invoice
	
	public Invoice(LineItem added_item) {
		this.line_items = new ArrayList<LineItem>(); 
		this.line_items.add(added_item);
		total_price = added_item.getTotalPrice();
		initializeInvoice();
	} // constructor for an invoice with a single LineItem
	
	public Invoice (ArrayList<LineItem> added_list){
		line_items = added_list;
		total_price = 0;
		for (int i = 0; i < added_list.size(); i++) {
			total_price = total_price + added_list.get(i).getTotalPrice();
		}
		initializeInvoice();
	} // we don't expect this to be the way invoice will be handled, but preparing for the possibility
	
	private void initializeInvoice(){
		this.invoice_id = invoices;
		invoices++;
		this.date_submitted = new Date();
	} // so I don't have to keep rewriting this/can make changes easily
	
	public ArrayList<LineItem> getLineItems(){
		return line_items;
	}
	
	public void setLineItems(ArrayList<LineItem> line_items){
		this.line_items = line_items;
	}
	
	public Date getDateSubmitted(){
		return date_submitted;
	}
	
	public void setDateSubmitted(Date date_submitted){
		this.date_submitted = date_submitted;
	} // this should be used to fix faulty invoices - should not be commonly used
	
	public int getInvoiceID(){
		return invoice_id;
	}
	
	public void setInvoiceID(int invoice_id){
		this.invoice_id = invoice_id;
	} // again, this shouldn't be a regularly used method
	
	public LineItem addLineItem(LineItem line_item){
		line_items.add(line_item);
		total_price = total_price + line_item.getTotalPrice();
		return line_item;
	} // adding a lineItem to ArrayList lineItems
	
	public double getTotalPrice(){
		return total_price;
	}
	
	public String getTotalPriceString(){
		return NumberFormat.getCurrencyInstance().format(total_price);
	}
}
