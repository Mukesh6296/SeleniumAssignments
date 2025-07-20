package week2.day2;

public class StringConscepts {

	public void stringMethods()
	{
		String str1 = "Selenium Testing";
		
		String str2 = "Selenium Testing"; 
		
		String str3 = "dummy";
		
		boolean check = str1.equals(str2 );
		System.out.println(check);
		
		boolean check2 = str1.equals(str3 );
		System.out.println(check2);
		
		boolean check3 = str1.equalsIgnoreCase(str2);
		System.out.println(check3);
		
		String upcase = str1.toUpperCase();
		System.out.println(upcase);
		
		String lwcase = str1.toLowerCase();
		System.out.println(lwcase);
		

	    char charval = str2.charAt(5);
	    System.out.println(charval);
	     
	    char chararray [] =str1.toCharArray() ;
	    System.out.println(chararray);
	    
	}
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
StringConscepts sc = new StringConscepts();
sc .stringMethods();
	}

}
