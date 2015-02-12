//import java.util.Map;
import java.util.HashMap;
import java.util.Set;
//import java.util.Iter;

public class TryMap{

	public static void main ( String [] args ){
	
	HashMap <String , String > aConnect = new HashMap<String , String>();
	
	aConnect.put("MTN","4477");
	aConnect.put("ETISALAT","1170");
	aConnect.put("AIRTEL","1698");
	aConnect.put("GLO","7010");
	aConnect.put("VISAFONE","*141*");
	
	
	Set <String> keys = aConnect.keySet();
	
	//Iter<String> keyIter = keys.iterator();
	
	//while(keyIter.hasNext()){

		//System.out.println(" " + keyIter.next());
	
	//}
	
	for ( String key : keys){
		System.out.println("" + key);
	}
	
	
	}


}