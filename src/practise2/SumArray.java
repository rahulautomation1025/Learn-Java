package practise2;

public class SumArray {

	public static void main(String[] args) {
		
		int []myarray={12,44,55,33,55};
		int sum=0;
		
		int arraylenght=myarray.length;
		
		for (int i=0;i<arraylenght;i++){
			
			sum=sum+myarray[i];
			
			
		}
		
		
		System.out.println(sum);

	}

}
