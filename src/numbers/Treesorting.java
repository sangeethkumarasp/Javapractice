package numbers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class Treesorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int ar[]= {1,5,2,9,12,8,20,25,15};
		Integer[] ins=new Integer[ar.length];
		
		for(int i=0;i<ar.length;i++)
		{
			ins[i]=ar[i];
		}
		
TreeSet<Integer>ts=new TreeSet<Integer>(Arrays.asList(ins));
//Ascending
//System.out.println(ts);

TreeSet<Integer>ts1=(TreeSet<Integer>) ts.descendingSet();
		System.out.println(ts1);
		
		
	}

}
