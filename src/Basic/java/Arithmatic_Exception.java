package Basic.java;

import java.util.Scanner;

public class Arithmatic_Exception {
	public static void main(String args[])
	   {
		Scanner sc=new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
	      try{
	         int output=num1/num2;
	         System.out.println ("Result: "+output);
	      }
	      catch(ArithmeticException e){
	         System.out.println ("You Shouldn't divide a number by zero");
	      }
	   }

}
