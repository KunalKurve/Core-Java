package Practice_Assignment;

public class BubbleSort 
{

    public static void bSort(int [] a)
    {
        int arrlen = a.length;
        for (int i=0; i<arrlen; i++)
        {
            for (int j=0; j<arrlen-1; j++)
            {
                if (a[j] > a[j+1])
                {
                    int swap ;
                    swap = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = swap;
                }

            }
        }

        System.out.println("\nSorted Array: ");
        for (int i=0; i<arrlen; i++)
        {
            System.out.print(a[i]+" ");

        }

        
    }
    public static void main (String[] args)
        {
            int[] arr = {23, 63, 2, 95, 45};
            System.out.println("Array before sorting : \n");
            int arrlen = arr.length;
            for (int i=0; i<arrlen; i++)
        {
            System.out.print(arr[i]+" ");

        }
            
            BubbleSort.bSort(arr);
        }
}
