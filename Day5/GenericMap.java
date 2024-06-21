package Day5;

public class GenericMap <k,v>
{
    k obj1;
    v obj2;

    public GenericMap (k obj1, v obj2)
    {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }

    public String  getName1()
    {
        return obj1.getClass().getName();
    }
    public String  getName2()
    {
        return obj2.getClass().getName();
    }

    public static void main(String[] args) {
        GenericMap<Integer,Integer> iobj1 = new GenericMap<Integer,Integer>(100,200);
        GenericMap<Integer,Integer> iobj2 = new GenericMap<Integer,Integer>(100,200);
        System.out.println(iobj1.getName1());
        System.out.println(iobj2.getName2());
        System.out.println();

        GenericMap<Integer,String> iobj3 = new GenericMap<Integer,String>(100,"aaa");
        GenericMap<Integer,String> sobj1 = new GenericMap<Integer,String>(100,"aaa");
        System.out.println(iobj3.getName1());
        System.out.println(sobj1.getName2());
        System.out.println();

        GenericMap<String,Integer> sobj2 = new GenericMap<String,Integer>("bbb",200);
        GenericMap<String,Integer> iobj4 = new GenericMap<String,Integer>("bbb",200);
        System.out.println(sobj2.getName1());
        System.out.println(iobj4.getName2());
        System.out.println();

        GenericMap<String,String> sobj3 = new GenericMap<String,String>("ccc","ddd");
        GenericMap<String,String> sobj4 = new GenericMap<String,String>("ccc","ddd");
        System.out.println(sobj3.getName1());
        System.out.println(sobj4.getName2());
    }
}

