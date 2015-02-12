import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Scanner;

public class FindDuplicateCharacters{


	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		findDuplicateCharacters(word);
	}

	public static void findDuplicateCharacters(String word){
		char [] characters = word.toLowerCase().toCharArray();

		Map <Character,Integer> charMap = new HashMap<Character,Integer>();

		for(Character character : characters){
			if(charMap.containsKey(character)){
				charMap.put(character, charMap.get(character) + 1);
			}else{
				charMap.put(character,1);
			}
		}

		Set<Map.Entry<Character,Integer>> entrySet =  charMap.entrySet();
		for(Map.Entry<Character,Integer> entry : entrySet){

			//if(entry.getValue() > 1)
				System.out.println(entry.getKey()+","+entry.getValue());

		}



	}

}