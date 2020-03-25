package PracticePrograms;

import java.util.Scanner;

public class AdditionOfMatrix {

	public static void main(String[] args) {
		
		int[][] arr1 = new int[2][2];
		int[][] arr2 = new int[2][2];
		int[][] add = new int[2][2];
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter matrix1 : ");
		for(int i=0; i<2; i++)
			for(int j=0; j<2; j++)
			{
				arr1[i][j] = sc.nextInt();			
			}
		
		System.out.println("Enter matrix2 : ");
		for(int i=0; i<2; i++)
			for(int j=0; j<2; j++)
			{
				arr2[i][j] = sc.nextInt();			
			}
		
		for(int i=0; i<2; i++)
			for(int j=0; j<2; j++)
			{
				add[i][j] = arr1[i][j] + arr2[i][j];
			}
		for(int i=0; i<2; i++)
		{
			for(int j=0; j<2; j++)
			{
				System.out.print(" " +add[i][j]);
			}
			System.out.println();
		}	
	}
}
