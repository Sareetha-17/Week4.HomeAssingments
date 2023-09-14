package week4HomeAssignments;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MissingNumber {
	
	public static void main(String[] args) {
		int[] number = {1,2,3,5,3,2};
		int length =number.length;
		System.out.println("Length is " + length);
		Set<Integer> setnum = new TreeSet<>();
		for(int i=0;i<number.length;i++)
		{
			setnum.add(number[i]);
		}
		System.out.println("Unique Elements " +setnum);
	  
		for(int i=1;i<length;i++)
		{
    	if(!setnum.contains(i))
    	{
    	 System.out.println("Missing Number is "+ i);
    	}
    	
		}

		}

		}
