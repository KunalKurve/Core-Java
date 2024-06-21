package day2;

public class ArrayInteger {
	
	public static void main(String[] args) {
	
	int num1 = 50;
	int num2 = 70;
	System.out.println("Before invoking the swap method, num1 is " + num1 + " and num2 is " + num2);

	//invoke the swap method to attempt to swap two variables
	Math.swap(num1, num2);
	System.out.println("After invoking the swap method, num1 is " + num1 + " and num2 is " + num2);
		
		
	int [] a = {5, 7};
	int [] c =Math.swap(a);	
		
//	int [] a = {5,2,7};
//	int [] b = {7,8,3};
//	int [] c =Math.swap(a,b);
	System.out.println(c[0]);
	System.out.println(c[1]);
	
	
	//Wrapper Classes
	int x = 20;
	Integer i = Integer.valueOf(x);
	
	int y = i.intValue();
	
	String ss = "30";
	int j = Integer.parseInt(ss);
	String s = "30";
	i = Integer.valueOf(s);
	}
	


	
	
}
