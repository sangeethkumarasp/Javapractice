package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class Hshsett {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
TreeSet<String>al =new TreeSet<String>();
al.add("aan");
al.add("lan");
al.add("wan");
al.add("kanr");
al.add("bankioo");


NavigableSet<String>
treereverse = al.descendingSet();

Iterator<String>il=treereverse.iterator();

while(il.hasNext())
{
	System.out.println(il.next());
}




for(String ao:al)
{
	System.out.println(ao);
}



		
		
		
	}

}
