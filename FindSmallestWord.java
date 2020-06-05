
/* Given a string of words, create a method that return the smallest word. */

public class FindSmallestWord {
    // a method that finds the smallest word in a String
    public static String findSmallestWord(String input) {
        // create an array that holds each word from the input String
        String[] words = input.split(" "); // split by words
        // store the first element value
        String smallestWord = words[0];
        // store the first element length
        int smallestWordLength = words[0].length();
        // loop through each words from the array
        for (int i = 0; i < words.length; i++) {
            // grab the i-th word and store it
            String word = words[i];
            // store the i-th element's length
//            int wordLength = word.length();
            int wordLength = words[i].length();
            // if the i-th element's length is smaller than the currently assigned smallest length
            if (wordLength < smallestWordLength) {
                // swap the length
                smallestWordLength = wordLength;
                // swap the word
                smallestWord = word;
            }
        }
        // return the smallest word
        return smallestWord;
    }
    // driver method
    public static void main(String[] args) {
        // create some random string
        String testStr = "Here I come!";
        // invoke the method and print the smallest word
        System.out.println(findSmallestWord(testStr)); // should print "I"
    }

}
