package Basic.java;

public class String_Function {
	public static void main(String args[]){ 
		String s1="hello"; 
		String s2="whatsup"; 
		System.out.println("string length is: "+s1.length());  
		System.out.println("string length is: "+s2.length());
		
		String s3="hello";
		String s4="hello"; 
		String s5="hemlo"; 
		String s6="flag";
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareTo(s3)); 
		System.out.println(s1.compareTo(s4)); 
		
		String s7="hello";
		s1=s1.concat("how are you");
		System.out.println(s1);
		
		String s8=""; 
		String s9="hello"; 
		System.out.println(s1.isEmpty()); 
		System.out.println(s2.isEmpty());
		
		
		String s10="  hello   ";  
		System.out.println(s1+"how are you");
		System.out.println(s1.trim()+"how are you");
		
		}

}
