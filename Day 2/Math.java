package day2;

public class Math {
	
	public static int add(int n1, int n2)
	{
		return n1+n2;
	}
	
	public static int add(int n1, int n2, int n3)
	{
		return n1+n2+n3;
	}

	public static float add(int n1, float n2)
	{
		return n1+n2;
	}

	public static float add(float n1, int n2)
	{
		return n1+n2;
		
	}
	
	public static float add(float n1, float n2)
	{
		return n1+n2;
		
	}
	
	public static int addition(int...num)
	{
		int sum =0;
		for(int i=0; i<num.length;i++)
		{
			sum+=num[i];
		}
		return sum;
	}
	
	
	// Swapping by value and By reference Ways: 
//	public static void swap(int a, int b)
//	{
//		int temp = a;
//		a = b;
//		b = temp;
//		System.out.println(a+b);
//	}
	
	public static void swap(int a, int b)
	{
		int temp = a;
		a = b;
		b = temp;
		System.out.println("Value of a amd b is "+ a +" and  " + b);
	}
	
	public static int[] swap(int[] a)
	{
		
		int	temp = a[0];
		a[0]=a[1];
		a[1]=temp;

		int [] c = {a[0],a[1]};
		
		return c;
	}
	
	public static int[] swap(int[] a, int[] b)
	{
		
		for(int i = 0 ; i<a.length; i++ ) {
		int	temp = a[i];
		a[i]=b[i];
		b[i]=temp;
		}
		
		int [] c = new int [2*a.length];
		for(int i = 0 ; i<2*a.length; i++ ) {
			c[i] = a[i];
			c[i+1] = b[i];
			}
		
		return c;
	}

}
