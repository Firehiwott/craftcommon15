package Array;

public class ArrayExersice5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double[] studMark = {67.5,78,80,95.9,55,77,56,100};
		
		double returnAvg = findAverage(studMark);// exercise 4 and exercise5 is the same diffrent method
		
		System.out.println("The average mark of the student: " + returnAvg);
		
		

	}

	private static double findAverage(double[] mark) {
		// TODO Auto-generated method stub
		double total =0;
		double avg;
    for(int i =0; i<mark.length; i++) {
			total= total + mark[i];
		}
		
		avg = total/mark.length;
		
		return avg;
		
		
	}
	

}
