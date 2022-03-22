package Collection.Learnprogramming.LinkedListDemo;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {


    public static void main(String[] args){


        LinkedList<String>list1=new LinkedList<>();
        System.out.println(list1.size());

        list1.add("Tom");
        list1.add("Rick");

        System.out.println(list1.size());
        Iterator itr=list1.iterator();

        while (itr.hasNext())
        {
            System.out.println(itr.next());

        }

        list1.addFirst("Rahul");
        list1.addLast("Rohit");

        for(String S:list1)
        {

            System.out.println(S);

        }

        System.out.println("############");
        //Sort

        Collections.sort(list1);
        System.out.println(list1);

        System.out.println("#################");

        //Reverse the lisnked list

        Iterator val=list1.descendingIterator();

        for(String A:list1)
        {
            System.out.println(A);
        }

    }
}
