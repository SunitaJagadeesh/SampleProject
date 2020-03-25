package OOPS;

public class Coustmer {
	
	String coust_name;                   //Non-Static variable
	int age;                             //Non-Static variable
	static String bankname = "HDFC" ;   // Static variable
	
	void setDetails (String cname, int cage)  {
		coust_name = cname;
		age = cage;
	}
	void getDetails() {                     //Non-Static method 
		System.out.println(coust_name);     //Static and Non-Static variable both can be given in Non-Static method
		System.out.println(age);
		System.out.println(bankname);		
	}
	static void m1() {                       //Static method
		Coustmer coust3= new Coustmer();         //Non-Static variable cannot be given in static method, Static variable can be given to static method
		System.out.println(coust3.coust_name);   //To give Non-Static variable in static method we need to create a new object i.e coust3 in this case
		System.out.println(coust3.age);          
		System.out.println(bankname);	       
		
	}
	public static void main (String[] args) {
		Coustmer coust1 = new Coustmer();
		coust1.setDetails("kumar", 39);
		coust1.getDetails();                 //We cannot call Non-static method from static method. it can be done using instance method
		m1();                               //We can call static method from static method.
		
		Coustmer coust2 = new Coustmer();
		coust2.setDetails("Naveen", 67);
		coust2.getDetails();
	}
}
