package Basic.java;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Sort_List_Items {
	public static void main(String[] args)   
	{  
	List<String> slist = Arrays.asList("Tanu", "Kamal", "Suman", "Lucky", "Bunty", "Amit");  
	List<String> sortedList = slist.stream().sorted().collect(Collectors.toList());     
	sortedList.forEach(System.out::println);  
	}  

}
