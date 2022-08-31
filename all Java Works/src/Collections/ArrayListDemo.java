package Collections;


import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    ArrayList list = new ArrayList();
	    
	    list.add("Firehiwot");
	    list.add(10);
	    list.add('a');
	    list.add(0,"Firehiwot");
	    list.remove("Firehiwot");
	    
	    System.out.println(list);
	    
	    Iterator it = list.iterator();
	    
	    
	    while(it.hasNext()) {
	    	 System.out.println(it.next());
	    }
	    
	    System.out.println();
	    
    for(int i=0; i<list.size(); i++) {
    	 System.out.println(list.get(i));
    }

	}

}
