package Collections;

import com.sun.source.tree.WhileLoopTree;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapDemo {

    public static void main(String[] args) {


        HashMap<String,String> capital=new HashMap<String,String>();
        capital.put("India","New Delhi");
        capital.put("US","Washington DC");
        capital.put("UK","London");
        //capital.put("UK",null);
        capital.put(null,"LA");
        capital.put("UK1",null);
        capital.put(null,"Berlin");

        //Using KeySet()
       /*  Iterator itr=capital.keySet().iterator();


     while (itr.hasNext()){

          String key= (String) itr.next();

          System.out.println("Key is "+ key + " " + "Value is " + capital.get(key));

      }*/

      //Using EntrySet()
        Iterator itr=capital.entrySet().iterator();
        while (itr.hasNext())
        {
            Map.Entry<String,String> Entry= (Map.Entry<String, String>) itr.next();

            System.out.println(Entry.getKey()+" : "+Entry.getValue());


        }


    }


}
