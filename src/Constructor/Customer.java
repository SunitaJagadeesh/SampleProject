package Constructor;

public class Customer {
	
	String name;
	int age;
	static String bankname;
	

	//Constructor... default constructor to execute line - Customer c1 = new Customer();
	Customer() {
		//System.out.println("Default constructor is executed");
	}

	
	//Constructor...to assign data to instance variables
	Customer(String name, int age) {
		this.name = name;
		this.age = age;
	}
	//Static block... to assign data to static/class variables
	static {
		bankname = "HDFC bank";
	}
	void bank() {
		System.out.println("name : " +name);
		System.out.println("age : " +age);
		System.out.println("bankname : " +bankname);
	}
	

	public static void main(String[] args) {
		Customer c1 = new Customer();
		c1.bank();
		
		Customer c2 = new Customer("Sunita" , 25);
		c2.bank();

	}
}
