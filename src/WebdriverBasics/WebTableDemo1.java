package WebdriverBasics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WebTableDemo1 {

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
		
		driver.findElement(By.xpath("//li[1]/img[@class='ui-datepicker-trigger']")).click();
		driver.findElement(By.xpath("//select[@class='ui-datepicker-month']/option[1]")).click();
		driver.findElement(By.xpath("//select[@class='ui-datepicker-year']/option[102]")).click();
		driver.findElement(By.xpath("//a[text()='10']")).click();
		WebElement to = driver.findElement(By.xpath("//label[@for='leaveList_calToDate']"));
		Actions clickTo = new Actions(driver);
		clickTo.moveToElement(to).build().perform();
		driver.findElement(By.xpath("//li[2]/img[@class='ui-datepicker-trigger']")).click();
		driver.findElement(By.xpath("//select[@class='ui-datepicker-month']/option[1]")).click();
		driver.findElement(By.xpath("//select[@class='ui-datepicker-year']/option[102]")).click();
		driver.findElement(By.xpath("//a[text()='21']")).click();
		WebElement to1 = driver.findElement(By.xpath("//label[@for='leaveList_calToDate']"));
		Actions clickTo1 = new Actions(driver);
		clickTo1.moveToElement(to1).build().perform();
			
		driver.findElement(By.xpath("//input[@id='leaveList_chkSearchFilter_checkboxgroup_allcheck']")).click();
		//if(all)
			//System.out.println("all checkbox selected");
		//else
			//System.out.println("all checkbox not selected");
		boolean Rejected = driver.findElement(By.xpath("//input[@id='leaveList_chkSearchFilter_-1']")).isSelected();
		if(Rejected)
			System.out.println("Rejected checkbox selected");
		else
			System.out.println("all checkbox not selected");
		boolean Cancelled = driver.findElement(By.xpath("//input[@id='leaveList_chkSearchFilter_0']")).isSelected();
		if(Cancelled)
			System.out.println("Cancelled checkbox selected");
		else
			System.out.println("Cancelled checkbox not selected");
		boolean Pending = driver.findElement(By.xpath("//input[@id='leaveList_chkSearchFilter_1']")).isSelected();
		if(Pending)
			System.out.println("Pending checkbox selected");
		else
			System.out.println("Pending checkbox not selected");
		boolean Scheduled = driver.findElement(By.xpath("//input[@id='leaveList_chkSearchFilter_2']")).isSelected();
		if(Scheduled)
			System.out.println("Scheduled checkbox selected");
		else
			System.out.println("Scheduled checkbox not selected");
		boolean Taken = driver.findElement(By.xpath("//input[@id='leaveList_chkSearchFilter_3']")).isSelected();
		if(Taken)
			System.out.println("Taken checkbox selected");
		else
			System.out.println("Taken checkbox not selected");

		List<WebElement> rowCount = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr"));
		int r = rowCount.size();
		System.out.println("number of rows are : "+ r);
		
		Thread.sleep(2000);
		
		List<WebElement> colCount = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr[1]/td"));
		int c = colCount.size();
		System.out.println("number of coloumns are : "+ c);
		
		//String s = driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr[1]/td[text()='Personal Leave']")).getText();
		//System.out.println("the text in the cell is :  "+ s);
		
		String s = driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr[1]/td[3]")).getText();
		System.out.println("the text in the cell is :  "+ s);
		
		//driver.findElement(By.xpath("//select[@id='select_leave_action_1363']/option[2]")).click();
		
		//String s1 = driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr[10]/tr[5]")).getText();
		//System.out.println("the text in the cell is :  "+ s1);
		
		Thread.sleep(5000);
		
		driver.quit();
	}
}
