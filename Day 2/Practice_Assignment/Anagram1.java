package Practice_Assignment;

import java.util.Scanner;
// An anagram of a string is another string that contains the 
// same characters, only the order of characters can be different. 
// For example, “abcd” and “dabc” are an anagram of each other.

// Using Sorting Method

public class Anagram1 
{
    public static char[] bSort(char [] a)
        {
            int arrlen = a.length;
            for (int i=0; i<arrlen; i++)
            {
                for (int j=0; j<arrlen-1; j++)
                {
                    if (a[j] > a[j+1])
                    {
                        char swap;
                        swap = a[j];
                        a[j] = a[j + 1];
                        a[j + 1] = swap;
                    }

                }
            }
            return a;

        }

    public static int checkAnagram(String str1, String str2)
    {
        int len1,len2,x = 0;
        
        len1 = str1.length();
        len2 = str2.length();

        char[] arr1 = new char[str1.length()];
        for (int j = 0; j< str1.length(); j++ )
        {
          arr1[j] = str1.charAt(j);
        }
        char[] arr2 = new char[str2.length()];
        for (int j = 0; j< str2.length(); j++ )
        {
          arr2[j] = str2.charAt(j);
        }

        //sorting the character arrays
        arr1 = bSort(arr1);
        arr2 = bSort(arr2);

        //comparing

        for (int i = 0; i < len1; i++)
        {
            if (arr1[i] != arr2[i])
            {
                x = 1;
                break;
            }
            else
            {
                x= 0;
            }
        }
        return x;
    }
        
    
    public static void main(String[] args) 
    {
        int x;    
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String 1");
        String str1 = sc.nextLine();
        System.out.println("Enter String 2");
        String str2 = sc.nextLine();
        sc.close();
        x = checkAnagram(str1,str2);
        if (x==1)
        {
            System.out.println("The strings are not Anagram.");
        }
        else
        {
            System.out.println("The strings are  Anagram.");
        }
    }
}


/*      
    Another method:

        // int count = 0;
        // if (len1 != len2)
        // {
        //     return 1;
        // }
        // else
        // {
        //     for (int i = 0; i < str1.length(); i++) 
        //     {
        //         for(int j =0; j<str2.length(); j++)
        //         {
                    
        //                 if(str1.charAt(i) == str2.charAt(j))
        //                 {
        //                     count++;
        //                 }
                    
        //         }
                
        //     }
        //     for(int i=0; i<n1; i++)
        //     {
        //         if (str1[i] != str2[i])
        //         {
        //             System.out.println(str1[]);;
        //         }
        //     }
        // }
        // return 0;
        
*/