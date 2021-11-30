package Basic.java;

import java.util.Arrays;
import java.util.Scanner;

class Remove_Duplicate_Char_String
{
    static String removeDuplicate(char str[], int n)
    {
        int index = 0;
 
        for (int i = 0; i < n; i++)
        {
 
            int j;
            for (j = 0; j < i; j++)
            {
                if (str[i] == str[j])
                {
                    break;
                }
            }
 
            if (j == i)
            {
                str[index++] = str[i];
            }
        }
        return String.valueOf(Arrays.copyOf(str, index));
    }
 
    public static void main(String[] args)
    {
    	Scanner sc = new Scanner(System.in);
    	String s=sc.nextLine();
        char str[] = s.toCharArray();
        int n = str.length;
        System.out.println(removeDuplicate(str, n));
    }
}