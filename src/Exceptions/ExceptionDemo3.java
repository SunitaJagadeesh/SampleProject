package Exceptions;

public class ExceptionDemo3 {
	static void div(int d) throws InterruptedException {       //checked exception
		try {
		System.out.println(50/d);
		Thread.sleep(500);
		}
		catch (ArithmeticException e) {                        //unchecked exception
			System.out.println("cannot divide by zero");
		}
		//finally {
			//System.out.println("division done");
		//}
 
	}

	public static void main(String[] args) throws InterruptedException {
		int[] arr = {4,9,7,0,8};
		for(int i=0; i<arr.length; i++)
			div(arr[i]);
		}
	}