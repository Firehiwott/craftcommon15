package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	ArrayList values = new ArrayList();
		
	
		
		values.add("4");
		values.add("6.0");
		values.add("4");
		values.add("Firehiwot");
		values.add("4");
		values.add("A");
		values.add("3.14");
		values.add(1,4);
		values.remove(0);
		
		System.out.println(values);
		System.out.println();
		
		// Iterator use to display
		Iterator it = values.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.hasNext());
		}
		System.out.println();
		
//		for(int i =0; i<values.size(); i++) {
//			System.out.println(values.get(i));
//		}
		
		
		System.out.println();
		
//		for(String o = values) {
//			System.out.println(o);	
//		}
		

	}

}
