package StringHandling;

public class StringHandling1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		String str1 = "james";
//		//str1.concat("Bond");  // str1 = James Bond
//		System.out.println(str1.concat(" Bond "));
//		
//		System.out.println(str1);
		
//		//▪Strings can also be created using the new keyword.
//		String str1 = "This ia a new string";
//		String str2 = new String(" This is a new String");
		
//		String str1 = "I " + "like "+"Java ";
//		System.out.println(str1.concat("Programming "));
//		
//		int len = str1.length();
//		System.out.println("length of string is:" +len);
//		
//		String  str2 = "This is Hanif";
//		System.out.println(str2.charAt(3));
		
		
		// String comparison –equals method
//		String str1 = "Ismail";
//		String str2 = "Ismael";
//		if(str1.equals(str2)){    // if we need to equal we can str1.equalsIgnoreCase(str2)
//			System.out.println("The two strings are EQUAL");
//			}
//		else { System.out.println("The two strings are NOT equal");
//		}
		
		// Check if a string contains only digits
//		String str1 = "567867A56";
//		char ch; 
//		for(int i = 0;i<str1.length();i++){
//			ch = str1.charAt(i);
//			System.out.println(ch);
//			if(Character.isDigit(ch)){continue;  // to check only the letter we can see Character.isLetter
//			}
//			else{
//				System.out.println("String contains NON digits");
//				}
//			}
		
		// Locate a substring within a String -indexOf
		
//		String str1  =  "Today is holiday. Tomorrow is working day"; // string
//		int  loc = str1.indexOf("holiday");
//		System.out.println("Position of holiday:" + loc);
//		
//		String sub1 = str1.substring(9,16);
//		System.out.println(sub1);
		
		
//		//▪Use the split() method  to split the words in a string.
//		String str1 = "Today is holiday tomorrow is working day";
//		String[] ar1 = str1.split(" ");
//		
//		for(String elt: ar1) {
//			System.out.println(elt);
//		}
		
		
		// String replace
//		String str2 = "Hello";
//		String str3 = str2.replace('l','w');  // replace method
//		System.out.println(str3);
//		
	
		//String trim
//		String str1 = "          hello         ";   // trim method
//		System.out.println(str1);
//		System.out.println(str1.trim());
		
		
		//String –uppercase /lowercase
		String str = "James";
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
		
		
      // StringBuffer
		StringBuffer str1 = new StringBuffer("Hello ");
		str1.insert(5, " World");
		
		System.out.println(str1);
		
	

	}

}
