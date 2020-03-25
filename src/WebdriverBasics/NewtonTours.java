package WebdriverBasics;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class NewtonTours {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/sunita/Documents/eclipse/BasicWebdriverProgram/chromedriver");

		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.newtours.demoaut.com/");
		
		//driver.findElement(By.name("userName")).sendKeys("mercury");
		WebElement Username = driver.findElement(By.name("userName"));
		Username.sendKeys("mercury");
		
		//driver.findElement(By.name("password")).sendKeys("mercury");
		WebElement Password = driver.findElement(By.name("password"));
		Password.sendKeys("mercury");
		
		
		WebElement Login = driver.findElement(By.name("login"));
		Login.click();
		
		WebElement RoundTrip = driver.findElement(By.name("tripType"));
		RoundTrip.click();
		
		WebElement Passengers = driver.findElement(By.name("passCount"));
		Select No_Passengers = new Select(Passengers);
		No_Passengers.selectByVisibleText("2");
		
		WebElement Departure = driver.findElement(By.name("fromPort"));
		Select From = new Select(Departure);
		From.selectByVisibleText("New York");
		
		WebElement Date = driver.findElement(By.name("fromMonth"));
		Select OnMonth = new Select(Date);
		OnMonth.selectByVisibleText("March");
		
		WebElement FromDay = driver.findElement(By.name("fromDay"));
		Select OnDay = new Select(FromDay);
		OnDay.selectByVisibleText("5");
		
		WebElement Ariving = driver.findElement(By.name("toPort"));
		Select ArivingPlace = new Select(Ariving);
		ArivingPlace.selectByVisibleText("London");
		
		WebElement Returning = driver.findElement(By.name("toMonth"));
		Select ReturningMonth = new Select(Returning);
		ReturningMonth.selectByVisibleText("March");
		
		WebElement ToDate = driver.findElement(By.name("toDay"));
		Select ReturningDay = new Select(ToDate);
		ReturningDay.selectByVisibleText("15");
		
		driver.findElement(By.name("servClass")).click();
		
		WebElement Airlines = driver.findElement(By.name("airline"));
		Select Preference = new Select(Airlines);
		Preference.selectByVisibleText("Unified Airlines");
		
		driver.findElement(By.name("findFlights")).click();
		
	}

}
