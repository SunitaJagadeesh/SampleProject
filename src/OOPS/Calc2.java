package OOPS;

public class Calc2 extends Calc1{
	
	void add(int x, int y)  {
		System.out.println("Add int, int in Calc2: "+ (x+y));
	}
	void m1() {
		super.add(14, 24);    // method add from child class overrides from parent class. since add is an instance method( i.e non-static) we need not create new object to use parent class method when method overriding is happening 
		add(14,24);           // overriding. When parent and child class both has same method then child class method overrides parent class method.
		sub(52,63);	
	}
	

	public static void main(String[] args) {
		Calc2 obj = new Calc2();
		obj.m1();
	}

}
