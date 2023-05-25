/*
 * @A simple program to show how to format currency, decimals and percentage
 * @author: Yulia Flenova 
 * @date: Feb 17
 * @version 1.00 
 */

import java.text.*;
import java.text.NumberFormat;

public class FormatNumber { //being class 
  public static void main (String[] args){ //begin main
    
    //Decimal format by rounding up
    NumberFormat nf = NumberFormat.getInstance();
    nf.setMaximumFractionDigits(0);  //show 0 decimal place
    System.out.println ("2000.2312 formatted to 0 decimal spaces is " + nf.format(2000.2312));
    nf.setMaximumFractionDigits(1);  //show 1 decimal place
    System.out.println ("2000.2312 formatted to 1 decimal spaces is " + nf.format(2000.2312));
    nf.setMaximumFractionDigits(2);  //show 2 decimal place
    System.out.println ("2000.2312 formatted to 2 decimal spaces is " + nf.format(2000.2312));
    System.out.println(""); 
    System.out.println(""); 
    
second();
third();
        
  }//end main
  public static void second() { //being second 
	  // Percent format 
	    NumberFormat nfp = NumberFormat.getPercentInstance(); 
	    nfp.setMaximumFractionDigits(0);  //show o decimal place 
	    System.out.println ("0.2312  formatted to 0 decimal spaces is " + nfp.format(0.2312));
	    nfp.setMaximumFractionDigits(1);  // show 1 decimal place
	    System.out.println ("0.2312  formatted to 1 decimal spaces is " + nfp.format(0.2312));
	    nfp.setMaximumFractionDigits(2);  // show 2 decimal place
	    System.out.println ("0.2312  formatted to 2 decimal spaces is " + nfp.format(0.2312));
	    System.out.println(""); 
	    System.out.println(""); 
  } //end second 

  
  public static void third(){ //begin third 
	  NumberFormat nfc = NumberFormat.getCurrencyInstance();
	    nfc.setMaximumFractionDigits(0);     //show 0 decimal place     
	    System.out.println ("2000.2312  formatted to 0 decimal spaces is " + nfc.format(2000.2312));
	    nfc.setMaximumFractionDigits(1);        // show 1 decimal place 
	    System.out.println ("2000.2312  formatted to 1 decimal spaces is " + nfc.format(2000.2312));
	    nfc.setMaximumFractionDigits(2);         // show 2 decimal place
	    System.out.println ("2000.2312  formatted to 2 decimal spaces is " + nfc.format(2000.2312));
	    
	  
  }// end third 
}//end class