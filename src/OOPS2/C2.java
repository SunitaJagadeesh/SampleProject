package OOPS2;

public class C2 {
	public static void main(String[] args) {
		C1 obj1 = new C1 ();
		obj1.add_public();
		obj1.sub_default();
		// obj1.mul_private();   cannot assess private in different class
		obj1.div_protected();
	
	}

}
