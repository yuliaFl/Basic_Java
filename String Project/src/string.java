import java.util.Scanner; 
public class string { //begin class

	public static void main(String[] args) { //begin main
		/*
	 * String street="Dixie Rd.";
				String address="5253";
				System.out.println(street.charAt(2)); //  x 
				System.out.println(street.toUpperCase()); //DIXIE RD.
				System.out.println(street.concat(address)); //Dixie Rd. 5253
				System.out.println(address.concat(street)); //5253Dixie Rd.
				System.out.println(address.replace('5','8'));//8253
				System.out.println(street.substring(6)); //Rd.
				System.out.println(street.substring(4,7)); //e R
				System.out.println(address.indexOf("25"));//1
				System.out.println(address.indexOf("23")); //-1
				System.out.println(address.equals("5253")); //true
				System.out.println(address.length()); //4
				System.out.print(street);
				
				String step1=street.substring(2); //xie Rd
				String step2=step1.substring(0,4);//ieRd
				String step3=step2.replace('i','a'); //aeRd
				String step4=step3.toUpperCase(); //AERD	
		*/
		first();
		second();
		third();
	    fourth();
		
	}
	public static void first() {
		//1.
		String name= "Sir William Mulock Secondary School";
		System.out.println("The lenght of this string is " + name.length());
		System.out.println("The substring of the variable text starting at position 12 through 18 is " +  name.substring(12,18));
		System.out.println("The character of the string  located at position 20 is " + name.charAt(20) );
		System.out.println("The string in Upper Case is " + name.toUpperCase());
		System.out.println("The string in Lower Case is  " + name.toLowerCase()) ;
		System.out.println("The position where the word School starts in the string is 29 " );

		System.out.println("");
		System.out.println("");
		
		//2.
		String text1 ="";
		String text2 ="";
		Scanner input = new Scanner(System.in);  
	       System.out.println("Type a word lowecase: ");
	       text1=input.nextLine(); 
	       System.out.println("Type the same word uppercase: ");
	       text2 =input.nextLine(); 
	       System.out.println(" ");
	       
	     
	       System.out.println("The text contained in both values is the same "+ text1.equals(text2));
	       System.out.println("The text contained in both values is the same "+ text1.equalsIgnoreCase(text2));
	       System.out.println("They are different beacuse one is upper case and the other is lowecase");
		   System.out.println("");
	       System.out.println("");
	       
	       
		}// end main 
	       public static void second () { //begin second
	    //3.   
	       String humString= "";
	       String humChar = "";
	       Scanner input= new Scanner(System.in);  
	       System.out.println("Type a word: ");
	       humString=input.nextLine(); 
	       System.out.println("Type a letter: ");
	       humChar =input.nextLine(); 
	       System.out.println(" ");
	       System.out.println("The word you choose is " + humString + " the letter you choose is " + humChar);
	       System.out.println("The first occurrence of " + humChar + " and " + humString.indexOf(humChar)); //first occurrence or the letter choosan 
	       System.out.println("The last occurrence of " + humChar + " and " + humString.lastIndexOf(humChar)); //last occurrence of the letter choosen 
	       System.out.print("");
	       
	       }
	       
	       public static void third () {
	     //4
		       String input1 = "";
		       String input2 = ""; 
		       Scanner input= new Scanner(System.in);  
		       System.out.println("Type a word: ");
		       input1=input.nextLine(); 
		       System.out.println("Type another word: ");
		       input2 =input.nextLine(); 
		       System.out.println(" ");
		       
		       System.out.println("The two words you choose are " + input1 + " and " + input2);
		       System.out.println(input2.substring(0, input2.length() - 1) + input1.substring(1, input1.length()) ); //take out last character of second input, take out first character of first input
	       }
	       
	       public static void fourth () {
	    //5
	    	   String inputString = "";
	    	   Scanner input= new Scanner(System.in); 
	           System.out.println("Type in words, each wrod through a '-' ");
		       inputString = input.nextLine();
		       
		       if (inputString.length() == 0) {
		    	   System.out.println("Less then 50 chracters add more");
		       }
		       if (inputString.length() < 50) {
		    	 System.out.println("ERROR nothing found");
		    	   return;
		       }
		       
		       String[] output = inputString.split("\\-");
		       
		       System.out.println("Length found: " + output.length);

				for (int i = 0; i < output.length; i++) {
					System.out.println(output[i]);
				}
	       }	       
	       
	} //end main