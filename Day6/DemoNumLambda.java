package Day6;

public class DemoNumLambda
{
    public static boolean verifyNum(NumberFunc func,int n)
    {

        return func.checkNum(n);
    }


    public static boolean numPrime(int n)
    {
        for (int i=2; i<n;i++)
        {
            if (n%i == 0)
                return false;
        }
        return true;
    }


    public static void main(String[] args)
    {
        NumberFunc ispositive =  (n) ->   n>=0;

        if (ispositive.checkNum(10))
            System.out.println("Number is Positive");
            System.out.println();

        NumberFunc checkPrime = num ->
        {
            for (int i=2; i<num;i++)
            {
                if (num%i == 0)
                    return false;
            }
            return true;
        };
        System.out.println(checkPrime.checkNum(7));
        System.out.println();

        System.out.println(numPrime(67));
        System.out.println();

        System.out.println(verifyNum(MathFunc::isPrime,11));
        // Verify num takes functional interface and argument (lambda method) and returns boolean
    }
}
