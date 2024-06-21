package Assignment2;
//For Account Class implement deposit and withdraw methods. Identify possible exceptions and create custom exception classes for the same. Display meaningful error messages.
public class Account
{

    private int acno;
    private int acpin;
    private double acbal;
    private String acname;
    public static double min_bal = 1000;

    public Account(int acno, String  acname, double acbal, int acpin)
    {
        this.acbal = acbal;
        this.acname = acname;
        this.acno = acno;
        this.acpin = acpin;
    }

    public String getAcname() {
        return this.acname;
    }
    public void setAcname(String acname) {
        this.acname = acname;
    }

    public double getAcbal() {
        return this.acbal;
    }
    public void setAcbal(double acbal) {
        this.acbal = acbal;
    }

    public int getAcno() {
        return acno;
    }
    public void setAcno(int acno)
    {
        this.acno = acno;
    }

    public int getAcpin(){
        return acpin;
    }
    public void setAcpin(int acpin) {
        this.acpin = acpin;
    }

    public void deposit(double amount)
    {
        this.acbal = this.acbal + amount;
    }

    public void withdraw(double amount)
    {
        this.acbal = this.acbal - amount;
    }

    public void displayALL()
    {
        toString();
    }
    public String toString()
    {
        return "Account Name: "+acname+" Account Number: "+acno+" Balance: "+acbal+" PIN: "+acpin;
    }
}
