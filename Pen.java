package papers;

import java.time.LocalDate;

public class Pen {
	private static int cnt;
	protected int id = autoGenerate();
	protected String brand;
	protected String color;
	protected String inkcolor;
	protected String material;
	protected int stock;
	protected LocalDate update;
	protected LocalDate listing;
	protected double price;
	protected double discount;
	
	
	
	public Pen(String brand, String color, String inkcolor, String material, int stock, LocalDate update, LocalDate listing, double price,
			double discount) {
		this.stock = stock;
		this.color = color;
		this.inkcolor = inkcolor;
		this.material = material;
		this.brand = brand;
		this.price = price;
		this.discount = discount;
		this.update = update;
		this.listing = listing;
	}
	
	public Pen(int id, int stock) {
		this.id = id;
		this.stock = stock;
	}
	
	private static int autoGenerate() {
		cnt++;
		return cnt;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getInkcolor() {
		return inkcolor;
	}

	public void setInkcolor(String inkcolor) {
		this.inkcolor = inkcolor;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public LocalDate getUpdate() {
		return update;
	}

	public void setUpdate(LocalDate update) {
		this.update = update;
	}

	public LocalDate getListing() {
		return listing;
	}

	public void setListing(LocalDate listing) {
		this.listing = listing;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	@Override
	public String toString() {
		return "Pen [id=" + id + ", brand=" + brand + ", color=" + color + ", inkcolor=" + inkcolor + ", material="
				+ material + ", stock=" + stock + ", update=" + update + ", listing=" + listing + ", price=" + price
				+ ", discount=" + discount + "]";
	}
	
	
}
