package WebdriverBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class facebookDropdownDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);     
		driver.get("https://www.facebook.com/");
		
		Select day = new Select(driver.findElement(By.id("day")));
		day.selectByVisibleText("21");
		
		Select month = new Select(driver.findElement(By.id("month")));
		month.selectByVisibleText("Aug");
		
		Select year = new Select(driver.findElement(By.id("month")));
		year.selectByVisibleText("1994");
		
		
		//Select day = new Select(driver.findElement(By.id("day")));
		//day.selectBy("21");
		

	}

}
