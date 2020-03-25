package PracticePrograms;

import java.util.Scanner;

public class HighestLowestInArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of elements");
		int n = sc.nextInt();
	    int[] no = new int[n];
		System.out.println("Enter the nos in an array ");
		for(int i=0; i<no.length; i++)
		{
			no[i] = sc.nextInt();
		}
		for(int i=0; i<no.length; i++)
		for(int j=i+1; j<no.length; j++)
		 {
			if(no[i] > no[j])
			{
			  int temp =  no[i];
			  no[i] = no[j];
			  no[j] = temp;	
			}
		 }
		System.out.println("lowest of the array is: " +no[0]);
		System.out.println("Highest of the array is: " +no[no.length-1]);
		
	}

}