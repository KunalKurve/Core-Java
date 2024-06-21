package Assignment3;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//
public class Account implements Comparable<Account>
{
    int acid;
    String acname, ifsc;
    double acbal;

    public Account(int acid, String acname, String ifsc, double acbal)
    {
        this.acid = acid;
        this.acname = acname;
        this.ifsc = ifsc;
        this.acbal = acbal;
    }
    @Override
    public String toString()
    {
        return "Account ID: "+acid+", Name: "+acname+", Balance: "+acbal+", IFSC: "+ifsc;
    }

    @Override
    public int compareTo(Account a)
    {
        return this.acid-a.acid;
    }


}