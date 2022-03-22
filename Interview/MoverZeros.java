package Interview;

import java.util.Arrays;

public class MoverZeros {

    public static void main(String[] args) {
        int[] arr = { 1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9};
        demo(arr);
        System.out.println(Arrays.toString(arr));

    }


    private static void demo(int[] arr){


        int countzero=0;
        for(int i=0;i<arr.length;i++){

            if(arr[i]!=0){


                arr[countzero++]=arr[i];

            }



        }

        while(countzero<arr.length){

            arr[countzero++]=0;


        }





    }

}
