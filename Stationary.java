package papers;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Stationary 
{
	List<Pen> pens = new ArrayList<>();  
	Scanner sc = new Scanner(System.in);
	
	public void addPen() throws UserException {
		String brand, color, inkcolor, material;
		double price, discount;
		int stock;
		
		System.out.println("Enter brand of pen: ");
		brand = sc.next();
		System.out.println("Enter color of pen: ");
		color = sc.next();
		System.out.println("Enter inkcolor of pen: ");
		inkcolor = sc.next();
		System.out.println("Enter material of pen: ");
		material = sc.next();
		System.out.println("Enter stock of pen: ");
		stock = sc.nextInt();
		System.out.println("Enter price of pen: ");
		price = sc.nextDouble();
		System.out.println("Enter discount of pen: ");
		discount = sc.nextDouble();
		
		Pen p = new Pen(brand, color, inkcolor, material, stock , LocalDate.now(), LocalDate.now(),  price, discount);
		
		for(Pen pen: pens){
			if (pen.id == p.id){
				throw new UserException("Pen already exists.");
			}
		}
		pens.add(p);
	}
	
	public String updateStock(int id, int newStock) {
		for(Pen pen: pens) {
			if(pen.getId() == id) {
				pen.setStock(newStock);
				pen.setUpdate(LocalDate.now());
				return "Successfully updated.";
			}
		}
		return "User not found";
	}
	
	public String setDiscount() {
		for(Pen pen: pens) {
			long months = pen.getListing().until(pen.getUpdate(), ChronoUnit.MONTHS);
			if(months >= 3) {
				pen.setDiscount(20);
				return "Discount set for pens not sold for more than 3 months";
			}
		}
		return "No pens found";
	}
	
	public void remPen() {
		for(Pen pen: pens) {
			long months = pen.getListing().until(pen.getUpdate(), ChronoUnit.MONTHS);
			if(months >= 9) {
				pens.remove(pen);
			}
		}
	}

	public static void main(String[] args) throws UserException {
		Scanner sc = new Scanner(System.in);
		Stationary s = new Stationary();
		s.pens.add(new Pen("Cello", "blue", "red", "plastic", 40, LocalDate.now(), LocalDate.of(2023, 1, 17), 20, 10));
		s.pens.add(new Pen("Linc", "black", "blue", "metal", 30, LocalDate.now(), LocalDate.of(2024, 3, 17), 15, 15));
		int ch = 0;
		while(ch!=5) {
			System.out.println("1.Add Pen\n2.Update Stock\n3.Set discount\n4.Remove Pens");
			ch = sc.nextInt();
			
			switch (ch){
			case 1:
				s.addPen();
				break;
			case 2:
				System.out.print("Enter pen id: ");
				int id = sc.nextInt();
				System.out.println("Enter pen stock");
				int stock = sc.nextInt();
				System.out.println(s.updateStock(id, stock));
				break;
			case 3:
				System.out.println(s.setDiscount());
				break;
			case 4:
				s.remPen();
				break;
			case 6:
				for(Pen p: s.pens) {
					System.out.println(p.toString());
				}
				break;
		}
	}
		sc.close();
	}
}
