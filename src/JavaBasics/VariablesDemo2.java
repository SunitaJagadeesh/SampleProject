package JavaBasics;

import java.util.Scanner;

public class VariablesDemo2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);   // scanner is a predefined class
		
		System.out.println("enter age");
		int age = sc.nextInt();
		System.out.println(age);
				
		System.out.println("enter name");
		String name = sc.next();
		System.out.println(name);
		// instead of using println we can use System.out.print("\n");
        // for space use "\t"
	}

}
