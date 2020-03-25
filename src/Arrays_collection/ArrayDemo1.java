package Arrays_collection;

import java.util.Scanner;

public class ArrayDemo1 {

	public static void main(String[] args) {
		
		/*
		Example- 1
		int[] arr = new int[3];
		arr[0] = 21;
		arr[1] = 14;
		arr[2] = 76;
	    System.out.println(arr[2]);
*/
		/*
	    Example - 2
	    int[] arr = {12,23,34};
	    System.out.println(arr[2]);
*/
	    
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of array");
		int n = sc.nextInt();
		
		String[] student =new String[n];
		
		System.out.println("Enter names:");
		for(int i=0; i<student.length; i++)        //for(i=0; i<n; i++)  or   for(i=0; i<3; i++)  ..... HARDCODING
		{
			student[i] = sc.next();	
		}
		System.out.println("Displaying names");
		for(int i=0; i<student.length; i++) 
		{
			System.out.println( student[i]);
		}
	    
	}

}
