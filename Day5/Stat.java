package Day5;

//Concept of Bounded Types
public class Stat <T extends Number>
{
    T [] arr;

    public Stat (T [] arr)
    {
        this.arr = arr;
    }
    public double getAverage()
    {
        double sum = 0.0;
        for (int i=0; i<arr.length;i++)
        {
            sum = arr[i].doubleValue();
        }
        return sum/ arr.length;
    }

    public boolean isAvgEqual(Stat<?> obj)
    {
        if (this.getAverage() == obj.getAverage())
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        Integer [] iarr = {1,2,3,4,5};
        Double [] darr = {1.0,2.0,3.0,4.0,5.0};

        Stat<Integer> s1 = new Stat<Integer>(iarr);
        Stat<Double> s2 = new Stat<Double>(darr);

        System.out.println(s1.getAverage());
        System.out.println(s2.getAverage());

        System.out.println(s1.isAvgEqual(s2));
    }
}
