
public class SwapNumber {

	public static void Swap(){
		
		int a=10,b=20;
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("value of a="+a+"\n"+ "value of B="+b);
		
		
	}
	
	public static void main(String[] args) {
		Swap();
		
		

	}

}
