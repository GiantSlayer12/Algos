public class SumOfDigits{

	public static void main (String [] args){

		System.out.println("sumOfDigits(123):" + sumOfDigits(123));
		System.out.println("sumOfDigits(29):" + sumOfDigits(29));
		System.out.println("sumOfDigits(1):" + sumOfDigits(1));

	}

	public static int sumOfDigits(int number){
		if(number / 10 == 0)
			return number;
		return number%10 + sumOfDigits(number/10);
	}

	public static int isumOfDigits(int number){

		int k = 0;
		while ( number != 0){

			k = k + number%10;
			number = number / 10;
		}
		return k;
	}
}