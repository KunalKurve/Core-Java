package Assignment6.Submit;

public class WithdrawDeposit
{
    private double bal = 0;

    public synchronized void Deposit(double values)
    {
        System.out.println("Waiting to Deposit.");
        bal = bal+values;
        System.out.println("Deposit Completed!");
        System.out.println("Balance = "+bal);
        notify();
    }

    public synchronized void Withdraw(double values)
    {
        if (bal<values)
        {
            System.out.println("Insufficient Balance");
        }
        else
        {
            bal = bal - values;
            System.out.println("Withdraw Completed!");
            System.out.println("Balance = "+bal);
        }
        notify();
    }
}
