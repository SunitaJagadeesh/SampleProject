package HRM_PracticeProgram;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dependency_practiceProgram {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("http://testingmasters.com/hrm");

		//login as a team member................................
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("user02");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("TM1234");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		
		
		//click my info.........................................
		driver.findElement(By.xpath("//a[@id='menu_pim_viewMyDetails']")).click();
		driver.findElement(By.xpath("//ul[@id='sidenav']/li[4]")).click();
		driver.findElement(By.xpath("//input[@value='Add']")).click();
		driver.findElement(By.xpath("//input[@id='dependent_name']")).sendKeys("Ronit");	
		driver.findElement(By.xpath("//select[@id='dependent_relationshipType']/option[2]")).click();
		driver.findElement(By.xpath("//img[@class='ui-datepicker-trigger']")).click();
		driver.findElement(By.xpath("//select[@class='ui-datepicker-month']/option[2]")).click();
		driver.findElement(By.xpath("//select[@class='ui-datepicker-year']/option[text()='2019']")).click();
		driver.findElement(By.xpath("//a[text()='24']")).click();
		driver.findElement(By.xpath("//input[@id='btnSaveDependent']")).click();
		
		
		String givenName = "Ronit";
		boolean btag = false;
		
		int rowCount = driver.findElements(By.xpath("//table[@id='dependent_list']/tbody/tr")).size();
		System.out.println("row count is "+rowCount);
		
		//To add a dependency.....................................................
		for(int i=1; i<=rowCount; i++)
		{
			String addedName = driver.findElement(By.xpath("//table[@id='dependent_list']/tbody/tr["+i+"]/td[2]")).getText();
			String DateOfBirth = driver.findElement(By.xpath("//table[@id='dependent_list']/tbody/tr["+i+"]/td[4]")).getText();
			
		    if((givenName.equals(addedName))&& (DateOfBirth.equals("2019-02-24")))
		    	btag = true;  	
		}
		if(btag)
			System.out.println("Dependency "+givenName+ " - added ");
		else
		    System.out.println("Dependency "+givenName+ " - Not added ");
		
		//To delete a dependency....................................................
		boolean ctag = false;
		
		int rowCountNew = driver.findElements(By.xpath("//table[@id='dependent_list']/tbody/tr")).size();
		System.out.println("row count is "+rowCountNew);
		
		for(int i=1; i<=rowCountNew; i++)
		{
			String ToDeleteName = driver.findElement(By.xpath("//table[@id='dependent_list']/tbody/tr["+i+"]/td[2]")).getText();
		    if((givenName.equals(ToDeleteName))) {
		    	driver.findElement(By.xpath("//table[@id='dependent_list']/tbody/tr["+i+"]/td[1]")).click();
		    	driver.findElement(By.xpath("//input[@id='delDependentBtn']")).click();
		    	ctag = true;
		    	break;
		    }  
		}
		if(ctag)
			System.out.println("Dependency "+givenName+ " - deleted ");
		else
			System.out.println("Dependency "+givenName+ " - Not deleted ");
		
		driver.quit();
	}

}
