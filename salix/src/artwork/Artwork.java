package artwork;

public abstract class Artwork {
	private double price;
	private boolean forSale;
	private String title, medium;
	private int yearCreated;
	String date;
	
	public Artwork(double price, boolean forSale, String title, String medium, int yearCreated, String date){
		this.price = price;
		this.forSale = forSale;
		this.title = title;
		this.medium = medium;
		this.yearCreated = yearCreated;
		this.date = date;
	}
	
	public void setPrice(double price){
		this.price = price;
	}
	public double getPrice(){
		return price;
	}
	public void setForSale(boolean forSale){
		this.forSale = forSale;
	}
	public boolean getForSale(){
		return this.forSale;
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
	public void setYearCreated(int yearCreated){
		this.yearCreated = yearCreated;
	}
	public int getYearCreated(){
		return yearCreated;
	}
	public String toString() {
		String toReturn = title + ", " + medium + ", " + yearCreated;
		if (forSale) {
			toReturn = toReturn + "(" + price + ")";
		}
		return toReturn;
	}
}
