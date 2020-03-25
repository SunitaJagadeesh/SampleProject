package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class BeforeAfterClass {

	@BeforeClass ()
	public static void  BeforeClass () {
		System.out.println("BeforeClass method executed");
	}
	@AfterClass ()
	public static void  AfterClass  () {
		System.out.println("AfterClass  method executed");
	}
	@BeforeMethod ()
	public static void  BeforeMethod () {
		System.out.println("BeforeMethod method executed");
	}
	@AfterMethod ()
	public static void  AfterMethod () {
		System.out.println("AfterMethod method executed");
	}
	@Test ()
	public static void  TC01 () {
		System.out.println("TC01 method executed");
	}
	@Test ()
	public static void  TC02 () {
		System.out.println("TC02 method executed");
	}
	@Test ()
	public static void  TC03 () {
		System.out.println("TC03 method executed");
	}
}
