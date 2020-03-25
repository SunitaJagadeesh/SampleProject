package Sand_Project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Libraries extends Parameters {
	
public static WebDriver driver = new ChromeDriver();
	
	//To launch browser
	public static void launchBrowser() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://sand.ap.gov.in/index.htm");
	}
	//Login details
	public static void booking() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h4[@class='card-title mb-0']")).click();	
		driver.findElement(By.xpath("//input[@id='MobileNo']")).sendKeys("7893450914");	
		//driver.findElement(By.xpath("//a[@id='Sendotp']")).click();	
	}
	//Login details
	public static void fillDetails() throws InterruptedException {
		Thread.sleep(10000);
		driver.findElement(By.xpath("//a[@class='nav-link']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//select[@id='TypeOfWork']")).click();
		//Thread.sleep(2000);
		
		switch (TypeOfWork)
		{
		case "1" : 
			driver.findElement(By.xpath("//select[@id='TypeOfWork']/option[2]")).click();	
			break;
			
		case "2" :
			driver.findElement(By.xpath("//select[@id='TypeOfWork']/option[3]")).click();
			break;
		}
		
		
		
	}
}
