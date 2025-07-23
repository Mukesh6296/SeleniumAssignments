package week3.day2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ArrrayList {
	
	
	public static void arrayList()
	{
		List<String> arrlist = new ArrayList<String>();
		arrlist.add("Aaaaaa");
		arrlist.add("Bbbbbb");
		arrlist.add("Cccccc");
		arrlist.add("Dddddd");
		System.out.println("arrayList-> "+arrlist);
		
	System.out.println(arrlist.size());
	
	System.out.println(arrlist.get(3));
	
	System.out.println(arrlist.remove(1));
	
	System.out.println(arrlist);
	
	System.out.println();
	arrlist.add("Dddddd");
	arrlist.add("Bbbbbbb");
	System.out.println(arrlist);
	
	Collections.sort(arrlist);
	System.out.println(arrlist);
	
	arrlist.remove(3);
	System.out.println(arrlist);
	
	arrlist.clear();
	System.out.println(arrlist);
	
	List<String> newarrlist = new ArrayList<String>();
	newarrlist.addAll(arrlist);
	System.out.println(newarrlist);
	newarrlist.removeAll(arrlist);
	System.out.println(newarrlist);
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrrayList.arrayList();

	}

}
