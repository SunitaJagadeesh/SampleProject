package Arrays_collection;

import java.util.Scanner;

public class ArrayDemo2 {

	public static void main(String[] args) {
		
		/* 
		Example 1
		int [][] arr = new int[2][3];
		
		arr[0][0] = 10;
		arr[0][1] = 20;
		arr[0][2] = 30;
		arr[1][0] = 40;
		arr[1][1] = 50;
		arr[1][2] = 60;
	*/
		
		int[][] arr1 = new int[2][3];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter data");

		for(int i=0; i<2; i++)
		{
			for(int j=0; j<3; j++)
			{
				arr1[i][j] = sc.nextInt();
			}
		}
		System.out.println("Displaying Data");
		for(int i=0; i<2; i++)
		{
			for(int j=0; j<3; j++)
			{
				System.out.print(arr1[i][j]);
			}
			System.out.println();
		}
	}
}
