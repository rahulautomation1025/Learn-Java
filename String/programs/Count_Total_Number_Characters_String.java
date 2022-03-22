package String.programs;

public class Count_Total_Number_Characters_String {
    public static void main(String[] args) {
        int count=0;
        String str="welcome to Java World";

        for(int i=0;i<str.length();i++){

            if(str.charAt(i)!=' ')
                count++;


        }

        System.out.println("Numbers of char: "+count);




    }

}
