package p3;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		
		String original,Reverse="";
		
		Scanner in= new Scanner(System.in);
		
		original=in.nextLine();
		
		for (int i=original.length()-1;i>=0;i--)
		{
			Reverse=Reverse+original.charAt(i);
			
					
			
		}
		System.out.println(Reverse);
	}

}
