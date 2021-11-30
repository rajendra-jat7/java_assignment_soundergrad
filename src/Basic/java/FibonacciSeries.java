package Basic.java;

import java.util.Scanner;

class FibonacciSeries{  
public static void main(String args[])  
{    
	Scanner sc=new Scanner(System.in);
	int n = sc.nextInt();
	int firstTerm = sc.nextInt();
	int secondTerm = sc.nextInt();
    
    System.out.println("Fibonacci Series Upto " + n + ": ");
    try {
    while (firstTerm <= n) {
      System.out.print(firstTerm + ", ");

      int nextTerm = firstTerm + secondTerm;
      firstTerm = secondTerm;
      secondTerm = nextTerm;

    }
    }
    finally {
    	System.out.println("End!!!");
    }
  }
}  
