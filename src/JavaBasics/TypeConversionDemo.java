package JavaBasics;

public class TypeConversionDemo {

	public static void main(String[] args) {
		
		//implicit conversion or type conversion
		int a = 20;
		double d = a;
		System.out.println(d);
		
		//Explicit conversion or type casting
		double d1 = 20.4;
		int a1 = (int) d1;
		System.out.println(a1);
		
		//implicit conversion or type conversion
		char ch = 'C';
		int b = ch;
		System.out.println(b);                    //ASCI value is printed
		
		//Explicit conversion or type casting
		int c = 97;
		char ch1 = (char) c;
		System.out.println(ch1);
	}
}
