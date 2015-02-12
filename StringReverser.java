
public class StringReverser{
	
	public static void main(String[] args){
		System.out.println("fox jumps over the lazy dog" + " reversed is : " + "\n" + reversed("fox jumps over the lazy dog"));
	}

	public static String reversed(String word){

		String[] splitString = word.split(" ");
		StringBuilder sb = new StringBuilder();
		for(int i = splitString.length - 1; i >= 0; i-- ){
			sb.append(splitString[i] + " ");
		}
		return sb.toString();

	}
}