/*

#
##
###
####
#####
######

Too easy? Have the method take a number that represents
the number of lines to create.
Continue the pattern above for that many lines.

The method should contain no more than one variable.
That variable, at the time of declaration should contain this value: "#"

 */

public class Hashtag {

    public static void printHash(int numOfLines) {
        String hash = "#";
        // for (int i = 0; i < numOfLines; i++)
        for (int i = 1; i <= numOfLines; i++) {
            System.out.println(hash);
            hash +="#";
        }
    }

    public static void main(String[] args) {
        printHash(6);
    }
}
