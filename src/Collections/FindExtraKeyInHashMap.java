package Collections;

import java.util.HashMap;
import java.util.HashSet;

public class FindExtraKeyInHashMap {

    public static void main(String[] args) {

        HashMap<Integer,String> map1=new HashMap<>();
        map1.put(1,"Rahul");
        map1.put(2,"Rahul A");
        map1.put(3,"Rahul B");
        map1.put(4,"Rahul C");


        HashMap<Integer,String> map2=new HashMap<>();
        map2.put(1,"Rahul");
        map2.put(2,"Rahul A");
        map2.put(3,"Rahul B");
        map2.put(4,"Rahul C");
        map2.put(5,"Rohit C");
        map2.put(6,"Rohit C");
        map2.put(10,"Rohit C");
        map2.put(7,"Rohit C");

        HashSet set=new HashSet(map1.keySet());

        set.addAll(map2.keySet());

        System.out.println(set);

       // set.removeAll(map1.keySet());

       // System.out.println(set);

        set.retainAll(map1.keySet());

        System.out.println(set);








    }
}
