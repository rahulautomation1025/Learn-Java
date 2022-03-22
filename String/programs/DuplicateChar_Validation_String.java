package String.programs;

public class DuplicateChar_Validation_String {

    public static void main(String[] args) {

        String str = "Automation Automation";

        char[] carr = str.toCharArray();
        System.out.println("The string is:" + str);

        System.out.print("Duplicate Characters in above string are: ");

        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {  //
                if (carr[i] == carr[j]) {
                    System.out.print(carr[j] + " ");
                    break;
                }
            }
        }
    }

}
