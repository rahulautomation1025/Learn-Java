package practise2;

public class FindIndexArray {
	
	public static int finindex(int [] myarray,int t){
		
		//if (myarray == null) return -1;
        int len = myarray.length;
        int i = 0;
        while (i < len) {
            if (myarray[i] == t) return i;
            else i=i+1;
        }
        return -1;
		
	
		
	}
	

	public static void main(String[] args) {
		
		int []myarray={12,43,55,33,45};
		
		System.out.println(finindex(myarray, 34));
		
		
		

	}

}
