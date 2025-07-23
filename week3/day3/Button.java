package week3.day3;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Point;

public class Button {
	WebDriver driver;
	
	public void workWithButtons()
	{
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
			driver .get("https://leafground.com/button.xhtml");
	}
public void verifyTitle()
{
	  WebElement clickButton = driver.findElement(By.xpath("//span[text()='Click']"));
      clickButton.click();

      
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));


      String actualTitle = driver.getTitle();
      System.out.println("Page title is: " + actualTitle);

   
      String expectedTitle = "Dashboard";  

      if (actualTitle.equals(expectedTitle)) {
          System.out.println("Verified: The title contains expected text.");
      } else {
          System.out.println("Title mismatch. Expected: " + expectedTitle + ", but got: " + actualTitle);
      }
  }
public void navigate_Back()
{
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.navigate().back();
	System.out.println("navigated back");
}

public void checkbuttonDisabled()
{
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	WebElement button = driver.findElement(By.xpath("//button[contains(@class,'ui-button-text-only ui-state-disabled')]"));
	if(!button.isEnabled())
	{
		System.out.println("Button is disbaled as expected");
	}
}

public void ButtonPosition ()
{
	WebElement button = driver.findElement(By.xpath("//button[contains(@id,'j_idt88:j_idt94')]"));
	
	Point location = button.getLocation();
	int x = location.getX();
	int y = location.getY();
	System.out.println("X: " + x + ", Y: " + y);
}

public void ButtonColorCheck()
{
	WebElement button = driver.findElement(By.xpath("//button[contains(@id,'j_idt88:j_idt96')]"));
String value =	button.getCssValue("background-color");
System.out.println("colour of the button is "+value);
	
}

public void buttonHeight()
{
	WebElement Button =	driver.findElement(By.xpath("//div/button[contains(@name,'j_idt88:j_idt98')]"));
System.out.println("button height is "+Button.getSize());
}

public void teardown()
{
	driver.close();
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Button btn = new Button();
		btn.workWithButtons();
		btn.verifyTitle();
		btn.navigate_Back();
		btn.checkbuttonDisabled();
		btn.ButtonPosition();
		btn.ButtonColorCheck();
		btn.buttonHeight();
	}

}
