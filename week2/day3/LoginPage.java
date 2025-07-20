package week2.day3;


import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LoginPage {
	
	public static void main(String[] args)
	{
		//System.setProperty("webdriver.chrome.driver", "path/to/chromedriver.exe");
		
	  ChromeDriver  driver= new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("http://leaftaps.com/opentaps/control/login");
	   // WebElement username = driver.findElement(By.id("email"));
	   // username.sendKeys("test@xyz.com");
	   // WebElement password = driver.findElement(By.id("pass"));
	  //  password.sendKeys("Welcome@123");
	  //  WebElement submit = driver.findElement(By.tagName("button"));
	  //.click();
	}
		// TODO Auto-generated method stub
//

	}


