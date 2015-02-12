import java.util.Arrays;
public class TestMergeSort{
	
	public static void main(String[] args){
		MergeSort mergeSort = new MergeSort(10);
		System.out.println(" " + mergeSort);

		mergeSort.sort();

		System.out.println( " " + mergeSort);
	}
}