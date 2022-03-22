package p3;

import java.util.Arrays;

public class RemovSpecificElement {

	public static void main(String[] args) {

int [] arr={55,54,34,5,234,57,67};

int removeindex=2;

for (int i=removeindex;i<arr.length-1;i++){
	
	arr[i]=arr[i+1];
	
	
}
		
System.out.println(Arrays.toString(arr));
		

	}

}
