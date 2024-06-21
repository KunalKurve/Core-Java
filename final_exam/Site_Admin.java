package final_exam;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;



public class Site_Admin {
	
	static List<Cloth> list = new ArrayList<Cloth>();
	static Scanner sc = new Scanner(System.in);
    static int count = 0;
    

	private static int idGenerator() {

	        count++;
	        return count;
	}
	
	public static List<String> listOfCloths() {
        List<String> ClothList = new ArrayList<String>();
        System.out.println("Enter list of species else enter 'Exit':");
        String str = "";
        while (!str.toLowerCase().equals("exit")) {
        	ClothList.add(str);
            str = sc.next();
        }

        return ClothList;
    }


	
	public static void addCloth() {
	    int id = idGenerator();
	    System.out.print("Enter Cloth Category: ");
	    String category = sc.next();
	    
	    System.out.print("Enter Cloth STOCK: ");
	    int stock = sc.nextInt();
	    
	    System.out.println("Enter Stock update Date: ");
	    System.out.print("Enter DATE: ");
	    int date = sc.nextInt();
	    System.out.print("Enter MONTH: ");
	    int month = sc.nextInt();
	    System.out.print("Enter YEAR: ");
	    int year = sc.nextInt();
	    LocalDate updatestock = LocalDate.of(year, month, date);
	    
	    System.out.print("Enter Cloth Size: ");
	    String size = sc.next();

	    System.out.print("Enter PRICE: ");
	    int price = sc.nextInt();

	    System.out.print("Enter Cloth Brand: ");
	    String brand = sc.next();

	    System.out.print("Enter Cloth Color: ");
	    String color= sc.next();

	    Cloth cl = new Cloth(id,category,stock,size,updatestock,price,brand,color,0.0);
	    list.add(cl);
	    System.out.println("Added Successfully!");
	}
	
	  public static void updateClothStock() {
	        System.out.print("Enter ID:");
	        int id = sc.nextInt();
	        boolean flag = false;

			for (Cloth cl : list) {
	            if (cl.getId() == id) {
	                flag = true;
	                System.out.print("Enter VALUE of STOCK: ");
	                int stock = sc.nextInt();
	                LocalDate currDate = LocalDate.now();

	                cl.setStock(stock);
	                cl.setUpdatestock(currDate);
	            }
	        }

	        if (flag) {
	            System.out.println("Cloth Stock Updated Successfully!");
	        } else {
	            System.out.println("ID Not Found!");
	        }
	  }
	  
	    public static void removeCloth() {
	        try {
	            LocalDate currDate = LocalDate.now();
	            for (Cloth cl : list) {
	                int months = (int) cl.getUpdatestock().until(currDate, ChronoUnit.MONTHS);
	                if (months >= 2) {
	                    list.remove(cl);
	                }
	            }
	        }
	        catch (Exception e) {
	        }
	        System.out.println("Clothes Removed Successfully!");
	    }
	    
	    public static void displayList() {
	        for (Cloth cl : list) {
	            System.out.println(cl);
	        }
	    }
	    
	    public static void setDiscount() {
	        LocalDate currDate = LocalDate.now();
	        for (Cloth cl : list) {
	            if (cl.getCategory().equals("MENS_SHIRTS")&& cl.getBrand().equals("Raymond")) {
	                cl.setDiscount(20.0);
	                double price = cl.getPrice() * 0.80;
	                cl.setPrice(price);
	            }
	        }
	        System.out.println("Discount Updated Successfully!");
	    }
	public static void main(String[] args) {

		int choice=0;

		while(choice != 6) {
			System.out.println("------------MENU--------------"+"\n"+
					"1. Add new Cloth\n" +
					"2. Update stock of a Cloth\n" +
					"3.Set discount(in %) for all the clothes of a given category and brands\n"+
					"4. Remove Clothes which are never sold in last 2 months.\n" +
					"5. Display all Clothes in stock\n" +
					"6. Exit\n");

				choice = sc.nextInt();

			switch(choice){
			case 1:
				addCloth();
                break;
			case 2:
				updateClothStock();
				break;
			case 3:
				setDiscount();
				break;
				
			case 4:
				removeCloth();
				break;
				
			case 5:
				displayList();
				break;

			case 6:
				System.out.println("Thank you for using our Application:");
				break;
				
			default:
				System.out.println("Please enter valid choice.");
			}	
		}
	}
}