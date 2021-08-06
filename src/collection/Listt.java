package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Listt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		List<String>al=new ArrayList<>();
		//al=Arrays.asList("2","3");
		al.add("4");
		al.add("9");
		al.add("10");
		al.add("6");
		al.add("5");
		al.add("null");
	
//		
//System.out.println(al.remove(3));
//	System.out.println(al.get(3));
//	

	Iterator<String>il =al.iterator();
	
	while(il.hasNext())
	{
		System.out.println(il.next());
	}
		

	}

}
