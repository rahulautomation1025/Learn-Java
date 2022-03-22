package String.programs;

public class CountPunctuation {

    public static void main(String[] args) {

        int count = 0;
        String str = "I will do it,'if not me theh who?' Let's do it.";

        for (int i = 0; i < str.length(); i++) {


            // logic to check punctuation mark
            // charAt() method that returns the character at the specified index in a string
            if (str.charAt(i) == ',' ||
                    str.charAt(i) == ';' ||
                    str.charAt(i) == '.' ||
                    str.charAt(i) == '?' ||
                    str.charAt(i) == '\'' ||
                    str.charAt(i) == '\"' ||
                    str.charAt(i) == ':') {
                count = count + 1;

            }
        }

        System.out.println("Number of punctuations exists in string is: " + count);

    }
 }

