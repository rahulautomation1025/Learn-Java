package Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ConvertHashMaptoArrayList {

    public static void main(String[] args){


        HashMap<String,Integer> map1=new HashMap<>();
        map1.put("A",100);
        map1.put("B",101);
        map1.put("C",102);
        map1.put("D",103);

        Iterator itr =map1.entrySet().iterator();
        while(itr.hasNext()){

            Map.Entry pairs=(Map.Entry)itr.next();
            System.out.println(pairs.getKey()+" "+ pairs.getValue());


        }

        System.out.println("##################");

        //convert hashmap keys to Javabasics.arraylist
        ArrayList<String> list=new ArrayList<>(map1.keySet());

        for(String I:list)
        {

            System.out.println(I);

        }

        System.out.println("%%%%%%%%%%%%%%%%%%%%");

        //Convert hash value into Arraylist

        ArrayList<Integer> val=new ArrayList<>(map1.values());

        for(Integer A:val) {
            System.out.println(A);
        }




    }
}
