package com.tm.miniframework;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HRMuserLibs {
	
	public static WebDriver driver = new ChromeDriver();
	   
    // method to launch HRM application
	public static void launchApp () {
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);     
		driver.get("http://testingmasters.com/hrm");
	}
	// method to login HRM application
	public static void loginApp () {
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("user02");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("TM1234");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
	}
	//method for mouse hover using Action class
	public static void mousehoverLeave () {
		WebElement leave = driver.findElement(By.xpath("//a[@id='menu_leave_viewLeaveModule']"));
		Actions act = new Actions(driver);
		act.moveToElement(leave).build().perform();	
	}
	//method to apply leave
	public static void applyingLeave ()  {
		
		/*
		WebElement leave = driver.findElement(By.xpath("//a[@id='menu_leave_viewLeaveModule']"));
		Actions act = new Actions(driver);
		act.moveToElement(leave).build().perform();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);  
		
		driver.findElement(By.xpath("//a[@id='menu_leave_applyLeave']")).click();
		driver.findElement(By.xpath("//a[@id='menu_leave_applyLeave']")).click();
		driver.findElement(By.xpath("//select[@id='applyleave_txtLeaveType']/option[text()='Personal Leave']")).click();	
		*/
		
		try {
		Thread.sleep(2000);
		
		WebElement leave = driver.findElement(By.xpath("//a[@id='menu_leave_viewLeaveModule']"));
		Actions act = new Actions(driver);
		act.moveToElement(leave).build().perform();
		
		System.out.println("mousehover action completed");
		
		driver.findElement(By.xpath("//a[@id='menu_leave_applyLeave']")).click();
		
		System.out.println("click action completed");
		
		driver.findElement(By.xpath("//select[@id='applyleave_txtLeaveType']/option[text()='Personal Leave']")).click();
		}
		catch(Exception e)
		{
		
		}
	}
	//method to click apply
	public static void clickApply () {
		driver.findElement(By.xpath("//input[@id='applyBtn']")).click();
		//driver.quit();
	}
	//method to view my leave
	public static void myLeave () {
		WebElement leave = driver.findElement(By.xpath("//a[@id='menu_leave_viewLeaveModule']"));
		Actions act = new Actions(driver);
		act.moveToElement(leave).build().perform();
	    driver.findElement(By.xpath("//a[@id='menu_leave_viewMyLeaveList']")).click();
	}
	//method for date picker
	public static void datePicker () {
		System.out.println("zsxdfvgbhnjkm");
		driver.findElement(By.xpath("//li[1]/img[@class='ui-datepicker-trigger']")).click();
		driver.findElement(By.xpath("//select[@class='ui-datepicker-month']/option[1]")).click();
		driver.findElement(By.xpath("//select[@class='ui-datepicker-year']/option[102]")).click();
		driver.findElement(By.xpath("//a[text()='10']")).click();
		
		
		driver.findElement(By.xpath("//li[2]/img[@class='ui-datepicker-trigger']")).click();
		driver.findElement(By.xpath("//select[@class='ui-datepicker-month']/option[1]")).click();
		driver.findElement(By.xpath("//select[@class='ui-datepicker-year']/option[102]")).click();
		driver.findElement(By.xpath("//a[text()='21']")).click();
		
	}
	//method for uncheck the all checkbox and view the status in console
	public static void checkbox () {
		driver.findElement(By.xpath("//input[@id='leaveList_chkSearchFilter_checkboxgroup_allcheck']")).click();
		
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
	}
	//method to check the checkbox pending status and click search button
	public static void pendingStatusCheck () {
		
		try {
			Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='leaveList_chkSearchFilter_1']"));
		driver.findElement(By.xpath("//input[@id='btnSearch']"));
		System.out.println("Pending status checkbox selected");
		}
		catch(Exception e)
		{
		}
	}
	//method to click search button
	public static void clickSearch () {
		driver.findElement(By.xpath("//input[@id='btnSearch']"));
		System.out.println("Search check box selected");
	}
	//method to cancel a particular leave in pending status
	public static void cancelLeave () {
		
	}
	// method for row count 
	public static void rowCount () {
		List<WebElement> rowCount = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr"));
		int r = rowCount.size();
		System.out.println("number of rows are : "+ r);
	}
	//method for coloumn count 
	public static void colCount () {
		List<WebElement> colCount = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr[1]/td"));
		int c = colCount.size();
		System.out.println("number of coloumns are : "+ c);	
	}
 

}
