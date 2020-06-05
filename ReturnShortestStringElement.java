import java.util.Arrays;

// main class
public class ReturnShortestStringElement {

    // a method that returns the shortest String in an array
    public static String getShortestString(String[] array) {
        // assign first array element to a String variable
        String shortest = array[0];
        // iterate over the array
        for (int i = 0; i < array.length; i++) {
            // if the i-th element length is shorter than the length of shortest
            if (shortest.length() > array[i].length()) {
                // assign that element value to shortest
                shortest = array[i];
            }
        }
        // return the shortest String in the array
        return shortest;
    }

    // main method
    public static void main(String[] args) {
        String[] animalNames = {"cat", "rabbit", "horse", "goat", "rooster", "ooooooooomph"};
        String animal = getShortestString(animalNames);
        System.out.println("the longest array element from ");
        System.out.println(Arrays.toString(animalNames));
        System.out.println("is "+ animal); // should print cat
    }

}
