package week3.day2;

public class Amazon  extends CanaraBank implements Payments{
	@Override
	public void cashOnDelivery() {
		// TODO Auto-generated method stub
		
		System.out.println(" COD from interface Payments ");
		
	}

	@Override
	public void upiPayments() {
		// TODO Auto-generated method stub
		System.out.println("upipayments from interface");
	}

	@Override
	public void cardPayments() {
		// TODO Auto-generated method stub
		System.out.println("Cardpayments from interface");
	}

	@Override
	public void internetBanking() {
		// TODO Auto-generated method stub
		System.out.println("internetBanking from interface");
	}

	@Override
	public void recordPaymentDetails() {
		// TODO Auto-generated method stub
		System.out.println("record payment details frm abstract method ");
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Amazon az = new  Amazon();
		az.cashOnDelivery();
		az.upiPayments();
		az.cardPayments();
		az.internetBanking();
		az.recordPaymentDetails();
	}

	
	}


