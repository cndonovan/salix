package products;

public class Painting extends Artwork {
	private double height, width;
	private String surface;
	
	public Painting(	double price, boolean isForSale, String date_uploaded,
						String title, String medium, int year_created,
						double height, double width, String surface) {
		super(price, isForSale, date_uploaded, title, medium, year_created);
		this.height = height;
		this.width = width;
		this.surface = surface;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	public double getHeight() {
		return height;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getWidth() {
		return width;
	}
	public void setSurface(String surface) {
		this.surface = surface;
	}
	public String getSurface() {
		return surface;
	}
	public String toString() {
		return super.toString() + "\nHeight: " + height + "\nWidth: " + width + "\nSurface: " + surface; 
	}

}
