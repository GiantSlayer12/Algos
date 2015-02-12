public class BinarySearch{

	public static void main(String [] args){

		int c[] = {1,2,3,4,5,6,7,8,9};
		System.out.println(bsearch(8,c));
		System.out.println(ssearch(8,c));
	}

	public static boolean bsearch(int t, int [] c){

		int n = c.length;
		int low = 0;
		int high = n - 1;

		while(low <= high){

			int ix = (high + low) / 2;
			if(t == c[ix]){
				return true;
			}else if( t <= c[ix]){
				high = ix - 1;
			}else{
				low = ix + 1;
			}

		}
		return false;
	}

	public static boolean ssearch(int t, int[] c){
		for(int i : c){
			if(c[i]==t)
				return true;

		}
		return false;
	}


}