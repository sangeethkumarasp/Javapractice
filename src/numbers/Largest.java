package numbers;

public class Largest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ar[]= {3,6,10,16,18,25,6,9};
		int largest =0;
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]>largest)
			{
				largest=ar[i];
			}
		}
		System.out.println(largest);

	}

}
