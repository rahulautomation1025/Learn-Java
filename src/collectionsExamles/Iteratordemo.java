package collectionsExamles;

import java.util.ArrayList;
import java.util.Iterator;

public class Iteratordemo {

	public static void main(String[] args) {
		
		ArrayList a=new ArrayList();
		
		for (int i=0;i<=10;i++){
			
			a.add(i);
			
		}
		
		System.out.println(a);
		
		Iterator itr=a.iterator();
		
		while(itr.hasNext()){
			
			int l=(Integer) itr.next();
			
			
			
			if (l%2==0)
				
				System.out.println(l);
				
				
			
			
			else
				
				itr.remove();
		
			
			
		}
		
		System.out.println(a);
		
		
		

	}

}
