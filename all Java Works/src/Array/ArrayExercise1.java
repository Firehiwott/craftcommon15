package Array;

public class ArrayExercise1 {
	
	
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] studAge = new int[5]; // size=5 index=4
		studAge[0] = 23;
		studAge[1] = 55;
	    studAge[2] = 28;
		studAge[3] = 43;
		studAge[4] = 20;
		
//		System.out.println(studAge[0]);
//		System.out.println(studAge[1]);
//		System.out.println(studAge[2]);
//		System.out.println(studAge[3]);
//		System.out.println(studAge[4]);
//		
		//for loop 
		System.out.println("accessing array element using for loop");
		for(int i=0; i<5; i++) {    // instead
			System.out.print(studAge[i] + " ");
		}
		System.out.println();
		//for each
		System.out.println("accessing array element using foreach");
		for(int elt:studAge) {
			System.out.print(elt + " ");
		}
		
		

	}

}
