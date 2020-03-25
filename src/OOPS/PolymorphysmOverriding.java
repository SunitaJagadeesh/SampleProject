package OOPS;

public class PolymorphysmOverriding extends PolymorphysmOverloading{
	
	void add(int x, int y)  {
		System.out.println("Add if int, int in PolymorphysmOverriding is: "+ (x+y));
	}
	void mul(int x, int y)  {
		System.out.println("Mul if int, int in PolymorphysmOverriding is: "+ (x*y));
	}
	void div(int x, int y)  {
		System.out.println("Div if int, int in PolymorphysmOverriding is: "+ (x/y));
	}
	
	public static void main(String[] args) {
		PolymorphysmOverriding obj1 = new PolymorphysmOverriding ();
		obj1.add(23.3, 23.4);    // class PolymorphysmOverloading
		obj1.add(12, 74.3);      // class PolymorphysmOverloading
		obj1.add(12, 85);        // class PolymorphysmOverriding......overriding
		obj1.mul(54, 21);        // class PolymorphysmOverriding
		obj1.div(21, 3);         // class PolymorphysmOverriding

	}
}
