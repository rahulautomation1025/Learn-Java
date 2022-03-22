package String.programs;

import java.util.HashMap;
import java.util.Locale;

public class CountCharInString {

    public static void main(String[] args) {

        String s="Automation";

        String input=s.toLowerCase(Locale.ROOT);

        char[] char1=input.toCharArray();

        HashMap<Character,Integer> map=new HashMap<>();

        for(Character temp:char1){

            if(map.containsKey(temp)){

                int count=map.get(temp);
                map.put(temp,count+1);

            }
            else map.put(temp, 1);
        }
        System.out.println(map);




    }

}
