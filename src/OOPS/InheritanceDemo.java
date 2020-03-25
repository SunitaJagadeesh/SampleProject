package OOPS;

public class InheritanceDemo {
	
	public int val1;
	public int val2;
	
	public int add() {
		return (val1 + val2);

	}

	public static void main(String[] args) {
		InheritanceDemo obj1 = new InheritanceDemo();
		obj1.val1 = 20;
		obj1.val2 = 37;
		System.out.println(obj1.add());

	}

}
