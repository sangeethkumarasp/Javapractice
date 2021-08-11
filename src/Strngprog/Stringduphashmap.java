package Strngprog;

import java.util.HashMap;
import java.util.Map;

public class Stringduphashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		String s="Welcome to Welcome happy to";
		
String ar[]=s.split(" ");


Map<String,Integer>hm =new HashMap<String,Integer>();


for(String ao :ar)
{
	if(hm.containsKey(ao))
	{
		hm.put(ao, hm.get(ao)+1);
	}else
	{
		hm.put(ao, 1);
	}
}




for(Map.Entry<String, Integer>hi:hm.entrySet())
{
	
	
	System.out.println(hi.getKey()+"repeated"+hi.getValue());
}


	}

}
