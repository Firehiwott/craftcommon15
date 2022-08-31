package Array;

public class ArrayExersice4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double studMark[] = {67.5,78,80,95.9,55,77,56,100};
		
		double avg;
		double total= 0;
		
//		for(double elt: studMark) {
//			total += elt; // total=total + elt     we can used for loop or foreach
//		}
		
		for(int i =0; i<studMark.length; i++) { 
			total += studMark[i];
		}
		
		
		
		avg = total/studMark.length;
		
		System.out.println("The total sum of studentmark is: " + total);
		System.out.println("The avreage mark of the student: " + avg);
	}

}
