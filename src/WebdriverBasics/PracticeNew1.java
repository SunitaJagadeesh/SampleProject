package WebdriverBasics;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeNew1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://chandanachaitanya.github.io/selenium-practice-site/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		String currentWindow = driver.getWindowHandle();
		System.out.println(currentWindow);
		
		driver.findElement(By.xpath("//button[@id='win1']")).click();
		
		Set<String> allWindowHandles = driver.getWindowHandles();
		System.out.println(allWindowHandles);
		
		driver.switchTo().window(currentWindow);
		String title = driver.getTitle();
		System.out.println(title);
		
		
	
		
		

	}

}
