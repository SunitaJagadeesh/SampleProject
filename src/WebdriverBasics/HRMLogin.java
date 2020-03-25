package WebdriverBasics;

import java.util.concurrent.TimeUnit;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HRMLogin {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/sunita/Documents/eclipse/BasicWebdriverProgram/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); 
		driver.get("http://testingmasters.com/hrm");
		
		//driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("user02");
		//driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("TM1234");
		//driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		
		//Absolute xpath
		//driver.findElement(By.xpath("/html/body/div/div/div[3]/div[2]/a[2]/img")).click();

		//Relative xpath
		//driver.findElement(By.xpath("//))
		
		driver.quit();
		
	}
}
