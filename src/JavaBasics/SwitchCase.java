package JavaBasics;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);   
		System.out.println("Enter number b/w 1-7");
		int day = sc.nextInt();
		
		switch (day)
		{
		/*
		case 1:
			System.out.println("Today is Sunday");
		case 2:
			System.out.println("Today is Monday");
		case 3:
			System.out.println("Today is Tuesday");
		case 4:
			System.out.println("Today is Wednesday");
		case 5:
			System.out.println("Today is Thursday");
		case 6:
			System.out.println("Today is Friday");
		case 7:
			System.out.println("Today is Saturday");
			
		default :
			System.out.println("Invalid input.");
		*/	
		case 1:
			System.out.println("Today is Sunday");
			break;
		case 2:
			System.out.println("Today is Monday");
			break;
		case 3:
			System.out.println("Today is Tuesday");
			break;
		case 4:
			System.out.println("Today is Wednesday");
			break;
		case 5:
			System.out.println("Today is Thursday");
			break;
		case 6:
			System.out.println("Today is Friday");
			break;
		case 7:
			System.out.println("Today is Saturday");
			break;
			
		default :
			System.out.println("Invalid input.");
			
			}
	}
}
