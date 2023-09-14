package week4HomeAssignments;

import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String string = "We learn java basics as part of java sessions in java week1";
		
	    StringTokenizer str = new StringTokenizer(string);
		
		System.out.println("Total words is " +str.countTokens());
		
		Set<String> setstr1 = new TreeSet<>();
		
		while(str.hasMoreTokens())
		{
			String word = str.nextToken();
		
			if(!setstr1.contains(word))
		{
			System.out.print(word +" ");
			setstr1.add(word);
		}
			
		}
		

	}

}
