package Array;

public class ArrayExercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// declaring and initalizing array
		
		String studName[] = new String[] {"Frie", "Abel", "Jamie"}; // size= 3 index =2  which is n-1
	//	String studName[] = {"Frie", "Abel", "Jamie"};
		// inserting data to the array
//		studName[0] = "Frie";
//		studName[1] = "Abel";
//		studName[2] = "Jamie";
		
		
		
		// accessing array element using foreach
		for(String elt:studName) {
			System.out.print(elt + " ");
		}
		
		

	}

}
