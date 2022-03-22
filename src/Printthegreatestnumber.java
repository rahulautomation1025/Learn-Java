import java.util.Scanner;


public class Printthegreatestnumber {

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		
		System.out.println("Enter number1");
		int number1=in.nextInt();
		System.out.println("Enter number2");
		int number2=in.nextInt();
		System.out.println("Enter number3");
		int number3=in.nextInt();
		
if (number1>number2)
	if (number1>number3)
	{
		System.out.println("Large Number is " + number1);
		
	}


if (number2>number1)
if (number2>number3)
{
	System.out.println("Large Number is " + number2);
	
}


if (number3>number2)
if (number3>number1)
{
	System.out.println("Large Number is " + number3);
	
}
		
		
		
	}

}
