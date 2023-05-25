/*
 * Yulia Flenova
 * Mat 12, 2017
 * Version 1.0
 * 1D Array activity 
 */
import java.util.Scanner; 
public class array1 {

	public static void main(String[] args) {
				
		int [] list1 = new int [20]; 
		int [] list2 = new int [20];
	
	
		for (int x = 0; x<list1.length; x++){
	     list1 [x] = 0; //changing list1 with 0
		}
	
		 for (int x = 0; x<list2.length; x++){
			 list2 [x] = -1;  //changing list2 with 0
		 }
		 
		 for (int x  = 0; x < list2.length; x++) {
		  list2[x]  =  (int)(Math.random () * 100 + 1); //Change array list2 with 20 random integers between 1 and 100
		 }
		 
		 for (int x = 0; x < list2.length; x++) {
		 list1[x] = list2[x]*x; // Multiply each element in list2 by its element index number and place the value in array list1.  
		 }
		
		 for (int x = 1; x < list2.length; x=x + 2) {
			 list2 [x]=0;
		 }
		 
		 for (int x = 0; x < list1.length; x++) {
			 list1 [x] =  list2 [x] + list1 [x]; //Add list1 and list2 placing the value in list1. 

		 }
		 
		 int total=0; 
		 int avarage;
		 for (int x = 0; x < list1.length; x++) {
			total= total + list1[x];
			System.out.println(list1[x]);
		 }
		 avarage= total/list1.length;
		System.out.println(avarage);

		int number;
		 Scanner input = new Scanner(System.in);  
		  System.out.println("Enter number between 1 and 1000: ");
	       number=input.nextInt(); 

	       Boolean found = false;
	       for (int x = 0; x < list1.length; x++) {
		       if (number == list1[x]) {
		    	   System.out.println ("Your number " + number + " was found in row " + x );
		    	   found = true;
		       }
	       }
	       if (found == false) {
	    	   System.out.println("Number " + number + " was not found");
	       }
	      
	}

}
