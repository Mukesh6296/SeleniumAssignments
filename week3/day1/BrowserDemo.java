package week3.day1;

public class BrowserDemo {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		 Chrome chrome = new Chrome();
	       
	        chrome.openURL();
	        chrome.openIncognito();
	        chrome.clearCache();
	        chrome.closeBrowser();

	        System.out.println();

	        Edge edge = new Edge();
	      
	        edge.openURL();
	        edge.takeSnap();
	        edge.clearCookies();
	        edge.closeBrowser();

	        System.out.println();

	        Safari safari = new Safari();
	        
	        safari.openURL();
	        safari.readerMode();
	        safari.fullScreenMode();
	        safari.closeBrowser();
		 
		 
	        
	
	        
	    }
	
}
	


