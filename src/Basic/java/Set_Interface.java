package Basic.java;

import java.util.HashSet;
import java.util.Set;

public class Set_Interface {
	public static void main(String[] args)
    {
        Set<String> hash_Set = new HashSet<String>();
 
        hash_Set.add("Geeks");
        hash_Set.add("For");
        hash_Set.add("Geeks");
        hash_Set.add("Example");
        hash_Set.add("Set");
 
        System.out.println(hash_Set);
    }

}
