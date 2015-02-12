import java.io.IOException;

public class Halo{

	public static void main(String [] args){
	
	
	print("Act like it is");
	print("(press enter to exit)");
	
	double result = 200.00;
	
	for(int i = 1; i < 10; ++i){
	
	System.out.println( " " + i + " " + (double)(result /= i));	
	
	
	
	}
	
	
	
	
	
	
	}


	public static void print(String string){
	
		System.out.println(string);
	
	}



}