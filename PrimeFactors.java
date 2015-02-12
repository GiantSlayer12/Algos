import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class PrimeFactors
{
	public static void main(String [] args)
	{
		Scanner in = new Scanner(System.in);
		int y = in.nextInt();
		System.out.printf("The Prime Factors of '%d' are: %s %n" , y , primeFactors(y));
	}
	
	public static Set <Integer> primeFactors( long number ){
	
		Set<Integer> primefactors = new HashSet<>();
		long temp = number;
		
		for( int i = 2; i <= temp; i++){
			
			if(temp % i == 0){
				primefactors.add(i);
				temp /= i;
				i--;
			}
		}
		
		return primefactors;
	
	}
}