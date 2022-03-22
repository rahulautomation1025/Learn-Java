package String.programs;

public class Remove_Leading_Zero {

    public static void main(String[] args) {

        String s="00000123500069000";

        for(int i=0;i<s.length();i++){


            if(s.charAt(i)!='0')
            {

                System.out.print(s.charAt(i));

            }


        }



    }

}
