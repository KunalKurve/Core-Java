package watch;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class AdminInterface {
	private static List<Watch>watches=new ArrayList<>();
	
	
	public void addNewWatch(Scanner sc) {
		System.out.println("Enter watch details...");
		System.out.println("Name:");
		String name=sc.nextLine();
		System.out.println("Category(Men/Women):");
		String category=sc.nextLine();
		System.out.println("brand(CASIO/TITAN):");
		String brand=sc.nextLine();
		System.out.println("shape(SQUARE/RECTANGLE/ROUND):");
		String shape=sc.nextLine();
		System.out.println("style(CASUAL/SPORT/WEDDING):");
		String style=sc.nextLine();
		System.out.println("watchMaterial(CERAMIC/STEEL/SILVER):");
		String watchMaterial=sc.nextLine();
		System.out.println("stock:");
		double stock=sc.nextInt();
		System.out.println("price:");
		double price=sc.nextInt();
		
		Watch newWatch = new Watch(name, category, brand, shape, style,null, (int) stock, null,null, price,0);
        watches.add(newWatch);
        System.out.println("New watch added successfully.");
    
	}
	private static Watch findWatchById(int id) {
		for (Watch watch:watches) {
			if(watch.getId()==id) {
				return watch;
			}
		}
		return null;
	}
	private static void updateStock(Scanner sc) {
		System.out.println("Enter watch Id to update stock:");
		int watchId=sc.nextInt();
		System.out.println("Enter quantity to add:");
		int quantity=sc.nextInt();
		
		Watch watch=findWatchById(watchId);
		if(watch!=null) {
			watch.updateStock(quantity);
			System.out.println("Stock updated successfully.");
		}else {
			System.out.println("Watch not found.");
		}
	}
	
	private static void applyDiscountForWatch() {
		for(Watch watch:watches) {
			if(watch.isOld()) {
				watch.applyDiscount(10.0);
			}
		}
		System.out.println("Discount applied to old watches...");
	}
	
	private void removeWatchesNeverSold() {
		Calendar calendar=Calendar.getInstance();
		calendar.setTime(new Date());
		calendar.add(Calendar.MONTH, -18);
        Date cutoffDate = calendar.getTime();
        Iterator<Watch> iterator = watches.iterator();
        while (iterator.hasNext()) {
            Watch watch = iterator.next();
            if (watch.getStockUpdatedate().before(cutoffDate)) {
                iterator.remove();
            }
        }
        System.out.println("Watches never sold and listed 18 months ago are removed successfully.");

	}
	
	 static Date parseDate(String dateString) {
	        try {
	            return new SimpleDateFormat("yyyy-MM-dd").parse(dateString);
	        } catch (ParseException e) {
	            e.printStackTrace();
	            return null;
	        }
	    }

	
	
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		AdminInterface admin=new AdminInterface();
		int choice;
		
		do {
			System.out.println("Menu");
			System.out.println("1.Add new watch");
			System.out.println("2.Update stock of watch");
			System.out.println("3.Set a discount for watch which are 1 year old");
			System.out.println("4.remove watches which are never sold once listed in 18 months");
			System.out.println("5.Exit");
			choice=sc.nextInt();
			sc.nextLine();
			
			switch (choice) {
			case 1:
				admin.addNewWatch(sc);
				break;
			case 2:
				admin.updateStock(sc);
				break;
			case 3:
				admin.applyDiscountForWatch();
				break;
			case 4:
				admin.removeWatchesNeverSold();
				break;
			case 5:
				System.out.println("Exit.....");
				break;
			default:
				System.out.println("Invaild choice........");
			
			
			}
			
			
		}while(choice!=5);
		sc.close();
	}
	
	

}
