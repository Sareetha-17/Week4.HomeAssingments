package week4HomeAssignments;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class RemoveDuplicates_string {

	public static void main(String[] args) {
		String name = "PayPal India";
		name.equalsIgnoreCase(name);
		int length = name.length();
		System.out.println(length);
		
		char[] ch = name.toCharArray();
		Set charSet = new LinkedHashSet<>();		
		for (char each : ch) {
			charSet.add(each);	
		}
		System.out.println("Unique Characters " +charSet);
		
		List<Character> lstr = new ArrayList<>(charSet);
		
		for (char eachnew : lstr) {
			
			System.out.print(eachnew);
			
		}
		
		
		
		
	
	}

}
