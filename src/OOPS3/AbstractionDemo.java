package OOPS3;

public class AbstractionDemo extends I10_Sports {

	public static void main(String[] args) {
		I10_Sports obj = new AbstractionDemo();
		obj.airbags();          //All the methods available in I10_Sports are available
		obj.powerWindow();
		obj.seatcovers();
		obj.body();
		
		I10_Sports obj1 = new I10_Sports();
		obj1.airbags();
		obj.powerWindow();   //All the methods available in I10_Sports are available
			
	    I10_Era obj2 = new I10_Sports();
	    // obj2.powerWindow();    Method powerWindow is not present in the Abstract class I10_Era
	    obj2.airbags();
	    	     
	    I10 obj3 = new I10_Sports();
	    obj3.audio();
	    //obj3.airbags();
	    //obj3.powerWindows();
	    
	    
	    //I10 obj4 = new I10();           cannot create object for an Interface ( i.e cannot instantiate Interface)
	    //I10 obj5 = new I10_Era();       cannot create object for an Abstract class ( i.e cannot instantiate abstract class)
	    
	}
}
