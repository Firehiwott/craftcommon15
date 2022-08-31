package Abstraction;


abstract class Figure1{
	double dim1, dim2;
	Figure1(double a, double b){ // constructor
		dim1 = a;
		dim2 = b;
	}
	abstract double area();    // abstract method
}

class rectangle extends Figure1{
	rectangle(double a, double b){
		super(a,b);
	}

	@Override
	double area() {
		// TODO Auto-generated method stub
		return dim1*dim2;
	}
}

public class AbstractAreas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		rectangle r = new rectangle(10,10);
		double returnVal = r.area();
		System.out.println( returnVal);

	}

}
