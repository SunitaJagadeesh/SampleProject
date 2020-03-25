package OOPS;

public class ChildIInheritance extends InheritanceDemo {
	
	public int sub() {
		return (val1 - val2);
	}
	

	public static void main(String[] args) {
		ChildIInheritance obj2 = new ChildIInheritance();
		obj2.val1 = 50;
		obj2.val2 = 100;
		int a = obj2.add();
		System.out.println("add: "+ a);
		int s = obj2.sub();
		System.out.println("sub:" + s);
		

	}

}
