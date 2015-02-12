public class StringReverse{

	public static void main(String [] args){

		String message = "Blessed and Highly Favoured";
		System.out.println("Reversing text:" + message);
		System.out.println("" + reverseRecursively(message));

	}

	public static String reverse(String temp){

		StringBuilder stringBuilder = new StringBuilder();
		char[] tempArray = temp.toCharArray();
		for(int i = tempArray.length - 1; i >= 0; i--)
			stringBuilder.append(tempArray[i]);
		return stringBuilder.toString();
	}

	public static String reverseRecursively(String temp){
		if(temp.length() < 2){
			return temp;
		}

		return reverseRecursively(temp.substring(1)) + temp.charAt(0);
	}
}