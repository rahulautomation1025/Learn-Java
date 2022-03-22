package Interview;

public class GreatestNumer {

    public static void main(String[] args) {


        int[] arr ={11,4444,222222,44,222,44};


        int max=arr[0];
        int min=arr[0];


        for(int i=0;i<arr.length;i++){


            if(max<arr[i]){


                max=arr[i];

            }

            else if (min>arr[i]){


                min=arr[i];
            }

        }

        System.out.println("Largest Number: "+max);

        System.out.println("Smallest Number: "+min);


    }


}
