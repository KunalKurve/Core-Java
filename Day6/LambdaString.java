package Day6;

public class LambdaString
{
    //Type 2: Lambda as method
    public static String operateOnString(StringFunc func, String s)
    {
         return func.getString(s);
    }

    public static void main(String[] args)
    {
        String str1 = "This Is String 1.";
        System.out.println(str1);

        //Type 1: Lambda as Target Type
        StringFunc toUpper = (str) -> str.toUpperCase();
        System.out.println(toUpper.getString(str1));

        StringFunc rev = (str2) ->
        {
            String revstr = "";
            int n =str1.length();
            for (int i=0; i<n; i++)
            {
                revstr = revstr + str1.charAt(n-i-1);
            }
            return revstr;
        };
        System.out.println(rev.getString(str1));

        operateOnString((str) -> str.toLowerCase(),str1); //lambda expression to implement functional interface

    }
}
