package week4HomeAssignments;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindSecondLargest {

	public static void main(String[] args) {
		int[] data = {3,2,11,4,6,7,2,3,3,6,7};
		 
		Set<Integer> unique = new TreeSet<>();
		for(int i=0;i<data.length;i++)
		{
			unique.add(data[i]);
		}
		
		System.out.println("Unique elements using SET "+ unique);
		
		
		List<Integer> Seclar = new ArrayList<>(unique);
		int size = Seclar.size();
		System.out.println("Total size   " +  size);
	
		Integer ele = Seclar.get(size-2);
		System.out.println("Second Largest Element is  " +  ele);

		
	}

}
