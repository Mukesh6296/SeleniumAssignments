package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class SortingusingCollection {

	public void collections()
	{
	String  organizations [] = {"HCL", "Wipro", "Aspire Systems", "CTS"};
	
	List<String>  mylist = new  LinkedList<String>();
	 for (String comp : organizations )
	 {
		 mylist.add(comp);
		 
	 }
	System.out.println(mylist);
	
	List< String> ls2 = new LinkedList<String>();
	Collections.sort(mylist);
	ls2.addAll(mylist);
	System.out.println("after sorting in ascending order"+ls2);
	}
	
	public void using_reverselogic()
	{
		String  organizations [] = {"HCL", "Wipro", "Aspire Systems", "CTS"};
		List< String> ls2 = new LinkedList<String>();
		List<String>  mylist = new  LinkedList<String>();
		
		//to insert a string array in list 
		 for (String comp : organizations )
		 {
			 mylist.add(comp);
			 
		 }
		System.out.println(mylist);
		// sorting using reverse logic 
		for(int i=mylist.size()-1;i>=0;i--) 
		{
			ls2.add(mylist.get(i));
		}
		
		System.out.println("sorted  List using reverse logic "+ls2);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SortingusingCollection suc = new SortingusingCollection();
		suc.collections();
		suc.using_reverselogic();
	}

}
