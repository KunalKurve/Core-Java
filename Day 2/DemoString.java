package day2;

public class DemoString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "java";
		String s2 = "java";
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
		String n1 = new String("py");
		String n2 = new String("py"); //because of new keyword , objects are in Heap, and different memory
		System.out.println(n1==n2);
		System.out.println(n1.equals(n2));
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		
		s2 = s2 + "8"; //became a different object
		System.out.println(s2.hashCode());
	}

}
