package Practice_Assignment;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram 
{
    static void checkAnagram(String str1, String str2)
    {
        String s1 = str1.replaceAll("\\s", "");  
        String s2 = str2.replaceAll("\\s", "");  
        boolean status = true; 

        if (s1.length() != s2.length()) 
        {  
            status = false;  
        } 
        
        else 
        {  
            char[] Arr1 = s1.toLowerCase().toCharArray();  
            char[] Arr2 = s2.toLowerCase().toCharArray();  
            Arrays.sort(Arr1);  
            Arrays.sort(Arr2);  

            status = Arrays.equals(Arr1, Arr2);
        
        
    }
}
