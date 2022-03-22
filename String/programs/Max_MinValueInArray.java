package String.programs;

public class Max_MinValueInArray {
    public static void main(String[] args) {

        int[] arr={8,34,5,55,33,44,5};

        int max=arr[0];
        int min=arr[0];

        for(int i =0;i<arr.length;i++){

            if(arr[i]>max){

               max=arr[i];

            }
            else if(arr[i]<min)
                min = arr[i];

        }

        System.out.println(max);

        System.out.println(min);

    }





}
