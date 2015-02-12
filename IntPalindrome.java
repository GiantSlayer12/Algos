public class IntPalindrome{

	public static void main(String [] args){

		int [] numbers = { 0, 123, 345, 890, 456, 678, 310, 7890, 12345, 203};

		for(int number : numbers)
			System.out.printf("The reverse of %d is %s", number , reverse(number) + "\n");
			//System.out.println("\n");
		
		

	}

	public static int reverse(int number){

		int k = 0;

		while(number != 0){

			k = k*10 + number%10;
			number = number/10;

		}

		return k;
	}
}