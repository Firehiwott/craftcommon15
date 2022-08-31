package PolymorphismInJava;
  
 // method Overloaded
public class AreaCalc {
	
	public double calcArea(int length,int width) {
		double rectArea = length * width;
		return rectArea;
	}
	
	
	public double calcArea(int radius) {
		
		double rectArea = 3.14*radius*radius;
		return rectArea;
	}
	
	public static void main(String[]args) {
		AreaCalc ar = new AreaCalc();
		double rarea = ar.calcArea(20,10);
		System.out.println("Area of rectangle:" + rarea);
		
		double carea = ar.calcArea(10);
		System.out.println("Area of circle:" + carea);
		
	}

}
