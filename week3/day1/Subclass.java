package week3.day1;

public class Subclass extends Screenshot {
	
	
	
	public void takeSnap()
	{
		super.takeSnap();
		super.reportStep();
		System.out.println("--inherited class --takes snap");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Subclass sc = new Subclass();
sc .takeSnap();
	}

}
