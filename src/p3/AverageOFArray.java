package p3;

public class AverageOFArray {

	public static void main(String[] args) {
		
		int [] arr={43,55,44,343,44,23};
		
		int sum=0;
		
		for (int i=0;i<arr.length;i++){
			
			sum=sum+arr[i];
			
		}
		
		double avergae=sum/arr.length;
		
		System.out.println(avergae);
		
		
		

	}

}
