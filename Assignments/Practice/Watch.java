package watch;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
enum Category { MEN, WOMEN }
enum Brand { CASIO, TITAN }
enum Shape { SQUARE, RECTANGLE, ROUND }
enum Style { CASUAL, SPORT, WEDDING }
enum WatchBandMaterial { CERAMIC, STEEL, SILVER }


public class Watch {
	private static int idCounter=1;
	private int id;
	private String name;
	private String category;
	private String brand;
	private String shape;
	private String style;
	private String watchMaterial;
	private int stock;
	private Date stockListingDate;
	private Date stockUpdatedate;
	private double price;
	private double discount;
	
	

	public Watch(String name, String category, String brand, String shape, String style, String watchMaterial,
			int stock, Date stockListingDate, Date stockUpdatedate, double price, double discount) {
		super();
		this.id =idCounter++;
		this.name = name;
		this.category = category;
		this.brand = brand;
		this.shape = shape;
		this.style = style;
		this.watchMaterial = watchMaterial;
		this.stock = stock;
		this.stockListingDate =stockListingDate;
		this.stockUpdatedate = stockUpdatedate;
		this.price = price;
		this.discount = 0.0;
	}
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getShape() {
		return shape;
	}
	public void setShape(String shape) {
		this.shape = shape;
	}
	public String getStyle() {
		return style;
	}
	public void setStyle(String style) {
		this.style = style;
	}
	public String getWatchMaterial() {
		return watchMaterial;
	}
	public void setWatchMaterial(String watchMaterial) {
		this.watchMaterial = watchMaterial;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public Date getStockListingDate() {
		return stockListingDate;
	}
	public void setStockListingDate(Date stockListingDate) {
		this.stockListingDate = stockListingDate;
	}
	public Date getStockUpdatedate() {
		return stockUpdatedate;
	}
	public void setStockUpdatedate(Date stockUpdatedate) {
		this.stockUpdatedate = stockUpdatedate;
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
	
	
	
	
	
	public Date stockUpdatedate() {
		return stockUpdatedate;
	}
	public void updateStock(int quantity) {
		this.stock+=quantity;
		this.stockUpdatedate=new Date();
	}
	
	public boolean isOld() {
		Calendar calendar=Calendar.getInstance();
		calendar.setTime(new Date());
		calendar.add(Calendar.YEAR,-1);
		Date oneYearAgo=calendar.getTime();
		return stockListingDate.before(oneYearAgo);
	}
	public void applyDiscount(double discount) {
		this.discount=discount;
	}
	
	@Override
	public String toString() {
		return "Watch [id=" + id + ", name=" + name + ", category=" + category + ", brand=" + brand + ", shape=" + shape
				+ ", style=" + style + ", watchMaterial=" + watchMaterial + ", stock=" + stock + ", stockListingDate="
				+ stockListingDate + ", stockUpdatedate=" + stockUpdatedate + ", price=" + price + ", discount="
				+ discount + "]";
	}



	

	
	
	
	
	

}
