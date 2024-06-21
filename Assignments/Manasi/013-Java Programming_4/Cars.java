package Assignment5;

//1. Print all stock for the specific model and car.
//2. Group the data by model
//3. Count no of cars per model
//4. Sort by price
//5. Sort by manufacturing year
public class Cars
{
    private String name, model;
    private int modelCount, year;
    private double price;

    public Cars(String name,String model, int modelCount, int year, double price)
    {
        this.name = name;
        this.model = model;
        this.modelCount = modelCount;
        this.year = year;
        this.price = price;
    }

    public String getName() {return name;}
    public String getModel() {return model;}
    public int getModelCount() {
        return modelCount;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Name:" + name +", Model: "+model+ ", Model Count: " + modelCount + ", Year: " + year +", Price: " + price;
    }
}
