import java.util.Arrays;
public class Maze
{
	public static void main(String [] args)
	{
		int [] a = {44, 77, 55, 22, 99, 88, 33, 66};
		int k = Arrays.binarySearch(a, 45);
		System.out.println(k);
		Arrays.sort(a);
		//print[a];
	}

}