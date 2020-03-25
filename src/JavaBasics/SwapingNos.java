package JavaBasics;

//import java.util.Scanner;

public class SwapingNos {

	public static void main(String[] args) {
		
		
		// with using 3rd variable
		
		
		int a = 10;
		int b = 20;
		int c ;
		
		System.out.println("Before Swapping a is: " +a+ ", b is: " +b );

		c = a;
		a = b;
		b = c;
		
		System.out.println("After Swapping a is: " +a+ ", b is: " +b );
		
;
        
		/*


		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a");
		int a = sc.nextInt();
		System.out.println("Enter b");
		int b = sc.nextInt();
		
		int c = 30;
		c = a;
		a = b;
		b = c;
		
		System.out.println("After swapping a is: " +a+ "b is:" +b );
		*/


		
		// Without using 3rd variable
		
/*
		int a = 10;
		int b = 20;
		
		System.out.println("Before Swapping a is: " +a+ ", b is: " +b );
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("After swapping a is: " +a+ ", b is: " +b );

*/
		


		
	}

}
