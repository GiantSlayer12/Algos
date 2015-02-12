import java.util.Scanner;

public class Pandora
{


	public static void main( String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter limit: ");
		int n = sc.nextInt();
		sc.close();
		
		boolean [] isPrime = new boolean[n];
		isPrime[0] = false;
		
		for( int c = 1; c < n; c++)
		{
			isPrime[c] = true;
		}
		
		for( int i = 2; i <= n; i++)
		{
			if(isPrime[i-1])
			{
				System.out.println(i);
				
				for(int j = i*i; j <= n; j += i)
				{
					isPrime[j-1] = false;
				}
			}
		}
		
	}


}