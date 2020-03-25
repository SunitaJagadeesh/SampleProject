package WebdriverBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailLogin {


	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver", "/Users/sunita/Documents/eclipse/BasicWebdriverProgram/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);     
		driver.get("https://accounts.google.com/");
		
		driver.findElement(By.id("identifierId")).sendKeys("sunitavangapandu@gmail.com");
		
		
		driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);        
		driver.findElement(By.name("password")).sendKeys("RonitAthreya24");
		
		
		driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();

	}

}
