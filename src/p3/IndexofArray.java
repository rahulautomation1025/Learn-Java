package p3;

public class IndexofArray {
	
	public static int findindex(int []arr,int t)
	{
		
		int n=0;
		
		while(n<arr.length){
			
			if (arr[n]==t) return n;
			else n++;
			
		}
		return -1;
		
	
	}

	public static void main(String[] args) {
		
		int [] arr={12,43,54,55,66,75};
		
		int index=findindex(arr, 12);
		
		System.out.println(index);
		
		
		
		
		
	}

}
