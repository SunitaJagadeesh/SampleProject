package OOPS;

import OOPS2.C1;    // we need to import class if that class is in different package 

public class C3 extends C1{

		public static void main(String[] args) {
			C1 obj1 = new C1 ();
			obj1.add_public();      // can assess public in different package
			//obj1.sub_default();   // cannot assess default in different package
			//obj1.mul_private();   // cannot assess private in different class and package
			//obj1.div_protected(); // cannot assess protected in different package
			
			C3 obj2 = new C3();
			obj2.add_public();
			obj2.div_protected();
			//obj2.sub_default();
			//obj2.mul_private();
			
	}

}
