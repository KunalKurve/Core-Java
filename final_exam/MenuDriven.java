package final_exam;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class MenuDriven {
    static List<ToyClass> list = new ArrayList<ToyClass>();
    static Scanner sc = new Scanner(System.in);
    static int count = 0;

    //	ID Auto Generator
    public static int idGenerator() {
        count++;
        return count;
    }

    //	List of Species
    public static List<String> listOfSpecies() {
        List<String> speciesList = new ArrayList<String>();
        System.out.println("Enter list of species else enter 'Exit':");
        String str = "";
        while (!str.toLowerCase().equals("exit")) {
            speciesList.add(str);
            str = sc.next();
        }

        return speciesList;
    }

    //	Add Toy
    public static void addToy() {
        int id = idGenerator();
        System.out.print("Enter Toy Name: ");
        String name = sc.next();

        System.out.print("Enter Toy Brand: ");
        String brand = sc.next();

        List<String> species = listOfSpecies();

        System.out.print("Enter Toy Material: ");
        String material = sc.next();

        System.out.print("Enter Toy STOCK: ");
        int stock = sc.nextInt();

        System.out.println("Enter LISTING DATE: ");
        System.out.print("Enter DATE: ");
        int date = sc.nextInt();
        System.out.print("Enter MONTH: ");
        int month = sc.nextInt();
        System.out.print("Enter YEAR: ");
        int year = sc.nextInt();
        LocalDate listingDate = LocalDate.of(year, month, date);

        System.out.print("Enter PRICE: ");
        double price = sc.nextDouble();

        ToyClass toy = new ToyClass(id, name, brand, species, material, stock, listingDate, listingDate, price, 0.0);
        list.add(toy);
        System.out.println("Added Successfully!");
    }

    //	Update Stock of a Toy
    public static void updateToyStock() {
        System.out.print("Enter ID:");
        int id = sc.nextInt();
        boolean flag = false;

        for (ToyClass toy : list) {
            if (toy.getId() == id) {
                flag = true;
                System.out.print("Enter VALUE of STOCK: ");
                int stock = sc.nextInt();
                LocalDate currDate = LocalDate.now();

                toy.setStock(stock);
                toy.setUpdateDate(currDate);
            }
        }

        if (flag) {
            System.out.println("Toy Stock Updated Successfully!");
        } else {
            System.out.println("ID Not Found!");
        }
    }

    //	Set Discount of 20% for all Toys which are 1 year Old
    public static void setDiscount() {
        LocalDate currDate = LocalDate.now();
        for (ToyClass toy : list) {
            Period period = Period.between(toy.getListingDate() , currDate);
            if (period.getYears() >= 1 && period.getMonths() >= 0 && period.getDays() >= 0) {
                toy.setDiscount(20.0);
                double price = toy.getPrice() * 0.80;
                toy.setPrice(price);
            }
        }
        System.out.println("Discount Updated Successfully!");
    }

    //	Remove Toys which are never sold once listed in 9 months
    public static void removeToys() {
        try {
            LocalDate currDate = LocalDate.now();
            for (ToyClass toy : list) {
                int months = (int) toy.getUpdateDate().until(currDate, ChronoUnit.MONTHS);
                if (months >= 9) {
                    list.remove(toy);
                }
            }
        }
        catch (Exception e) {
        }
        System.out.println("Toys Removed Successfully!");
    }

    //	Display List of Toys
    public static void displayList() {
        for (ToyClass toy : list) {
            System.out.println(toy);
        }
    }

    public static void main(String[] args) {
        int choice = 0;

        while(choice != 6) {
            System.out.println("""
1. Add New Toy
2. Update Stock of a Toy
3. Set Discount of 20% for all Toys which are 1 year Old
4. Remove Toys which are never sold once listed in 9 months
5. Display List
6. Exit
Enter Choice: """);
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    addToy();
                    break;
                case 2:
                    updateToyStock();
                    break;
                case 3:
                    setDiscount();
                    break;
                case 4:
                    removeToys();
                    break;

                case 5:
                    displayList();
                    break;

                case 6:
                    System.out.println("Thank You For Visiting!");
                    break;

                default:
                    System.out.println("Invalid Input!");
                    break;
            }
        }
    }
}
