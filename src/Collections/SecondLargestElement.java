package Collections;

import java.util.Arrays;

public class SecondLargestElement {

    public static void main(String[] args) {

        int arr[]={44,44,22,55,53,4};
        Arrays.sort(arr);

        for(int i=arr.length-2;i>=0;i++){

            System.out.println(arr[i]);
            break;


        }


    }

}
