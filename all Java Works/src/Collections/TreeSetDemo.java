package Collections;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
TreeSet<String> al = new TreeSet<String>();
		
		al.add("Firehiwot");
		al.add("Hana");
		al.add("Biruk");
		al.add("Hermon");
		al.add("Hermon");
		
		System.out.println(al);
		
Iterator itr = al.iterator();
		
		for(String elt:al) {
			System.out.println(elt);
		}

	}

}
