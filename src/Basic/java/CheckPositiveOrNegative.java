package Basic.java;

import java.util.Scanner;

public class CheckPositiveOrNegative {
	public static void main(String args[]) {

	Scanner sc = new Scanner(System.in); 
	int num = sc.nextInt();
	
	if(num>0)  
	{  
	System.out.println("The number is positive.");  
	}  
	//checks the number is less than 0 or not  
	else if(num<0)  
	{  
	System.out.println("The number is negative.");  
	}  
	//executes when the above two conditions return false  
	else  
	{  
	System.out.println("The number is zero.");  
	}  
  } 
}
