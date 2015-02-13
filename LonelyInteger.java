import java.util.*;

public class LonelyInteger{


	public static void main (String[] args){
		Scanner in = new Scanner(System.in);
        int res;
        
        int _a_size = Integer.parseInt(in.nextLine());
        int[] _a = new int[_a_size];
        int _a_item;
        String next = in.nextLine();
        String[] next_split = next.split(" ");
        
        for(int _a_i = 0; _a_i < _a_size; _a_i++) {
            _a_item = Integer.parseInt(next_split[_a_i]);
            _a[_a_i] = _a_item;
        }
        
        res = findMinDuplicateInt(_a);
        System.out.println(res);
	}



	public static int findMinDuplicateInt(int [] inputs){

		Map <Integer,Integer> intMap = new HashMap<Integer,Integer>();

		for(int input : inputs){
			if(intMap.containsKey(input)){
				intMap.put(input,intMap.get(input) + 1);
			}else{
				intMap.put(input,1);
			}
		}

		Set<Map.Entry<Integer,Integer>> entrySet =  intMap.entrySet();
		int smallest = Integer.MAX_VALUE;
		int x = 0;
		for(Map.Entry<Integer,Integer> entry : entrySet){

			if(smallest > entry.getValue()) {
            
                smallest = entry.getValue();
                x = entry.getKey();
                break;

            }

		}

		return x;
	}

}