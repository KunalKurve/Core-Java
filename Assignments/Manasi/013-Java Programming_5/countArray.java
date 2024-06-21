package Assignment6.Submit;

// Write a program to print array by 2 different threads
// printArray(int [] arr)

public class countArray
{
    int count = 0;

    public int printArray(int [] arr){

        for (int i = 0; i< arr.length; i++) {
            System.out.print(" " +arr[i]);
        }
        count++;
        return count;
    }

}
