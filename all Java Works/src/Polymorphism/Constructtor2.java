package Polymorphism;

public class Constructtor2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Constructor mybox = new Constructor();
		// mybox.depth = 20;
		
		
		Constructor mybox2 =mybox;
		mybox2.width = 5;
		mybox2.height = 8;
		mybox2.depth = 10;
		
		System.out.println("Volume of box is:" + mybox.volume() );

	}

}
