package week3.day1;

public class Browser {
	
	 public String browserName = "Default";
	 public double browserVersion =1.2;

	
	public void openURL() 
	{
	    System.out.println("Opening URL in " + browserName);
	}

	public void closeBrowser()
	{
	    System.out.println("Closing " + browserName + " browser");
	}

	public void navigateBack() 
	{
	    System.out.println("Navigating back in " + browserName);
	}

}
