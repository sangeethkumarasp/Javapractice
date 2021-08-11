package Strngprog;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Stringduplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		String s="sangeeth is sangeeth is ok yr is i o";
	String [] sr=s.split(" ");
	
	
	Set<String>hs =new HashSet<String>();
	
	
	
	for(String so:sr)
	{
		if(hs.add(so)==false)
		{
			System.out.println(so);
		}else
		{
			System.out.println("Unique chars are"+so);
		}
			
	}
	}

}
