package Exceptions;

public class ExceptionDemo2 {
	
	static void div (int d) {
		try {
			if(d==0)
				throw new ArithmeticException("cannot divide by zero");				
			else
				System.out.println(50/d);
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
	}

	public static void main(String[] args) {
		int[] arr = {5,6,0,2,4};
		for(int i=0; i<arr.length; i++)
		{
			div(arr[i]);
		}
	}	
}
