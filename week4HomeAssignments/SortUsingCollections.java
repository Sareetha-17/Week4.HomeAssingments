package week4HomeAssignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;

public class SortUsingCollections {

	public static void main(String[] args) {
		String[] str = {"HCL","Wipro","Aspire System","CTS"};
		int len =str.length;
		System.out.println("The length of the String is "+len);
		List<String> list = new ArrayList<>();
		for (String each : str) {
		list.add(each);
		}
		Collections.sort(list);
		System.out.println("The sorted list using collection "+list);
		
		//to get list in descending order
		
		List<String> newlis = new ArrayList<>();
		for(int i=list.size()-1;i>=0;i--)
		{
			newlis.add(list.get(i));
		}
		
		System.out.println("The descending order is "+newlis);
	
	
		

	}

}
