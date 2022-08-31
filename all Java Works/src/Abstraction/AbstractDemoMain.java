package Abstraction;


abstract class Figure{
	abstract void calcArea(double length);
}

// we need to inherit
class FigureImp extends Figure{

	@Override
	void calcArea(double length) {
		// TODO Auto-generated method stub
		
		double result = length * length;
		System.out.println(" Area of rectangle is:" + result);
		
		
	}
	
}

public class AbstractDemoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Figure f = new FigureImp();
		f.calcArea(10);

	}

}
