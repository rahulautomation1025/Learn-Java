package practise2;

public class Palindrome {

	public static void main(String[] args) {
		int temp;
		
		int n=122,sum=0,r;
		
		temp=n;
		
		while(n>0){
			r=n%10;
			
			sum=(sum*10)+r;
			
			n=n/10;
			
			
		}
		
		if (temp==sum){
			System.out.println("Yes");
		}

		else{
			
			System.out.println("NO");
		}
	}

}
