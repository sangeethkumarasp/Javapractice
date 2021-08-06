package numbers;

import java.util.Scanner;

public class Primno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean b=false;
		Scanner in =new Scanner(System.in);
	int numb=	in.nextInt();
	
	for(int i=2;i<=numb/2;i++)
	{
		if(numb%2==0)
		{
		b=true;
		break;
		}
	}
	if(!b)
	{
		System.out.println("it is  prime");
	}else
	{
		System.out.println("it isnot a  prime no");
	}
		
	}

}
