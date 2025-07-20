package week2.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class learnxpath {
	
	public static void flipakrt()
	{
		ChromeOptions co = new ChromeOptions();
        co.addArguments("--guest");
				ChromeDriver driver = new ChromeDriver(co);

				// Load Url
				driver.get("https://www.flipkart.com/");

				// Maximize the Browser
				driver.manage().window().maximize();
				
				//a[contains(text(),'Men')])[6] --> mens shirts
              driver.findElement(By.xpath("//input[contains(@title,'Search for Products, Brands and More')]")).sendKeys("mens shirts"+Keys.ENTER);
              
				driver.findElement(By.xpath("(//a[contains(text(),'Men')])[4]")).click();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
learnxpath.flipakrt();
	}

}
