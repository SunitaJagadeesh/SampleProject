package OOPS;

public class Calc1 {
	
	void add(int x, int y)  {
		System.out.println("Add int, int in Calc1: "+ (x+y));
	}
	void sub(int x, int y)  {
		System.out.println("sub int, int in Calc1: "+ (x-y));
	}


	public static void main(String[] args) {
		Calc1 obj = new Calc1();
		obj.add(28, 12);
	}
}
