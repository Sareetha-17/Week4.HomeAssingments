package week4HomeAssignments;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class PrintUniqueCharacters {

	public static void main(String[] args) {
	
			String name ="SarEetha";
			String lowerCase = name.toLowerCase();
			System.out.println(lowerCase);
			
			char[] ch = lowerCase.toCharArray();
			
			Set str = new LinkedHashSet<>();
			for (char eachchar : ch) {
				str.add(eachchar);
				}
			System.out.println(str);
			
			List<Character> liword = new ArrayList<>(str);
			
			for (char uni : liword) {
				System.out.print(uni);
				
			}
			
			

	}

}
