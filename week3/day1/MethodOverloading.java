package week3.day1;

public class MethodOverloading {
	
	public void reportStep(int a)
	{
		System.out.println("integer input "+a);
	}
    public void reportStep( String a , double d)
    {
    	System.out.println( "string:"+a+"double: "+d);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          MethodOverloading mtdovrldng = new  MethodOverloading();
          mtdovrldng.reportStep(10);
          mtdovrldng.reportStep("alpha",11.7);
	}

}
