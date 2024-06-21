package Assignment3;

import java.util.Comparator;

public class IfscComparator implements Comparator<Account>
{
    public int compare(Account o1, Account o2)
    {
        return o1.ifsc.compareTo(o2.ifsc);
    }
}
