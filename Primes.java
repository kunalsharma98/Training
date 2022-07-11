package prime;
import java.util.Scanner;

public class Primes {
public static void main(String ars[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter starting number:");
	int st=sc.nextInt();
	System.out.println("Enter end number:");
	int en=sc.nextInt();
	int count;
	for(int i=st;i<=en;i++)
	{
		count=0;
		for(int j=1;j<=i;j++)
		{
			if(i%j==0)
				count=count+1;
		}
		if(count==2)
			System.out.print(" "+i);
		
		
	}
	}
}


