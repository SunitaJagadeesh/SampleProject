package Exceptions;

public class ExceptionDemo1 {
	static void div(int d)  {
		try {
			System.out.println(50/d);
		}
		catch(ArithmeticException e) {
			//System.out.println("Cannot divide by 0");
			System.out.println(e.getMessage());
		}
		catch(Exception e) {
			//System.out.println("Cannot divide by 0");
			//System.out.println(e.getMessage());
			e.printStackTrace();
		}
		finally {
		      System.out.println("div completed");
		}
	}

	public static void main(String[] args) {
		int[] arr = {4,5,0,8,3};
		for(int i=0; i<arr.length; i++)
		{
			div(arr[i]);
		}
	}

}
