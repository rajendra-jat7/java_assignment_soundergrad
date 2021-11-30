package Basic.java;

import java.util.Scanner;

public class Count_Letters {

	public static void main(String[] args) {    
		Scanner sc = new Scanner(System.in);
    	String str=sc.nextLine();  
        int count = 0;    
        
        try {
        for(int i = 0; i < str.length(); i++) {    
            if(str.charAt(i) != ' ')    
                count++;    
        }    
              
        System.out.println("Total number of characters in a string: " + count);    
    } 
        finally {
        	System.out.println("End!!!!");
        }
  }
}     