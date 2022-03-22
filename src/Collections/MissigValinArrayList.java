package Collections;

import java.util.ArrayList;
import java.util.Arrays;

public class MissigValinArrayList {
    public static void main(String[] args) {

        ArrayList list=new ArrayList(Arrays.asList(1,3,4,6));

        ArrayList list1=new ArrayList(Arrays.asList(1,3,6));

        list.removeAll(list1);

        System.out.println(list);

        //common values

        ArrayList list2=new ArrayList(Arrays.asList(1,3,4,6));

        ArrayList list3=new ArrayList(Arrays.asList(1,3,6));

        list2.retainAll(list3)  ;

        System.out.println(list2);




    }

}
