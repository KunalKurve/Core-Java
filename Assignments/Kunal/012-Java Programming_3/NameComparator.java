package Assignment3;

import java.util.Comparator;

public class NameComparator implements Comparator<Account>
{
    @Override
    public int compare(Account o1, Account o2)
    {
        return o1.acname.compareTo(o2.acname);
    }
}
