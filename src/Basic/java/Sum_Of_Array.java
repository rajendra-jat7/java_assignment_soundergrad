package Basic.java;

public class Sum_Of_Array {

	public static void main(String[] args) {
		int[] arr = {5,6,7,8,9,3};
		int sum=0;
		
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
		}
		System.out.println("Sum Of Array: "+sum);

	}

}
