package final_exam;

import java.time.LocalDate;

public class Cloth {
	int id;
	
	 String category;
	 
	int stock;
	
	String size;
	
	LocalDate updatestock;

	double  price;
	
	String brand;
	
	String color;
	
	double discount;




	public Cloth(int id, String category, int stock, String size, LocalDate updatestock,double price, String brand,
			String color, double discount) {
		super();
		this.id = id;
		this.category = category;
		this.stock = stock;
		this.size = size;
		this.updatestock = updatestock;
		this.price = price;
		this.brand = brand;
		this.color = color;
		this.discount = discount;
	}






	public int getId() {
		return id;
	}






	public void setId(int id) {
		this.id = id;
	}






	public String getCategory() {
		return category;
	}






	public void setCategory(String category) {
		this.category = category;
	}






	public int getStock() {
		return stock;
	}






	public void setStock(int stock) {
		this.stock = stock;
	}






	public String getSize() {
		return size;
	}






	public void setSize(String size) {
		this.size = size;
	}






	public LocalDate getUpdatestock() {
		return updatestock;
	}






	public void setUpdatestock(LocalDate updatestock) {
		this.updatestock = updatestock;
	}






	public double getPrice() {
		return price;
	}






	public void setPrice(double price) {
		this.price = price;
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






	public double getDiscount() {
		return discount;
	}






	public void setDiscount(double discount) {
		this.discount = discount;
	}






	@Override
	public String toString() {
		return "Cloth [id=" + id + ", category=" + category + ", stock=" + stock + ", size=" + size + ", updatestock="
				+ updatestock + ", price=" + price + ", brand=" + brand + ", color=" + color + ", discount=" + discount
				+ "]";
	}




	
	
	
	
	

}
