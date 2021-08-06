package Strngprog;

public class Charrever {

	/**Coomand from git master
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s="sangeeth is wo^";
	char[]sarray=	s.toCharArray();
	
	
	for(int i=sarray.length-1;i>=0;i--)
	{
		System.out.println(sarray[i]);
	}
	
	
	
String[]sar=	s.split(" ");

for(int i=0;i<sar.length-1;i=i+2)
{
	System.out.println(sar[i]);
}
	}

}
