package PolymorphismInJava;

public class OverLoadMethod {

	double width;
	double height;
	double depth;
	
	OverLoadMethod(){        // The  constructor name should be the class name
		width = 30;
		height = 50;
		depth = 3;
		
	}
	
	OverLoadMethod(double w,double h, double d){
		width = w;
		height = h;
		depth = d;
	}
	
	double volume() {
		return width * height * depth;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverLoadMethod b1 = new OverLoadMethod(10,20,30);
		
		System.out.println(b1.volume());
		
		OverLoadMethod b2 = new OverLoadMethod(5,6,7);
		System.out.println(b2.volume());
		

	}

}
