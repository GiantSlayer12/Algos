import java.lang.Math;
public class Binary{


	public static void main(String [] args){

		System.out.println(""+ binary(101));

	}

	private static int binary(int n){

		int total = 0;
		int t = 0;
		int b = 0;
		while(n != 0){

			t = n % 10;
			n = n / 10;
			b += t * Math.pow(2,total);
			total++;

		}
		return b;
	}
}