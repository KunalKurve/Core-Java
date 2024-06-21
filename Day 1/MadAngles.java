import java.util.Scanner;

public class MadAngles {
    @SuppressWarnings("resource")
    public static void main (String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 3 sides of triangle: ");
        int s1 = sc.nextInt();
        int s2 = sc.nextInt();
        int s3 = sc.nextInt();
        System.out.println("Side 1: " +s1);
        System.out.println("Side 2: " +s2);
        System.out.println("Side 3: " +s3);
        System.out.println("Perimeter: "+(s1+s2+s3));
    }
    
}
