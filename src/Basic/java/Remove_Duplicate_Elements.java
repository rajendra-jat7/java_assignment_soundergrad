package Basic.java;

import java.util.Arrays;
import java.util.Scanner;

public class Remove_Duplicate_Elements {

	public static void main(String[] args) {
		int index=0;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[10];
		int duplicate,flag=0,count;
		int[] anti_dup= new int[n];
		int j;
		System.out.println("Before removing duplicate from the array:");
		for(int i=0;i<n;i++)
		{
		arr[i] = sc.nextInt();
		}
		try {

		for(int i=0;i<n;i++)
		{
		count=0;
		for(j=i+1;j<n;j++)
		{
		if(arr[i]==arr[j])
		{
		count=count+1;
		break;
		}

		} 
		if(count==0)
		{
		anti_dup[index]=arr[i];
		index++;
		}
		}

		for(int i=0;i<index;i++)
		{
		arr[i]=anti_dup[i];
		}
		System.out.println("After removing duplicate from the array");
		for(int i=0;i<index;i++)
		{
		System.out.println(arr[i]);
		}
		}
		finally {
			System.out.println("End !!!!!");
		}
	}
}