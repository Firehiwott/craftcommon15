package PolymorphismInJava;

public class Overriding1 {

	int i,j;
	Overriding1(int a, int b){
		i = a;
		j = b;
	}
	
	void shows() {
		System.out.println(i + " " +j);
		
	}
	class Overriding2 extends Overriding1{
		int k ;
		Overriding2(int a, int b, int c){
			super(a,b);
			k =c;
		}
		
		void show() {
			System.out.println(k);
		}
		class Override{
			public static void main() {
		//		Overriding2 subob = new Overriding2(1,2,3);
		//		subob.show();
			}
		}
	}
	
	
}
