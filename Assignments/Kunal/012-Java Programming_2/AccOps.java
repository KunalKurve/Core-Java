package Assignment2;

import java.util.Scanner;

public class AccOps
{
    public static void newDepo(Account ac, int nacno, int nacp, double depo) throws CustomException
    {
        if ((ac.getAcno() == nacno) && (ac.getAcpin() == nacp))
        {
            ac.deposit(depo);
            System.out.println("Deposit Successful");
            ac.displayALL();
        }
        else
        {
            throw new CustomException("Incorrect Credentials!");
        }
    }

    public static void newWithd(Account ac, int nacno, int nacp, double amt) throws CustomException {
        if ((ac.getAcno() == nacno) && (ac.getAcpin() == nacp))
        {
            if((ac.getAcbal() - amt)> ac.min_bal)
            {
                ac.withdraw(amt);
                System.out.println("Withdraw Successful");
                ac.displayALL();
            }
            else
            {
                throw new CustomException("Insufficient Balance");
            }
        } else
        {
            throw new CustomException("Incorrect Credentials!");
        }

    }
    public static void main(String[] args)
    {
        Account ac = new Account(1234,"ABC" ,100000.0, 1234);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter amount to Deposit:" );
        double depo = sc.nextDouble();
        System.out.println("Enter amount to Withdraw:" );
        double amt = sc.nextDouble();

        System.out.println("Enter Account no:");
        int nacno = sc.nextInt();
        System.out.println("Enter PIN:");
        int nacp = sc.nextInt();

        try
        {
            newDepo(ac,nacno,nacp,depo);
            newWithd(ac,nacno,nacp,amt);
        }
        catch (CustomException e)
        {
            System.out.println(e);
        }
        finally
        {
            sc.close();
            System.out.println("Thank You for banking with us!");
        }
    }
}