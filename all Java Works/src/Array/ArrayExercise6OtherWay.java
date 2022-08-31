package Array;

public class ArrayExercise6OtherWay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double studMark [][] = { 
	               {76,96,88,98.5,99,66}, // row 3 colum 10
	               {73,56,88,78.5,79,66,88,56,},
	               {79,59,88,90.5,99,66,88,56,77,69}
	               };
		double returnAvg = findAverage(studMark);
		System.out.println("The average mark of the student: " + returnAvg);
		

	}

	private static double findAverage(double[][] studMark) {
		// TODO Auto-generated method stub
		double Avg;
		double sum = 0;
		
		for(int i=0; i<studMark.length; i++) {
			for(int k=0; k<studMark[i].length; k++ ) {
				sum += studMark[i][k];
			}
		}
		
		Avg = sum/studMark.length;
		return Avg;
	}

}
