package final_exam;

import java.time.LocalDate;
import java.util.List;

class ToyClass {

    private int id;
    private String name;
    private String brand;
    private List<String> species;
    private String material;
    private int stock;
    private LocalDate listingDate;
    private LocalDate updateDate;
    private double price;
    private double discount;

    //	Getters and Setters
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
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public List<String> getSpecies() {
        return species;
    }
    public void setSpecies(List<String> species) {
        this.species = species;
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
    public LocalDate getListingDate() {
        return listingDate;
    }
    public void setListingDate(LocalDate listingDate) {
        this.listingDate = listingDate;
    }
    public LocalDate getUpdateDate() {
        return updateDate;
    }
    public void setUpdateDate(LocalDate updateDate) {
        this.updateDate = updateDate;
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

    //	Public Constructor
    public ToyClass(int id, String name, String brand, List<String> species, String material, int stock,
                    LocalDate listingDate, LocalDate updateDate, double price, double discount) {
        super();
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.species = species;
        this.material = material;
        this.stock = stock;
        this.listingDate = listingDate;
        this.updateDate = updateDate;
        this.price = price;
        this.discount = discount;
    }

    //	To-String Method
    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Brand: " + brand + ", Species: " + species
                + ", Material: " + material + ", Stock: " + stock + ", Listing Date: " + listingDate + ", Update Date: "
                + updateDate + ", Price: " + price + ", Discount: " + discount;
    }

}
