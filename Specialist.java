import java.util.Scanner;
import java.util.InputMismatchException;

public class Specialist{

	public static Scanner in;

	public static void main( String [] args){
	
	in = new Scanner(System.in);
	
	try{
	
	
	System.out.println("Enter number A: ");
	int a = in.nextInt();
	
	System.out.println("Enter number B: ");
	int b = in.nextInt();
	
	System.out.println("Sum of numbers you entered is : " + (a + b));
	
	
	}catch(InputMismatchException ex){
	System.out.println("Hello! You entered a charceter. TRY AGAIN!");
	}
	
	
	
	
	
	}







}