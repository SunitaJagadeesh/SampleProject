package PracticePrograms;

import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {
		
		int height;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the height: ");
		height = sc.nextInt();
		for(int i=0; i<height; i++)
		{
			for(int j=i; j>=0; j--)
				System.out.print("*");
			System.out.println();
		}
		for(int i=height-1; i>0; i--)
		{
			for(int j=i; j>0; j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
