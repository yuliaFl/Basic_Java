/*
 * Yulia Flenova
 * March 8 2017
 * Version 1.0
 * math assignment, working with variables or operators  
 */
public class math { //begin class

	public static void main(String[] args) { // begin main
		// TODO Auto-generated method stub
		int i = 7;
		int j = -9;
	    double x = 72.3;
		double y = 0.34;
		System.out.println("The 3 to the power of 2 is "+  Math.pow(3,2));
		System.out.println("When you round down 72.3 you get " + (Math.floor(x)));
		System.out.println("When you round down 0.34 you get " + (Math.floor(y)));
		System.out.println("");
		System.out.println("The maximum between 7 and -9, is " + Math.max(i, j));
		System.out.println("The min between 7 and -9, is " + Math.min(i, j));
		System.out.println("");
		System.out.println("The maximum between 72.3 and 0.34, is " + Math.max(x, y));
		System.out.println("The min between 72.3 and 0.34, is " + Math.min(x, y));
		System.out.println("");
		System.out.println("The maximum between 7 and 72.3, is " + Math.max(i, x));
		System.out.println("The min between 7 and 72.3, is " + Math.min(i, x));
		System.out.println("");
		System.out.println("The maximum between 0.34 and -9, is " + Math.max(y, j));
		System.out.println("The min between 0.34 and -9, is " + Math.min(y, j));
		System.out.println("");
		System.out.println(Math.PI);
		System.out.println("The cosine of 45 degrees is " + Math.cos(45));
		System.out.println("The sine of 45 degrees is " + Math.sin(45));
		System.out.println("");
		System.out.println("The number 5 to the power of 2 is " + Math.pow(5, 2));
		System.out.println("");
		System.out.println("The square root of 10 is " + Math.sqrt(10));
		System.out.println("");
		System.out.println("A random number between 0 and 1 is " + Math.random() * 10);
		System.out.println("A random number between 0 and 100 is " + Math.random() * 100);
		System.out.println("A random number between -1000 and 0 is " + Math.random() *-100);
	}//end class
} //end main