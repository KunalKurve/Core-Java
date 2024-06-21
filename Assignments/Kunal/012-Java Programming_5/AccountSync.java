package Assignment6;

import Assignment6.Submit.WithdrawDeposit;

import java.awt.image.PackedColorModel;

//Write a program to deposit and withdraw from bank account using to different threads
public class AccountSync
{
    public static void main(String[] args)
    {
        WithdrawDeposit wd = new WithdrawDeposit();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                wd.Deposit(1000);
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                wd.Withdraw(500);
            }
        });
        t1.start();
        t2.start();
    }
}
