package WebdriverBasics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkDemo {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);     
		driver.get("https://www.facebook.com/");
		
		// Example to get links count and each link text
		/*
		int n = driver.findElements(By.tagName("a")).size();
		List<WebElement> links = driver.findElements(By.tagName("a"));      //List is a collection
		int n = links.size();
		
		
		
		
		//driver.findElement(By.linkText("Create a Page")).click();
		driver.findElement(By.partialLinkText("Create")).click();
		
		Thread.sleep(5000);
		
		driver.navigate().back();
*/
	}

}
