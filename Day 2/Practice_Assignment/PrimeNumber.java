package Practice_Assignment;

import java.util.Scanner;

public class PrimeNumber 
{

    
    public static void primeNo(int num)
    {
        for( int i=2;i<num; i++)
        {
            if (num%i==0)
            {
                System.out.println("Not a Prime Number");
                break;
            }
            else
            {
                System.out.println("Prime Number");
                break;
            }
        }
    }

    public static void main(String[] args) 
    {
        System.out.println("Enter a number to check if Prime or not: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        primeNo(num);
    }
}
