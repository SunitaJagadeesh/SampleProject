package WebdriverBasics;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class PracticeNew {
	
	
	 
	static WebDriver driver;
	public static void main (String args[]) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","/Users/sunita/Documents/eclipse/BasicWebdriverProgram/chromedriver");
		
		driver = new ChromeDriver ();
		driver.get("http://testingmasters.com/hrm");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("user02");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("TM1234");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		
		Thread.sleep(2000);
		
		Actions act = new Actions(driver);
		WebElement leave = driver.findElement(By.xpath("//a[@id='menu_leave_viewLeaveModule']"));
		act.moveToElement(leave).build().perform();
		
		//int n = driver.findElements(By.tagName("a")).size();
		List<WebElement> links = driver.findElements(By.tagName("a"));
		int l = links.size();
		System.out.println(l);
		
		String parentWintHandle = driver.getWindowHandle();
		Set<String> winHandles = driver.getWindowHandles();
		System.out.println(parentWintHandle + "***************");
		System.out.println(winHandles + "@@@@@@@@@@@@@@");


		
		
		
		
	
	
	
	}

}
