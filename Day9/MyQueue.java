package Day9;

public class MyQueue
{
    int value;
    boolean hasValue = false;

    public synchronized void setValue(int value)
    {
        if (hasValue)
        {
            try
            { wait(); }
            catch (InterruptedException e)
            { e.printStackTrace(); }
        }
        this.value = value;
        System.out.println("Set Value: "+value);
        hasValue = true;
        notify();
    }

    public synchronized void getValue()
    {
        if (!hasValue)
        {
            try
            { wait(); }
            catch (InterruptedException e)
            { e.printStackTrace(); }
        }
        System.out.println("Get Value: "+value);
        hasValue = false;
        notify();
    }
}
