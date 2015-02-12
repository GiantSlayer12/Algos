

public class Author{

	public static void main (String [] args){
	
		//for(int i = 0; i <= 20; i++){
		
		//System.out.println(i + "!" + " is : " + (factorial(i)));
		
		//}
		
		min(20);



	}
	
	
	public static long factorial(int n){
	
	if( n == 0){
		return 1;
	}
	
	else{
		return n * factorial(n-1);
	}
	
		
	}
	
	public static void min( int n ){
	
		for(int i = 1; i <= n; ++i){
			
			long factor = 1;
			long factorial = 1;
			
			while( factor <= i){
				
				factorial *= factor++;
			}
			
			System.out.println( n + "! = " + factorial);
		}
	
	
	}



}
