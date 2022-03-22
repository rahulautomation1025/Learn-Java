package practise2;

import java.util.Arrays;

public class MaxValueArray {

	public static void main(String[] args) {
		
		int [] myaray={54,66,44,343,33,34,43,434,54};
		
		Arrays.sort(myaray);
		
		System.out.println(Arrays.toString(myaray));
		
		System.out.println(myaray[myaray.length-1]);

	}

}
