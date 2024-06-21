package Assignment3;

import java.util.*;

public class Bank
{
    public static void displayAccounts(List<Account> lst)
    {
        System.out.println("××××××××××××××××××××××××××××××ACCOUNTS××××××××××××××××××××××××××××××");
        for(Account a:lst)
            System.out.println(a);
    }

    public static void sortById(List<Account> lst)
    {
        Collections.sort(lst);
        System.out.println("××××××××××××××××××××××××××××××SORT BY ID××××××××××××××××××××××××××××××");
        for(Account a:lst)
            System.out.println(a);
    }

    public static void sortByName(List<Account> lst)
    {
        Collections.sort(lst, new NameComparator());
        System.out.println("××××××××××××××××××××××××××××××SORT BY NAME××××××××××××××××××××××××××××××");
        for(Account a:lst)
            System.out.println(a);
    }

    public static void sortByIfsc(List<Account> lst)
    {
        Collections.sort(lst, new IfscComparator());
        System.out.println("××××××××××××××××××××××××××××××SORT BY IFSC××××××××××××××××××××××××××××××");
        for(Account a:lst)
            System.out.println(a);
    }

    public static void binarySearch(List<Account> lstcopy)
    {
        System.out.println("××××××××××××××××××××××××××××××BINARY SEARCH××××××××××××××××××××××××××××××");
        int found;
        found = Collections.binarySearch(lstcopy, new Account(300,null,null,0));
        for(Account a:lstcopy)
            System.out.println(a);
        System.out.println("\nID 300 found at: "+(found+1));
    }

    public static Map<Integer, String> getIfsc(List<Account> lst, String nifsc)
    {
        Map<Integer, String> ifscmap = new HashMap<>();
        for (Account a:lst)
        {
            if (a.ifsc == nifsc)
            {
                ifscmap.put(a.acid,a.acname);
            }
        }
        return ifscmap;
    }

    public static Map<Integer, String> getBal(List<Account> lst, double nbal)
    {
        Map<Integer, String> balmap = new HashMap<>();
        for (Account a:lst)
        {
            if (a.acbal > nbal)
            {
                balmap.put(a.acid,a.acname);
            }
        }
        return balmap;
    }

    public static Map<Integer, String> getlist(List<Account> lst)
    {
        Map<Integer, String> nmap = new HashMap<>();
        for (Account a:lst)
        {
            nmap.put(a.acid,a.ifsc);
        }
        return nmap;
    }

    public static void main(String[] args)
    {
        List<Account> lst = new ArrayList<>();
        lst.add(new Account(30,"Manasi","SBI0123",6000.0));
        lst.add(new Account(100,"Osheen","CBI0123",8000.0));
        lst.add(new Account(300,"Kunal-K","SBI0123",10000.0));
        lst.add(new Account(01,"Kunal-U","CNR123",9000.0));
        lst.add(new Account(50,"Yogesh","CNR123",7000.0));

        List<Account> lstcopy = new ArrayList<>(lst);

        displayAccounts(lst);

        //Sort list by different criteria.
        sortById(lst);
        sortByName(lst);
        sortByIfsc(lst);

        //Search an account by using Binary Search.
        binarySearch(lstcopy);

        //Filter account for a branch using IFSC.
        String nifsc = "SBI0123";
        Map<Integer, String> ifscmap = getIfsc(lst,nifsc);
        System.out.println("××××××××××××××××××××××××××××××Filter by IFSC××××××××××××××××××××××××××××××");
        System.out.println(ifscmap);

        //Filter account with Balance > certain amount
        double nbal = 7777.77;
        Map<Integer, String> balmap = getBal(lst,nbal);
        System.out.println("××××××××××××××××××××××××××××××Filter by Balance××××××××××××××××××××××××××××××");
        System.out.println(balmap);

        //Create a mapping between Account ID and IFSC
        Map<Integer, String> nmap = getlist(lst);
        System.out.println("××××××××××××××××××××××××××××××Map Between ID and IFSC××××××××××××××××××××××××××××××");
        System.out.println(nmap);
    }
}
