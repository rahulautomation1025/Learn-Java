package String.programs;

import java.util.HashMap;
import java.util.Locale;

public class CountWordInString {

    public static void main(String[] args) {


        String s="This this is is done by Saket Saket Saket";

        String input=s.toLowerCase(Locale.ROOT);

        String[] arr=input.split(" ");

        HashMap<String,Integer>map=new HashMap<>();

        for(String temp:arr)

        {
            if(map.containsKey(temp)){

                int count=map.get(temp);
                map.put(temp,count+1);

            }
            else map.put(temp, 1);
        }

        System.out.println(map);





    }


}
