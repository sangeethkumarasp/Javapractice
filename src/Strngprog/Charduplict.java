package Strngprog;

import java.util.HashMap;
import java.util.Map;

public class Charduplict {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		String s="selenium";
		
		char[] ch=s.toCharArray();
		
		
		Map<Character,Integer>hm =new HashMap<Character,Integer>();
		
		
		
		for(char c:ch)
		{
			if(hm.containsKey(c))
			{
				hm.put(c, hm.get(c)+1);
			}
			else
			{
			hm.put(c, 1);
			}
		}
		

	}

}
