package Collection.Learnprogramming.SetDemo;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetDemo {

    public static void main(String[] args){


        Set<Integer> first= new HashSet<>();
        first.addAll(Arrays.asList(new Integer[]{1,3,5,7,9}));


        Set<Integer> second= new HashSet<>();
        second.addAll(Arrays.asList(new Integer[]{0,1,3,2,4,6,8,10}));

        // Difference

        Set<Integer> diff=new HashSet<>(first);
        diff.removeAll(second);
        System.out.println(diff);

        //Union
        Set<Integer> union=new HashSet<>(first);
        union.addAll(second);
        System.out.println("###########");

        System.out.println(union);


        //Intersection

        Set<Integer> Intersection=new HashSet<>(first);
        Intersection.retainAll(second);
        System.out.println("###########");

        System.out.println(Intersection);



    }

}
