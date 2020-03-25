package Strings;

public class StringMethods {

	public static void main(String[] args) {
		String s1 = "Sunita Jagadeesh";     //Declaration of the string can be done in this 2 ways
		
		String s2 = new String("Sunita");  //Declaration of the string can be done in this 2 ways
		String s3 = "sunita jagadeesh";
		
		int len1 = s1.length();
		int len2 = s2.length();
		
		System.out.println(len1);
		System.out.println(len2);	
		
		String[] method1 = s1.split(" ");
		for(int i=0; i<method1.length; i++) {
			System.out.println(method1[i]);
		}
		String method2 = s1.replace("Jagadeesh", "Vangapandu");
		System.out.println(method2);
		
		String method3 = s1.substring(0, 6);
		System.out.println(method3);
		
		String method4 = s1.toLowerCase();
		System.out.println(method4);
		
		if(s1.contentEquals(s3))
			System.out.println("Same");
		else
		    System.out.println("Not Same");
		
		if(s1.equalsIgnoreCase(s3))
			System.out.println("Same");
		else
		    System.out.println("Not Same");
	}
}
