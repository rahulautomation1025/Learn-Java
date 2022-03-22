package String.programs;

import java.util.*;

public class DuplicateWordInString {

    public static void main(String[] args) {

        String s="The Quick fox Brown brown Fox";

        String input=s.toLowerCase();

        String[] str=input.split(" ");


        List<String> duplicate=new ArrayList<>();

        Set<String> unique=new HashSet<>();

        for(String val:str){

            if(!unique.add(val)){

                duplicate.add(val);

            }

        }

        System.out.println("Duplicate Words:  "+duplicate);

    }


}
