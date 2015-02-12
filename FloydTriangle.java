import java.util.Scanner;

public class FloydTriangle{
	
	public static void main(String [] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of rows: ");
		int rows = scanner.nextInt();
		printFloydTriangle(rows);
	}

	private static void printFloydTriangle(int rows){
		int number = 1;
		System.out.printf("Floyd's triangle for %d rows" , rows);
		System.out.println();
		for(int i = 1; i <= rows; i++){

			for(int j = 1; j <= i; j++){
				System.out.print(number + " ");
				number++;
			}
			System.out.println("");
		}

	}
}