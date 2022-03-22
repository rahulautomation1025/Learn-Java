package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

    public static void main(String[] args) {

        ArrayList arr=new ArrayList();
        arr.add("Rahul");
        arr.add("Ishani");
        arr.add("Rivaan");

        System.out.println("Size of array: "+arr.size());

        //ForLoop

        for(int i=0;i<arr.size();i++){
            System.out.print(arr.get(i)+ " ");

        }

        System.out.println();

        //ForEachLoop
        for(Object val:arr){
            System.out.print(val+" ");

        }

        System.out.println();

        //Iterator

        Iterator itr=arr.iterator();
        while (itr.hasNext()){

            System.out.print(itr.next()+ " ");
        }




    }

}
