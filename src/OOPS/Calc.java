package OOPS;

public class Calc {
	
	int x = 10;
	int y = 20;
	
	void add (int x, int y) {      // int x and int y are local variable to the method add 
	System.out.println(x+y);
	System.out.println(this.x+ this.y); //this keyword, is used to refer class instance variable when current method or block has same local variable 

	}
	void sub () {
		System.out.println(x-y);	     //here x=10 and y=20 
	}
	public static void main (String[] args) {
		Calc obj1 = new Calc();
		obj1.add(45,65);  
		obj1.sub();
	}
}
