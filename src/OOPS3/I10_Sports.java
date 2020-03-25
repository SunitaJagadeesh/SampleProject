package OOPS3;

public class I10_Sports extends I10_Era {
	
    public void airbags() {         //I10_Sports implements abstract method airbags from ABSTRACT CLASS I10_Era
	   System.out.println("airbags-from abstract class");	
	}
    public void body() {
    	System.out.println("body- from normal class- method with body");	
    }
    public void seatcovers() {
    	System.out.println("seatcovers-from normal class- method with body");	
    }
    public void powerWindow() {
    	System.out.println("powerWindow-from normal class- method with body");	
    }
}
