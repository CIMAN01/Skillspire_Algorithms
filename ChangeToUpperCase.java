/*
   Given a string of mixed-case letters, change any uppercase letters to lowercase.

   Do not use methods to change casing. You'll have to loop through, find uppercase letters,
   and convert them to lowercase.

 */

public class Challenge2 {
    //
    public static void main(String[] args) {
        //
        String someStr = "ThisIsASTRING";
        //
        changeToLowerCase(someStr);

    }

    public static void changeToLowerCase(String str) {
        //
        int length = str.length();
        //
        String result = "";
        //
        for (int i = 0; i < length; i++) {
            //
            char aChar = str.charAt(i);
            //
            if (65 <= aChar && aChar <= 90) {
                aChar = (char) ((aChar + 32));
            }
            //
            result += aChar;
        }
        System.out.println(result);
    }
}
