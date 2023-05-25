/*
 * Yulia Flenova 
 * Version 1.0
 * March 3, 2017
 * working with numbers 
*/
public class varassignment { //begin class

	public static void main(String[] args) { //begin main 
		// TODO Auto-generated method stub
int width = 10;
int length =20; 
int area= width*length;
int perimeter =2*width + 2*length; 
System.out.println("The length of your rectangle is: " + length + "cm");
System.out.println("The width of your recatangle is " + width + "cm");
System.out.println("");
System.out.print("The perimeter is 2* length + 2* width \t");
System.out.print("P=" + perimeter +"cm \n"); 
System.out.print( "The Area is lenght + width \t");
System.out.print("A=" + area + "cm \n" );

	float radius= 5;
	double pie= Math.PI;
	double perimeter2 = 2 * Math.PI * radius; 
	double area2= pie * radius *2; 
	System.out.println("");
	System.out.println("The radius of the circle is " + radius + "cm");
	System.out.println("The perimiter of the circle is " + perimeter2 + "cm");
	System.out.println("The area is "+ area2 + "cm");
	System.out.println(""); 
	
	int y=5 ;
	float formula= y * 9/5 + 32 ;
	System.out.println("0 Celsius degree in Fahrenheit is equals to 32 degrees");
	System.out.println("5 Celsius degree in Fahrenheit is equals to "+ formula + " degrees");
	System.out.println ("");
	
	String name = "Yulia"; 
	byte eng = 81;
	byte math = 85;
	byte cham = 78; 
	byte comp = 99; 
	float avrge = (eng + math + cham + comp) / 4; 
	System.out.println("Hello my name is " + name);
	System.out.println("My english mark is "+ eng );
	System.out.println("My math mark is " + math);
	System.out.println("My chamestry mark is " + cham) ;
	System.out.println("My computer science mark is " + comp);
	}//end main 
} //end class