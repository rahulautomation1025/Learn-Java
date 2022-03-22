package Collections.List;

import java.util.ArrayList;
import java.util.List;

public class LearnArrayList {

    public static void main(String[] args) {

        List<String> list=new ArrayList<>();
        list.add("10");
        list.add("12");

        System.out.println(list);
        
        list.add("14");

        System.out.println(list);

        list.add(1,"20");
        System.out.println(list);

        list.remove(1);

        System.out.println(list);

        list.remove(String.valueOf(10));
        System.out.println(list);


        System.out.println(list.get(1));

        list.clear();
        System.out.println(list);






    }

}
