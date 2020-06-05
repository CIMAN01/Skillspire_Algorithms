import java.util.Arrays;

// main class
public class ReturnLongestStringElement {

    // a method that returns the longest String in an array
    public static String getLongestString(String[] array) {
        // assign first array element to a String variable
        String longest = array[0];
        // iterate over the array
        for (int i = 0; i < array.length; i++) {
            // if the i-th element length is larger than the length of longest
            if (longest.length() < array[i].length()) {
                // assign that element value to longest
                longest = array[i];
            }
        }
        // return the longest String in the array
        return longest;
    }

    // main method
    public static void main(String[] args) {
        String[] animalNames = {"cat", "rabbit", "horse", "goat", "rooster", "ooooooooomph"};
        String animal = getLongestString(animalNames);
        System.out.println("the longest array element from ");
        System.out.println(Arrays.toString(animalNames));
        System.out.println("is "+ animal); // should print ooooooooomph
    }

}
