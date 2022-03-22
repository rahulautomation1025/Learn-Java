package String.programs;

public class Remove_WhiteSpace_String {

    public static void main(String[] args) {

        String str="Remove white Space";


        str=str.replaceAll("\\s+","");

        System.out.println(str);


    }


}
