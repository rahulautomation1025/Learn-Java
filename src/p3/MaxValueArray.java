package p3;

import java.util.Arrays;

public class MaxValueArray {

	public static void main(String[] args) {
		
		int [] arr={12,43,44,220,22,34};
		
		Arrays.sort(arr);
		
		int max=0;
		
		max=arr[arr.length-1];
		
		System.out.println(max);
	}

}
