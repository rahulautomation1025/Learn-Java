package practise2;

import java.util.Arrays;

public class RemoveDuplicateElement {
	
	public static void uniquearray(int []myarray){
		
		int uniqueelementlenght=myarray.length;		
		
		for (int i=0;i<uniqueelementlenght;i++){			
			
			for (int j=i+1;j<uniqueelementlenght;j++){				
				
				if (myarray[i]==myarray[j])
					
				{
					myarray[j]=myarray[uniqueelementlenght-1];
					
					uniqueelementlenght--;
					j--;				
					
				}
				
			}			
		}
			int [] array1=Arrays.copyOf(myarray, uniqueelementlenght);
			
			for (int i=0;i<array1.length;i++)
				
			{
				System.out.println(array1[i]);	
				
					
			
				
			}
			System.out.println();
		}
		
		public static void main(String[] args) {
		
		
		uniquearray(new int[]{12,54,55,66,44,44,66,77});
		
		

	}

}
