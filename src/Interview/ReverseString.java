package Interview;

public class ReverseString {

    public static void main(String[] args) {

        String s="Software Testing Material";

       /* for(int i=s.length()-1;i>=0;i--)

        {
            System.out.print(s.charAt(i));

        }
*/
        String arr[]=s.split(" ");

        for(int i =0; i<arr.length;i++){

            for(int j=arr[i].length()-1;j>=0;j--){


                System.out.print(arr[i].charAt(j));
            }

            System.out.print(" ");


        }

    }

}
