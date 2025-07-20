package week2.day2;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Browserlaunch {

public static 	WebDriver driver ;
public static  WebDriverWait wdw = new WebDriverWait(driver, java.time.Duration.ofSeconds(10));;
	public static void leaftaps()
	{
	    driver= new ChromeDriver();
	    driver.manage().window().maximize();
	    
		driver.get("http://leaftaps.com/opentaps/control/login");
	}
	
	public static void CheckPageLaunched()
	{
		WebElement loginbutton = driver.findElement(By.xpath("//input[contains(@value,'Login')]"));
		
		wdw.until(ExpectedConditions.visibilityOf(loginbutton));
		if (loginbutton.isDisplayed())
		{
			System.out.println("launched and loaded");
		}
	}
	public static void teardown() 
	{
		driver.quit();
	}
	
	public static void main (String [] args)
	{
		Browserlaunch.leaftaps();
		Browserlaunch.CheckPageLaunched();
		try {
			Thread.sleep(5000);
			Browserlaunch.teardown();
		
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
}
}
	



