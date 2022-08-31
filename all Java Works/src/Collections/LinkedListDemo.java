package Collections;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// create linkedlist
		LinkedList<String> linkedList= new LinkedList<String>();
		
		// adding elements to ArrayList
		
		linkedList.add("Newyork");
		linkedList.add("Colorado");
		linkedList.add("Ethiopia");
		
		// Displaying LinkedList
		System.out.println(linkedList);
		
		//Traversing Linked list
		for(String elt: linkedList) {
			System.out.println(elt);
			
		}

	}

}
