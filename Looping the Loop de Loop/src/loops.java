/*
 * Yulia Flenova 
 * Version 1.0 
 * April 12, 2017
 * Loop exersice 
 */

import java.util.Random;

import java.util.Scanner; 
public class loops { //begin class

	public static void main(String[] args) { //begin main
		// TODO Auto-generated method stub
		
		/*                       will run      //activity 
for (int i=0;i<10;i++)			    10 
for (int i=1;i<10;i++)				9
for (int i=0;i<100;i+=2)			50
for (int i=1;i<50;i+=2)		        24 
for (int i=1000;i>10;i--)			990
for (int i=5;i<150;i+=5)			29
		*/
		
		int a;
		for  (a=0; a <=100 ; a+=2) { 
		  System.out.print(a + " ");
		} 
         System.out.println("");
         
		int b;
		for  (b=100; b >=0 ; b-=2) { 
		  System.out.print(b + " ");
		} 
		
	       System.out.println("");
	      
	       
	       //Variables
	  int start;
	  int end;
	     System.out.println(" ");
	       Scanner input = new Scanner(System.in);  
	       System.out.println("Enter start number: ");
	       start=input.nextInt();  // whatever the human puts in is start
	       System.out.println("Enter end number: "); 
	       end=input.nextInt(); // what ever the human puts in is the end 
	       System.out.println(" ");
	     
	       int c = start;  // c will represent the start variable (what the human put in
	      
	   for (c= start; c<=end; c++)
	   //System.out.println("Number \t\t\t\t Square \t\t\t\t Cube");
	   System.out.println(c + "\t\t\t\t" +  Math.sqrt(c) + "\t\t\t\t" +  Math.pow(c,2));
	   second ();
	   
	       } //end main
	
    public static void second (){ //begin second main

    	Random rand = new Random(); 
    	int numrnd= rand.nextInt(100) + 1; //random number between 1 and 100
    
		  Scanner input = new Scanner(System.in); 
		     System.out.println(" ");
	      System.out.println("What is your guess? ");
	       int num = input.nextInt(); 
	       
	       while  (!(num == numrnd)) {  //while the number is not equal to random number 
	    	   if (num > numrnd){  // if number chosen by human is bigger 
	    		   System.out.println("Choose a smaller number"); // print this 
	    		   num = input.nextInt(); // human chooses next number 
	    	   }else if (num < numrnd) { // if is smaller then random number 
	    		       System.out.println("Choose a bigger number");  // print this 
	    		       num = input.nextInt(); //choose another number 
	    		   }
	       }
	    	   System.out.println("You guessed it right, it was " + numrnd); // if the number chosen by the human is equal to the random print this
	  
	       input.close(); 
	      
		
	} //end second main
} //end class