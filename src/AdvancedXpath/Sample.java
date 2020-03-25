package AdvancedXpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sample {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);     
		driver.get("http://testingmasters.com/hrm");
		
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("user02");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("TM1234");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		
		Thread.sleep(2000);
		
		if(driver.findElement(By.xpath("//div[@id='content']/div/div[1]")).isDisplayed())
			System.out.println("home page is displayed");
		else
			System.out.println("home page is not displayed");
		
	
		//mouse hover using Action class
		WebElement leave = driver.findElement(By.xpath("//a[@id='menu_leave_viewLeaveModule']"));
		Actions act = new Actions(driver);
		act.moveToElement(leave).build().perform();
		
		driver.findElement(By.xpath("//a[@id='menu_leave_viewMyLeaveList']")).click();
		
		//Advanced xpath--------------------------------------------
		
		String LeaveDate = "2020-01-01";
		//driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr/td[1]/a[text()='2020-01-01']/parent::td/following-sibling::td[5]/a[contains(text(),'Pending Approval')]/parent::td/following-sibling::td[2]/select/option[text()='Cancel']")).click();
		
		
		driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr/td[1]/a[text()='"+LeaveDate+"']/parent::td/following-sibling::td[5]/a[contains(text(),'Pending Approval')]/parent::td/following-sibling::td[2]/select/option[text()='Cancel']")).click();
		driver.findElement(By.xpath("//input[@id='btnSave']")).click();
	}

}
