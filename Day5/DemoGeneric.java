package Day5;

public class DemoGeneric <T>       //T is like a tuple object which accepts type. it is a temporary tuple which is replaced later when a value is passed later.
{
    T obj;

    public DemoGeneric (T obj)
    {
        this.obj = obj;
    }

    public String getName()
    {
        return obj.getClass().getName();
    }

    public static void main (String [] args)
    {
        DemoGeneric <Integer> iobj = new DemoGeneric<Integer>(100);
        System.out.println(iobj.getName());

        DemoGeneric <String> sobj = new DemoGeneric<String>("bbb");
        System.out.println(sobj.getName());
    }
}
