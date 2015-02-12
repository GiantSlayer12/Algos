import java.util.Scanner;
import java.io.*;


public class Neytiri
{

	public static void main( String [] args )
	{
		String filePath = "avatar.txt";
		
		String [] posPals = ReadFile( filePath );
		
		for( int i = 0; i < posPals.length ; i++)
		{
			System.out.println("Testing --> " + posPals[i]);
			if( isPalindrome(posPals[i]))
			{
				System.out.println(posPals[i] + " is a Palindrome");
			}else
			{
				System.out.println( posPals[i] + " is not a Palindrome");
			}
		}
	
	}

	public static String[] ReadFile( String filepath )
	{
		// create a Scanner object for our file
		File inF = new File(filepath);
		Scanner sc = null;
		try {
			sc = new Scanner(inF);
		} catch (FileNotFoundException e) {
		System.out.println("Cannot open " + filepath);
		System.exit(1);
		}
		// do an initial scan through the file to determine the number of lines,
		// i.e., the number of possible palindromes to test
		int numLines = 0;
		for ( ; sc.hasNextLine(); numLines++) {
			sc.nextLine();
		}
		sc.close();
		
		try {
			sc = new Scanner(inF);
			} catch (FileNotFoundException e) {
				System.out.println("Cannot open " + filepath);
				System.exit(1);
			}
			// init String array of possible palindromes
			String[] possPals = new String[numLines];
			for (int l = 0; l < numLines; l++) {
				possPals[l] = sc.nextLine();
			}
			sc.close();
			return possPals;
	}
	
	public static boolean isPalindrome( String possPal )
	{
		// to lower
		String possPal_norm = possPal.toLowerCase().replaceAll(" |:|;|\\.|,|'","");
		// init start/end indices
		int startIdx = 0;
		int endIdx = possPal_norm.length() - 1;
		// check each pair of characters at the beginning/end
		for( ; startIdx <= endIdx; startIdx++, endIdx--) {
			if (possPal_norm.charAt(startIdx) != possPal_norm.charAt(endIdx)) {
			// characters are different, so return false
				return false;
			}
		}
		// if we've made it to here, that means we have a palindome
		return true;
	}
}