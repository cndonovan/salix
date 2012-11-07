package products;

public abstract class Artwork extends Product {;
	private String title, medium;
	private int year_created;
	
	public Artwork(	String id, double price, boolean is_for_sale, String date_uploaded, 
					String title, String medium, int year_created) {
		super(id, price, is_for_sale, date_uploaded);
		this.title = title;
		this.medium = medium;
		this.year_created = year_created;
	}
	
	public void setTitle(String title){
		this.title = title;
	}
	
	public String getTitle(){
		return title;
	}
	
	public void setMedium(String medium){
		this.medium = medium;
	}
	
	public String getMedium(){
		return medium;
	}
	
	public void setYearCreated(int year_created){
		this.year_created = year_created;
	}
	
	public int getYearCreated(){
		return year_created;
	}
	
	public String toString() {
		return super.toString() + "\nTitle: " + title + "\nMedium: " + medium + "\nYear: " + year_created;
	}
}
