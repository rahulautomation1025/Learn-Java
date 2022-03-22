package String.practice;

public class demo {

    public static void reverse(String s) {

        for (int i = s.length() - 1; i >= 0; i--) {

            System.out.print(s.charAt(i));


        }


    }

    public static void countChar(String s){
        int count=0;

        for(int i=0;i<s.length();i++){

            if(s.charAt(i)!=' '){

                count=count+1;


            }

        }

        System.out.println(count);


    }


    public static void main(String[] args) {


        //reverse("automation");

        countChar("Geeks of Geeks");

}
    }




