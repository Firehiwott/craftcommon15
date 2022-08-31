package Collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hs = new HashSet<String>();
		
		hs.add("Firehiwot");
		hs.add("Hana");
		hs.add("Biruk");
		hs.add("Hermon");
		
		System.out.println(hs);
		
		Iterator itr = hs.iterator();
		
		for(String elt:hs) {
			System.out.println(elt);
		}
	}

}
