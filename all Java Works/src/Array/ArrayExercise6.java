package Array;

public class ArrayExercise6 {
	public static void main (String[]arg) {
		
		double studMark [][] = { 
				               {76,96,88,98.5,99,66}, // row 3 colum 10
				               {73,56,88,78.5,79,66,88,56,},
				               {79,59,88,90.5,99,66,88,56,77,69}
				               };
		
		System.out.print(studMark.length);
		
		//calculate average
		//System.out.println(getAverage());
		double Avg;
		double sum= 0;
		
		for(int i = 0; i <studMark.length; i++) {
			
			for(int k =0; k<studMark[i].length; k++) {
				//System.out.print(studMark[i][k] + " ");	
				sum += studMark[i][k];
				
			}
			System.out.println();
		}
		
		Avg = sum/studMark.length;
	       System.out.println("The total sum of studentmark is: " + sum);
	       System.out.println("The avreage mark of the student: " + Avg);
	        
	}
	

}
