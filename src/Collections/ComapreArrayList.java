package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ComapreArrayList {

    public static void main(String[] args) {
        ArrayList list=new ArrayList(Arrays.asList("A","B","C"));
        ArrayList list1=new ArrayList(Arrays.asList("D","E","F"));

        Collections.sort(list);
        Collections.sort(list1);

        System.out.println(list.equals(list1));


    }

}
