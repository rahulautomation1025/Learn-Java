package p3;

import java.util.Arrays;

public class RemoveDuplicateNumber {

	
	 static void duplicatearray(int [] arr){
		 
		 int lenght=arr.length;
		 for (int i=0;i<lenght;i++){
			 
			 for (int j=i+1;j<lenght;j++){
				 if (arr[i]==arr[j]){
					 
					 arr[j]=arr[lenght-1];
					 lenght --;
					 j--;
					 
				 }
				 
				 
			 }
		 }
		 
			int [] arr1=Arrays.copyOf(arr , lenght);
			
			for(int i=0;i<arr1.length;i++)
			{
				
				System.out.println(arr1[i]);
				
			}
		 
			System.out.println();
	 }
	public static void main(String[] args) {
		
		int [] arr={55,66,33,44,66};
		duplicatearray(arr);
	

	}

}
