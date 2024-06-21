package day4;

import java.util.HashSet;
import java.util.Set;

public final class Car 
{
	private final String name;
	private final String model;
	private final double price;
	private final Set<String> colors;
	
	public Car(String name, String model, double price, Set<String> colors)
	{
		this.name = name;
		this.model = model;
		this.price = price;
		this.colors = colors;	
//		CarSpecs
	}
	
	public String getName() 
	{
		return this.name;
	}
	public String getModel() 
	{
		return this.model;
	}
	public double getPrice() 
	{
		return this.price;
	}
	public Set<String> getColors() 
	{
		return new HashSet<>(colors);
	}
	
	public String toString()
	{
		return "Name: "+name+" Model: "+model+" Price: "+price+" Color: "+colors;
		
	}
	
	public static void main (String [] args)
	{
		Set<String> colors = new HashSet<>();
		colors.add("Black");
		colors.add("Red");
		Car c1 = new Car("Hyrider","V",2000000,colors);
		System.out.println(c1);
		
		c1.getColors().add("Grey");
		System.out.println(c1);
	}
}
