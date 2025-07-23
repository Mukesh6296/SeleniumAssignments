package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Phoneprice {
	WebDriver driver;
	public void init()
	{
    driver = new ChromeDriver();
	driver .get("https://www.amazon.in/");
	
	WebElement continue_shopping = driver.findElement(By.xpath("//button[contains(@class,'a-button-text')]"));
	continue_shopping.click();
	
	WebElement search=	driver.findElement(By.xpath("//input[contains(@placeholder,'Search Amazon.in')]"));
	search.sendKeys("phones"+Keys.ENTER);
	
	List<WebElement> price = new ArrayList<WebElement>();
	price = driver.findElements(By.xpath("//span[contains(@class,'a-price-whole')]"));
	List<Integer> phprice = new ArrayList<Integer>();
// Looping to remove , from price 
	for (WebElement mob : price) 
	{
	    String cost = mob.getText();
	    String alt_cost = cost.replace(",", "").trim();

	   
	        int newprice = Integer.parseInt(alt_cost);
	        if (newprice >= 500) {  // Filter out unwanted entries (like ads)
	            phprice.add(newprice);
	        
	     
	    }
	}

	// Sort only once after collecting all valid prices
	Collections.sort(phprice);

	System.out.println("Filtered and sorted phone prices: " + phprice);

	// Prints second lowest price if at least 2 valid prices exist
	if (phprice.size() >= 2) {
	    System.out.println("Second lowest price is: " + phprice.get(1)); // change 1->0 for the first lowest 
	} else {
	    System.out.println("Not enough valid prices .");
	}
			
	
		
	}
	
	public static void main (String [] args)
	{
		Phoneprice pp = new Phoneprice();
		pp.init();
		
	}
	
}
