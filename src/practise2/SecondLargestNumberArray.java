package practise2;

public class SecondLargestNumberArray {

	public static void main(String[] args) {
		
		int [] myarray={32,55,544,4545,900,222,224,23};
		
		int len=myarray.length;
		
		int max=myarray[0];
		int second_max=myarray[0];
		
		
		for (int i=0;i<len;i++)
			
		{
			if (myarray[i]>max){
				
				second_max=max;
				max=myarray[i];
			}
				
				else if(myarray[i]>second_max)
				{
					second_max=myarray[i];
					
				}
				
				
			}
			
		System.out.println(second_max);
			
			
			
		}
		
		
		
	}


