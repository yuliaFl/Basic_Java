/*
 *Yulia Flenova
 *Feb 14, 2017 
 *version 1.0
 *this is java  22program that will contain three parts one for data types in Java, greetings in different languages, one for score board record
 */
public class JavaTypes { //open class

	public static void main(String[] args) { // begining of "data types in JAVA"
		// TODO Auto-generated method stub
		System.out.println("**********************************************************************************************************");
		System.out.print("***Data types in Java										       ***");
		System.out.println("");
		System.out.println("**********************************************************************************************************");
		System.out.print("Primitive     	");
		System.out.print("Type/Storage Size   ");			
		System.out.print("            Values");
		System.out.println(""); 
		System.out.println("**********************************************************************************************************");
	    System.out.println("boolean    	1 bit     	    	        Logical value of true or false");
	    System.out.println("char            16 bits        	                Stores any of 65436 single chars of UNICODE set");
	    System.out.println("byte            8 bits   	   	        Signed whole numbers –128 to + 127");
	    System.out.println("short           16 bits        	                Signed whole numbers –32768 to +32768");
	
		second();   
		third();
	} //end of data types in JAVA
	
	public static void second () { //beginging of greetings in different languages
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("How to say hello in different langauges");
		System.out.println("Hello, is in English");
		System.out.println("Buenos Dias, is in Spanish");
		System.out.println("Bonjour, is in French ");
		System.out.println("Privet, is in Russian");
	}// end of greetings 
	
	public static void third () { //begining of score board record
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("*************************************************************");
		System.out.print("***Score Board Record                                     ***");
		System.out.println("");
		System.out.println("*************************************************************");
		System.out.print("Team");
		System.out.print("           Wins    	");
		System.out.print("     Losses    	");
		System.out.println("");
		System.out.println("Jaguars        10            5");
		System.out.println("Cheetahs       14            1");
		System.out.println("Panthers       8    	     7");
		System.out.println("Penguins       4    	     11");
	}// end of score board record 
} // end class
