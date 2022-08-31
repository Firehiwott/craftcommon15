package Array;

public class ArrayExercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double studMark[] = {67.5,78,80,95.9,55,77};
		
		// for check the size
		System.out.println(studMark.length);
		
		
		// accessing array using for loop
		System.out.println("accessing array element using for loop");
		for(int i= 0; i<studMark.length; i++) {  // .length only used for loop
			System.out.print(studMark[i] + " ");
		}
		
		System.out.println();
		// accessing array using foreach
		System.out.println("accessing array element using foreach");
		for(double elt:studMark) {   // foreach we dont need add length
			System.out.print(elt + " ");
		}
		
		System.out.println();
		// accessing array in reverse order
		System.out.println("accessing array in reverse order");
		for(int i = studMark.length-1; i>=0; i--) {
			System.out.print(studMark[i] + " ");
		}
		

	}

}
