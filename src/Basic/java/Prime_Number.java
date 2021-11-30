package Basic.java;

import java.util.Scanner;

public class Prime_Number {
	public static void main (String[] args)
	   {		
	       int i =0;
	       int num =0;
	       String  primeNumbers = "";
	       try {
	       Scanner sc=new Scanner(System.in); 
	       int a = sc.nextInt();
	       int b = sc.nextInt();

	       for (i = a; i <= b; i++)         
	       { 		  	  
	          int counter=0; 	  
	          for(num =i; num>=1; num--)
		  {
	             if(i%num==0)
		     {
	 		counter = counter + 1;
		     }
		  }
		  if (counter ==2)
		  {
		     primeNumbers = primeNumbers + i + " ";
		  }	
	       }	
	       System.out.println("Prime numbers from "+a+" to "+b);
	       System.out.println(primeNumbers);
	   }
	       finally {
	    	   System.out.println("End!!!");
	       }
	 }
}
