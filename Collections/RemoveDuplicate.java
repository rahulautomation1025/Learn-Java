package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicate {

    public static void main(String[] args) {

        ArrayList list=new ArrayList(Arrays.asList(1,3,4,5,6,7,3,5,2,3,5,2,1,3,5,6,3,2,3,4,5));

        HashSet set=new HashSet(list);

        System.out.println(set);


    }
}
