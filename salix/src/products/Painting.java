package products;

public class Painting extends Product {
	private String title, medium, surface, file;
	private int year_created;
	private double width, height;
	
	
	public Painting(int product_id, String title, int year_created, 
					double width, double height, String medium, 
					String surface, String file, double price, 
					boolean for_sale) {
		super(product_id, price, for_sale);
		this.title = title;
		this.year_created = year_created;
		this.width = width;
		this.height = height;
		this.medium = medium;
		this.surface = surface;
		this.file = file;
	}
	
	
	public void setTitle(String title) { 
		this.title = title;
	}
	public String getTitle() {
		return title;	
	}
	
	
	public void setYearCreated(int year_created) { 
		this.year_created = year_created; 
	}
	public int getYearCreated() { 
		return year_created; 
	}
	
	
	
	public void setWidth(double width) { 
		this.width = width;
	}
	public double getWidth() { 
		return width; 
	}
	
	
	public void setHeight(double height) { 
		this.height = height;
	}
	public double getHeight() { 
		return height;
	}
	
	
	public void setMedium(String medium) { 
		this.medium = medium;
	}
	public String getMedium() { 
		return medium;
	}
	
	
	public String getSurface() { 
		return surface;
	}
	public void setSurface(String surface) { 
		this.surface = surface;
	}

	
	public String getFile() { 
		return file;
	}
	public void setFile(String file) { 
		this.file = file;
	}

	
	public String toString() {
		return super.toString() +
				"\nTitle: " + title +
				"\nYear: " + year_created +
				"\nWidth: " + width + 
				"\nHeight: " + height + 
				"\nMedium: " + medium + 
				"\nSurface: " + surface; 
	}
}
