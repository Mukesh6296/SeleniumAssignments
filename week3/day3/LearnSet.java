package week3.day3;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LearnSet {
	
	
	
	public void conversion()
	{
		String word = "google";
	char tochar [] = word.toCharArray();
	
	
	
	System.out.println("converted array "+Arrays.toString(tochar));
	
	Set<Character> myset = new LinkedHashSet<Character>();
	int length = tochar.length;
	
	for (int i = 0; i < tochar.length; i++)
	{
		myset.add(tochar[i]);
		
	}
	
	System.out.println("after removing duplicates "+ myset);
	
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LearnSet ls = new LearnSet();
		ls.conversion();
	}

}
