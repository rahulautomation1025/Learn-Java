package practise2;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		
		String original="",reversestring="";
		
		Scanner in=new Scanner(System.in);
		
		System.out.println("Enter String");
		
		original=in.nextLine();
		
		int len=original.length();
		
		for (int i=len-1;i>=0;i--){
			
			reversestring=reversestring+ original.charAt(i);
			
			
		}
		
		System.out.println(reversestring);
		
		
		
		
		
		

	}

}
