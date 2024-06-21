package Practice_Assignment;

import java.util.Scanner;

public class FibboSeries 
{
    public static void fibbo(int num)
    {
        int fibo0=0, fibo1=1, fibo2, i;
        System.out.print(fibo0+" "+fibo1);
        for (i=0;i<num-2;i++)
        {
            fibo2 = fibo0 + fibo1;
            fibo0 = fibo1;
            fibo1 = fibo2;
            System.out.print(" " + fibo2);

        }
    }
    public static void main(String[] args) 
    {
            
            Scanner sc=new Scanner(System.in);  
            System.out.print("Enter the number of terms in series: ");  
            int n= sc.nextInt();
            System.out.println(n);   
            sc.close(); 
            fibbo(n);
    }
}
