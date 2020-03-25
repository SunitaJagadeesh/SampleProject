package JAVA_OOPS_PDF1;

public class Question9 {

	//Reversing an array
	
	public static void main(String[] args) {
		int[] a = new int[]{1,2,3,4,5,6,7,8,9,10};
		for(int i=0; i<10; i++)
		{
			for(int j=i+1; j<10; j++)
		{
			int temp = a[i];
			a[i] = a[j];
			a[j] = temp;
		}
		    System.out.print(" " +a[i]);
		}
		
		int[] b = new int[a.length+1];
		

	}

}
