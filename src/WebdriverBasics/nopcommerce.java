package WebdriverBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class nopcommerce {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/sunita/Documents/eclipse/BasicWebdriverProgram/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://demo.nopcommerce.com/register");
		
		
		// Using id and name
		/*
		driver.findElement(By.id("gender-female")).click();
		driver.findElement(By.id("FirstName")).sendKeys("Sujata");
		//driver.findElement(By.id("LastName")).sendKeys("Krishna");
		
		WebElement lastname = driver.findElement(By.id("LastName"));
		lastname.sendKeys("Krishna");
		
		WebElement day = driver.findElement(By.name("DateOfBirthDay"));
		Select sel_day = new Select(day);
		sel_day.selectByVisibleText("21");
		
		WebElement month = driver.findElement(By.name("DateOfBirthMonth"));
		Select sel_month = new Select(month);
		sel_month.selectByVisibleText("August");
		
		WebElement year = driver.findElement(By.name("DateOfBirthYear"));
		Select sel_year = new Select(year);
		sel_year.selectByVisibleText("1995");
		
		String Email = "sunijai2108@gmail.com";
		driver.findElement(By.id("Email")).sendKeys(Email);
		
		String Password = "SuniJai";
		driver.findElement(By.id("Password")).sendKeys(Password);
		driver.findElement(By.id("ConfirmPassword")).sendKeys(Password);
		driver.findElement(By.id("register-button")).click();
		
		driver.findElement(By.id("")).click();
		*/
		
		// Using xpath
		
		driver.findElement(By.xpath("//input[@id='gender-female']")).click();
		
		WebElement gender = driver.findElement(By.xpath("//input[@id='gender-female']"));
		gender.click();
		boolean b = gender.isSelected();
		if(b)
			System.out.println("Gender is selected");
		else
			System.out.println("Gender is not selected");
		
		
		driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Sujata");
		driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("Krishna");
		
		driver.findElement(By.xpath("//select[@name='DateOfBirthDay']/option[8]")).click();
		//driver.findElement(By.xpath("//select[@class='valid']/option[text()='8']")).click();
		
		
		driver.findElement(By.xpath("//select[@name='DateOfBirthMonth']/option[8]")).click();;
		
		
		driver.findElement(By.xpath("//select[@name='DateOfBirthYear']/option[10]")).click();;
		
		
		//String Email = "sunkrivan21aug@gmail.com";
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("sunkrivan21aug@gmail.com");
		
		//String Password = "xyzabc";
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Password");
		
		driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys("Password");
		driver.findElement(By.xpath("input//[@id='register-button']")).click();
		driver.findElement(By.xpath("//a[@class='ico-logout']")).click();
		driver.findElement(By.xpath("//a[@class='ico-login']")).click();
		
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("Email");
		
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Password");
		
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		
		
		
		
		
		
		
		
		
		
		
	}
}
