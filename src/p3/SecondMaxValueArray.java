package p3;

public class SecondMaxValueArray {

	public static void main(String[] args) {
		
		int[] arr={22,76,33};
		
		
		int max=arr[0];
		
		int Second_max=arr[0];
		
		for (int i=0;i<arr.length;i++){
			
			if (arr[i]>max){
				
				Second_max=max;
				max=arr[i];
				
				
				
				
			}
			
			else if(arr[i]>Second_max){
				
				Second_max=arr[i];
				
			}
			
			
		}
		
		System.out.println(Second_max);
		
		
		
		
	}

}
