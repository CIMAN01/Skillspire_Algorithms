/*

Print Hashtags as displayed below:

#
##
###
####
#####
######

Have the method take a number that represents the number of lines to create.
Continue the pattern above for that many lines. The method should contain no more than
one variable. That variable, at the time of declaration should contain the value: "#"

*/

public class Hashtag {

    public static void printHashtags(int numOfLines) {
        // create a variable that holds a "#"
        String hash = "#";
        // iterate up to num that was passed in as argument
        for (int i = 0; i < numOfLines; i++) {
            // print a "#"
            System.out.println(hash);
            // increment the hash by "#" each time
            hash += "#";
        }
    }

    // main method
    public static void main(String[] args) {
        // invoke the method
        printHashtags(6);
    }

}
