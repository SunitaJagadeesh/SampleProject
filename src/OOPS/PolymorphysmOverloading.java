package OOPS;

public class PolymorphysmOverloading {
	
	void add(int x, int y)  {
		System.out.println("Add if int, int in PolymorphysmOverloading is: "+ (x+y));
	}
	void add(double x, double y)  {
		System.out.println("Add if double, double is: "+ (x+y));
	}
	void add(int x, double y)  {
		System.out.println("Add if int, double is: "+ (x+y));
	}

	public static void main(String[] args) {
		PolymorphysmOverloading obj1 = new PolymorphysmOverloading();
		obj1.add(18, 35);
		obj1.add(18.2, 35);
		obj1.add(18, 35.2);
		obj1.add(18.2, 35.2);
	}
}
