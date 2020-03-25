package PracticePrograms;

import java.util.Scanner;

public class SortingArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the nos");
		int n = sc.nextInt();
		System.out.println("Enter the array elements");
		int[] sort = new int[n];
		
		for(int i=0; i<sort.length; i++)
		{
			sort[i]= sc.nextInt();	
		}
		
		
		for(int i=0; i<sort.length; i++)
		{
			for(int j=i+1; j<sort.length; j++)
			{
				if(sort[i]>sort[j])
				{
					int temp = sort[j];
					sort[j] = sort[i];
					sort[i] = temp;
				}
			}
		}
		System.out.print("Accending order is: ");

		for(int i=0; i<sort.length; i++)
		{
			System.out.print(" " +sort[i]);
		}
	}
}
