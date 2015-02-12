import java.util.Vector;

public class TryVector{

	public static void main ( String [] args){
	
	Vector<String> names = new Vector<String>();
	
	String [] firstnames = {"Demola","Femi","Ope","Tobi","Tolu"};
	
	for( String firstname : firstnames){
	
	names.add(firstname);
	
	}
	
	for( String name:names){
		System.out.println(name);
	}
	
	names.sort();
	
	for( String name:names){
		System.out.println(name);
	}
	
	}

}