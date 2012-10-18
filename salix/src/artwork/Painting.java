package artwork;

public class Painting extends Artwork {
	private double height, width;
	private String surface;
	
	public Painting(double price, boolean forSale, String title, String medium,
			int yearCreated, double height, double width, String surface, String loadDate) {
		super(price, forSale, title, medium, yearCreated, loadDate);
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
		return super.toString() + "\n" + height + "x" + width + "\n" + "on " + surface; 
	}

}
