public class Guess{

	public static void main(String[] args){

		turns(4,1,10);
	}

	public static int turns(int n , int low, int high){

		int turns = 0;

		while(high - low <= 2){

			turns++;

			int mid = (high + low)/2;

			if(mid == n){
				return turns;
			}else if(mid < n){
				low = mid + 1;
			}else{
				high = mid - 1;
			}

		}
		return 1 + turns;
	}
}