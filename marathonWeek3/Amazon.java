package marathonWeek3;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.internal.WebElementToJsonConverter;
import org.openqa.selenium.support.ui.Select;

public class Amazon {

	WebDriver driver;
	public void browser_setup()
	{
		
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
		driver .get("https://www.amazon.in/");
		 
	}
	
	public void searchBoysBags()
	
	{
		
		//    'Continue Shopping' button -> optional button -- need to handle this , if fails restart again.
		   WebElement continue_shopping = driver.findElement(By.xpath("//button[contains(@class,'a-button-text')]"));
		    continue_shopping.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement search = driver.findElement(By.xpath("//input[contains(@placeholder,'Search Amazon.in')]"));
		search.sendKeys("Bags for boys" + Keys.ENTER);
	}
	
	public void getResults()
	{
		WebElement results = driver.findElement(By.xpath("//span[contains(text(),'results for')]"));
		System.out.println("total results ->"+ results.getText());
	}
	
	/*
	public void selectFirsttwoBrands() throws InterruptedException
	{
		List<WebElement> Brands  = driver.findElements(By.xpath("//div[@id='brandsRefinements']//li//span[@class='a-list-item']"));
		int count = 0;
		 for(WebElement brand : Brands)
		 { 
			 Thread.sleep(3000);  
			    
			    brand.click();
			    
				count++;
			    
			    if(count == 1)  //adjust count to be 2 *** need to ask ***
			    {
			        break;  
			    }
		 }
		 
	}*/
	public void selectFirsttwoboxes() throws InterruptedException
	{     //initialized x = 1 for setting limit for 2 brands
		 for (int x = 1; x <= 2; x++) {
		        String dynamicxpath = "(//div[@id='brandsRefinements']//li//span[@class='a-list-item'])[" + x + "]";
		        WebElement brand = driver.findElement(By.xpath(dynamicxpath));
		        
		        if (!brand.isSelected()) {
		            brand.click();
		        }

		        Thread.sleep(4000); // Reduce sleep to 2 seconds if not necessary
		    }
		}
	
	
	public void sortNewarrivals()
	{
	 WebElement option = driver.findElement(By.xpath("//select[@id='s-result-sort-select']"));
	 Select select = new Select(option);
	 select.selectByVisibleText("Newest Arrivals");
	}
	
	public void printVeryFirstBag()
	{
		WebElement firstbagname = driver.findElement(By.xpath("(//h2[contains(@class,'a-size-base-plus a-spacing-none a-color-base a-text-normal')]/span)[1]"));
		String name =firstbagname.getText();
		System.out.println("bag name is :"+name);
		WebElement price = driver.findElement(By.xpath("(//div[contains(@data-cy,'title-recipe')]/div/following::div/div/following::div/div/div/a/span/span[2]/span[2])[1]"));
		String sellingprice = price.getText();
		
		System.out.println("price is  :"+sellingprice);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Amazon shop = new Amazon();
		shop.browser_setup();
		shop.searchBoysBags();
		shop.getResults();
		try
		{
			shop.selectFirsttwoboxes();
		} 
		catch (Exception e)
		{
			
			e.printStackTrace();
		}
		
		try {
			Thread.sleep(10000);
			shop.sortNewarrivals();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		shop.printVeryFirstBag();
	}

}
