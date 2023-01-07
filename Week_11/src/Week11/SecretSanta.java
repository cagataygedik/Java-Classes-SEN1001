package Week11;

import java.util.ArrayList;
import java.util.Random;

public class SecretSanta {

	public static void main(String[] args) {
		
		ArrayList<String> givers = new ArrayList<String>();
		givers.add("çağatay");//0
		givers.add("ekin");
		givers.add("göktürk");
		givers.add("arda");
		givers.add("çağrı efe");
		givers.add("damla");
		givers.add("çağrı");
		givers.add("ramazan");//7
		
		ArrayList<String> takers = (ArrayList<String>)givers.clone();
//		System.out.println(takers);
//		System.out.println(givers);
//		
//		takers.remove("çağatay");
//		
//		System.out.println(takers); //çağatay will not be here anymore
//		System.out.println(givers); //çağatay still here.
		Random r = new Random();
		
		while(!takers.isEmpty()) {
			
			int giverIndex = r.nextInt(givers.size()); //0-7
			int takerIndex = r.nextInt(takers.size()); //0-7
			
			// if these indexes same don't print do the random thing.
			if(givers.get(giverIndex).equals(takers.get(takerIndex)))
				continue;
			
			System.out.println(givers.get(giverIndex) + " is going to give a gift to "+ takers.get(takerIndex));
		
			takers.remove(takerIndex);
			givers.remove(giverIndex);
			}
	}

}
