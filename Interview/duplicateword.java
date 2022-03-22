package Interview;

import java.lang.reflect.Array;

public class duplicateword
{

    public static void main(String[] args) {

        String s="rahul rahul ishani rivaan";

        String[] arr=s.split(" ");

        for(int i=0;i<arr.length;i++){

            for(int j=i+1;j<arr.length;j++){

                if(arr[i].equals(arr[j]))
                {

                    System.out.println(arr[j]);
                    break;

                }

            }


        }



    }


}
