package OOPS;

public class Calculator {
	
	public int x;    //instance Variable
	public int y;    //instance variable
	 
	//Instance  /Non-static method
	public void add()  {
		System.out.println(x+y);
	}
	
	//Instance  /Non-static method

	public void sub()  {
		System.out.println(x-y);
	}
	// Class /static method
	public static void main(String[] args) {
		Calculator obj1 = new Calculator();  //create instance (obj1) for class - Calculator 
		obj1.add();   // call instance method
		obj1.x=10;    // assign data to instance variable
		obj1.y=30;
		obj1.add();
		
	    Calculator obj2 = new Calculator();   // create new second instance (obj2) for class - Calculator
		
		obj2.add();
		
		obj1.add();	
	}
}
