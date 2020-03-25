package OOPS2;

public class C1 {
	
	public void add_public () {
		System.out.println("Add from C1 class");
	}
    void sub_default () {
		System.out.println("Sub from C1 class");
	}
	private void mul_private () {
		System.out.println("Mul from C1 class");
	}
	protected void div_protected () {
		System.out.println("Div from C1 class");
	}

	public static void main(String[] args) {
		C1 obj1 = new C1 ();
		obj1.add_public();
		obj1.sub_default();
		obj1.mul_private();
		obj1.div_protected();
		//obj1... can call all four methods (i.e add, sub, mul, div) using different access modifiers (i.e public, default, private, protected)
	}

}
