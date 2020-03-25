package OOPS;

public class ReturnMethodData {
	
	double add (int x, int y) {
		return (x+y);
	}

	public static void main(String[] args) {
		
		ReturnMethodData obj = new ReturnMethodData();
		double result = obj.add(49,35);
		System.out.println("The output is: " +result);
	}

}
