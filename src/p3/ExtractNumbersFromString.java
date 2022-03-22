package p3;

import java.util.Scanner;

public class ExtractNumbersFromString {

	public static void main(String[] args) {
		int number=0;
		Scanner in=new Scanner(System.in);
		
		String input=in.nextLine();
		
		System.out.println(input);
		
		for (int i=0;i<input.length();i++){
			
			char c=input.charAt(i);
			
			
			if (Character.isDigit(c)){
				number=Character.getNumericValue(c);
				System.out.print(number);
			}
			
			
		}
}

}
