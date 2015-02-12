
public class StringHelper
{
	
	public static void main( String [] args)
	{
		String myString = "OLUWA IS INVOLVED";
		
		System.out.println("The string : " + myString + "reversed is " );
		
		for( int count = myString.length() - 1; count >= 0; count--)
		{
			System.out.print(myString.charAt(count));
		}
	}



}