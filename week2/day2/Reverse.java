package week2.day2;

public class Reverse {
	
	public static void stringReverse(String str1)
	{
		  if (str1 == null) {
			  
			  System.out.println("invalid input");
		  }
		  else	
		  {
		char[] rev = str1.toCharArray();
		 System.out.print("Reversed String: ");
		for(int i=rev.length-1;i>=0;i--)
		{
			System.out.print(rev[i]);
		
		}
		  }
	
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Reverse.stringReverse("testleaf");
		
	}

}
