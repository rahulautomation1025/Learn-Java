package Collections;

public class NextGreaterElement {

    //https://www.geeksforgeeks.org/next-greater-element/
    public static void main(String[] args) {

        int[] arr={4, 5, 2, 25};
        int n=arr.length;
        demo(arr,n);

    }

    /*For the input array [4, 5, 2, 25], the next greater elements for each element are as follows.
            Element       NGE
            4      -->   5
           5      -->   25
           2      -->   25
           25     -->   -1*/
    private static void demo(int arr[], int n){

        int next,i,j;

        for(i=0;i<n;i++){

            next=-1;

            for(j=i+1;j<n;j++){

                if(arr[i]<arr[j]){

                    next=arr[j];
                    break;
                }


            }
            System.out.println(arr[i]+"-->"+next);

        }








    }

}
