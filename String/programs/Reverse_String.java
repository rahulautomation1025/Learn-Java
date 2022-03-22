package String.programs;

public class Reverse_String {
    public static void main(String[] args) {

        String str="Automation";


        char[] arr=str.toCharArray();

        for(int i=str.length()-1;i>=0;i--)

        {

            System.out.print(str.charAt(i));

        }



    }



}
