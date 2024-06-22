package grocery;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.*;
public class GroceryList {
	private static List<Grocery>grocery=new ArrayList<>();
	
	
	
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		GroceryList list=new GroceryList();
		int choice;
		do {
			System.out.println("Menu....");
			System.out.println("1.Add new Grocery item");
			System.out.println("2.Update quantity of Grocery item");
			System.out.println("3.Display list of grocery");
			System.out.println("4.Remove empty stock quantity in stock is zero");
			System.out.println("5.Display all product which update in last 3 days");
			System.out.println("6.Exit..");
			
			choice=sc.nextInt();
			sc.nextLine();
			switch(choice) {
			case 1:
				list.addNewGrocery(sc);
				break;
			case 2:
				list.updateGroceryQuantity(sc);
				break;
			case 3:
				list.displayGroceryList();
				break;
			case 4:
				list.removeEmptyStock();
				break;
			case 5:
                list.displayUpdatedLastThreeDays();
				break;
			case 6:
				break;
			default:
				System.out.println("Invaild choice........");
			}
		}while(choice!=6);
		sc.close();
	}



	private void addNewGrocery(Scanner sc) {
		System.out.println("Enter Grocery item to add..");
		System.out.println("Name:");
		String name=sc.nextLine();
		System.out.println("Price:");
		int price=sc.nextInt();
		System.out.println("Quantity");
		int quantity=sc.nextInt();
		grocery.add(new Grocery(name,price,quantity,LocalDateTime.now()));
		System.out.println("item added...");	
	}
	
	public void displayGroceryList() {
		if(grocery.isEmpty()) {
			System.out.println("No items in list..");
		}else {
			System.out.println("Grocery List..");
			for(Grocery item:grocery) {
				System.out.println(item);
			}
		}
	}
	
	public void updateGroceryQuantity(Scanner sc) {
		System.out.println("enter name to update");
		String name=sc.nextLine();
		for(Grocery item:grocery) {
			if(item.getName().equalsIgnoreCase(name)) {
				System.out.println("Enter quantity");
				int quantity=sc.nextInt();
				item.setQuantity(quantity);
				item.setUpdateDateTime(LocalDateTime.now());
				System.out.println("Quantity updated");
				return;
			}
		}
		System.out.println("Grocery item not found");
	}
	
	
	public void removeEmptyStock() {
		Iterator<Grocery>iterator=grocery.iterator();
		while(iterator.hasNext()) {
			Grocery item=iterator.next();
			if(item.getQuantity()==0) {
				iterator.remove();
                System.out.println("Removed item with zero stock: " + item.getName());
			}
		}
		}
	
	private void displayUpdatedLastThreeDays() {
		LocalDateTime now=LocalDateTime.now();
		LocalDateTime threeDaysAgo=now.minus(Duration.ofDays(3));
		System.out.println("Items updated in the last 3 days:");
		for(Grocery item:grocery) {
			if(item.getdateTime().isAfter(threeDaysAgo)) {
				System.out.println(item);
			}
		}
	}

	
	

}
