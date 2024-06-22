package grocery;

import java.time.LocalDateTime;
import java.util.*;
public class Grocery {
	private String name;
	private int price;
	private int quantity;
	private LocalDateTime dateTime;

	public Grocery(String name, int price, int quantity, LocalDateTime dateTime) {
		super();
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		this.dateTime = LocalDateTime.now();
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public LocalDateTime getdateTime() {
		return dateTime;
	}
	public void setUpdateDateTime(LocalDateTime dateTime) {
		this.dateTime = dateTime;
	}

	@Override
	public String toString() {
		return "Grocery [name=" + name + ", price=" + price + ", quantity=" + quantity + ", dateTime="
				+ dateTime + "]";
	}
	
	
	

}
