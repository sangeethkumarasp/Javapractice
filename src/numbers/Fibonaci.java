package numbers;

public class Fibonaci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int n1=0;
		int n2=1;
		int count=10;
		System.out.println(n1);
		for(int i=0;i<=count;i++)
		{
			int n3=n1+n2;
			n1=n2;
			n2=n3;
			
			System.out.println(n3);
			
					
		}
		

	}

}
