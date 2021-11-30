package Basic.java;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

public class FileNotFound_Exception {

	public static void main(String[] args) {
	      
	    try {
	          File f=new File("file.txt");   
	            
	        PrintWriter p1=new PrintWriter(new FileWriter(f), true);
	            
	        p1.println("Hello world");
	          p1.close();
	        
	        f.setReadOnly();
	        
	          PrintWriter p2=new PrintWriter(new FileWriter("file.txt"), true);
	        p2.println("Hello World");
	    }
	      
	    catch(Exception ex) {
	        ex.printStackTrace();
	    }
	  }
}