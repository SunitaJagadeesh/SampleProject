package TestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGfirstProgram {
	
	@BeforeMethod //............................................ This method is executed before every method mentioned in @Test
	public static void  before () {
		System.out.println("before method executed");
	}
	@AfterMethod //............................................. This method is executed after every method mentioned in @Test
	public static void  after () {
		System.out.println("after method executed");
	}
	@Test (priority = 3)
	public static void  add () {
		System.out.println("add method executed");
	}
	
	@Test (priority = 2)
	public static void  sub () {
		System.out.println("sub method executed");
	}
	
	@Test (priority = 1)
	public static void  mul () {
		System.out.println("mul method executed");
	}
	@Test (enabled=false)//........................................This method is not-executed 
	public static void  TC01 () {
		System.out.println("TC01 method executed");
	}
	@Test (priority = 4, enabled = false)
	public static void  TC02 () {
		System.out.println("TC02 method executed");
	}
	

}
