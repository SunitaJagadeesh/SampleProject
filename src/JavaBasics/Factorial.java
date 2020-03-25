package JavaBasics;

public class Factorial {

	public static void main(String[] args) {
		
		int a=9, i, Fact=1;
		
		for(i=1; i<=a; i++)
		{
			Fact=Fact*i;
			
		}
		System.out.println("Factorial of "+a+" is " + Fact);

	}

}
