package JavaBasics;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		
		Scanner S = new Scanner(System.in);
		System.out.println("Enter no");
		int No = S.nextInt();
		/*
		System.out.println(No);
		
		int R= No % 2;
		if (R == 0)
			System.out.println(" Even ");
		else 
			System.out.println(" Odd");
		*/
		
		if (No % 2 == 0)
			System.out.println(No + " is  Even ");
		else
			System.out.println(No + " is  Odd ");
		
        S.close();

	}

}
