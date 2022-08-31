package Array;

import java.util.Scanner;


//-Write a method called readIntegers() with a parameter called count that represents
//how many integers the user needs to enter.
//-The method needs to read from the console until all the numbers are entered, and then
//return an array containing the numbers entered.
//-Write a method findMin() with the array as a parameter. The method needs to return
//the minimum value in the array.
//-In the main() method read the count from the console and call the method
//readIntegers() with the count parameter.
//-Then call the findMin() method passing the array returned from the call to the
//readIntegers() method.
//-Finally, print the minimum element in the array.
//Tips:
//-Assume that the user will only enter numbers, never letters
//-For simplicity, create a Scanner as a static field to help with data input
//-Create a new console project with the name ‘MinElementChallenge’
//


public class challange2 {


		public static void main(String[] args) {
			// TODO Auto-generated method stub
		//array size
			Scanner in = new Scanner(System.in);
			System.out.println("How many number do you have?");
			
		
			int[] minArray = new int[in.nextInt()];
			int min =Integer.MAX_VALUE;
			int max =Integer.MIN_VALUE;
		
		//enter elements	
			System.out.println("Enter your numbers: ");
		
		//find min number
			for(int i=0; i<minArray.length;i++) {
				minArray[i] = in.nextInt();
				min= Math.min(min, minArray[i]);
							
			}
			
		
			System.out.println("Your minimum number is "+min);

	}

}
