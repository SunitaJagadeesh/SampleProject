package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class ParametersDemo {
	
	@Test
	@Parameters({"URL","UID","PWD"})
	public void TC_Login(String P1, String P2, String P3) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); 
	driver.get("P1");
	
	driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("P2");
	driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("P3");
	driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
	
	System.out.println(" Login test case executed");
	
	}
	@Test
	public void TC_ApplyLeave() {
		System.out.println(" Apply Leave test case executed");
	}
	@Test
	public void TC_CancelLeave() {
		System.out.println(" Cancel Leave test case executed");
	}
	
}
 