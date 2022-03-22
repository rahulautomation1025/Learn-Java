package collectionsExamles;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

public class HashMapDemo {

	public static void main(String[] args) {
		
		HashMap m=new HashMap();
		m.put(101, "Rahul");
		m.put(102, "Ishani");
		System.out.println(m);
		
		m.put(101, "Gupta");
		System.out.println(m);
		
	Set s=m.keySet();
	
	System.out.println(s);
	
	Collection c=m.values();
	System.out.println(c);
		
	Set e=m.entrySet();
	System.out.println(e);
	
	
	java.util.Iterator itr=e.iterator();
	
	while(itr.hasNext()){
		
		Map.Entry m1=(Map.Entry) itr.next();
		
		System.out.println(m1.getKey()+""+m1.getValue());
		
		if (m1.getKey().equals(101)){
			
			m1.setValue("sharma");
			
			System.out.println(m1);
			
		}
		
		
	}
	
	System.out.println(m);
	
		
	}

}
