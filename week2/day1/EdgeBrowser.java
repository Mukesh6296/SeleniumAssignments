package week2.day1;

public class EdgeBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Browser browser= new Browser();
System.out.println("returned from launchBrowser method "+browser.launchBrowser("Chrome"));
browser.loadUrl();
	}

}
