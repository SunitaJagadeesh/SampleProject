package PracticePrograms;

import java.util.Scanner;

public class Pattern3 {

	public static void main(String[] args) {
		
		int height;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the height: ");
		height = sc.nextInt();
		
		for(int i=0; i<height; i++)
		{
			for(int j=i; j<=height-1; j++)
			{
				System.out.print(" ");
			}
			for(int j=i; j>=0; j--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=height; i>=0; i--)
		{
			for(int j=i; j<=height-1; j++)
			{
				System.out.print(" ");
			}
			for(int j=i; j>=0; j--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
