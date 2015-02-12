 import java.util.Random;
 
 class Weather{
 
	static Random random = new Random();
 
	public static void main( String[] args){
	
	float [][] temperature = new float[10][365];
	
	//Generate random values for temps
	for(int i = 0; i < 10; ++i){
	
		for( int j = 0; j < 365; j++){
		
			temperature[i][j] = 10 + random.nextInt(35);
			
		}
	
	}
	
	//sum up
	
	for(int i = 0; i < 10; i++){
	float average = 0F;
	
		for(int j = 0 ; j < 365; j++){
		
		average += temperature[i][j];
		
		}
		
		System.out.println("Average temp for location " + i + " is : " + average/temperature[i].length);
		
		
	
	}
 
 
	}
 
 }