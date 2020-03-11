// In-class algorithm challenges via zoom app (day 15)

public class RandomAlgorithms {

    // 1. Create a method that takes an integer. Log numbers 0 up to that number.
    public static void logNum(int num) {
        for (int i = 0; i <= num; i++) {
            System.out.println(i);
        }
    }

    // 2. Create a method that takes an array of contacts and logs each contact.
    public static void contactArr(String[] contact) {
        for (int i = 0; i < contact.length; i++) {
            System.out.println(contact[i]);
        }
    }

    // 3. Create a method that takes an array of numbers. If there is an odd
    //    number of values, log the one in the middle.
    public static void arrLengthOddOrEven(int[] numArr) {
        if (numArr.length % 2 != 0) {
            System.out.println(numArr[numArr.length/2]);
        }
    }

    // 4. Create a method that takes an array of numbers and returns true if all
    //   numbers are even.
    public static boolean isArrEven(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
              return false;
            }
        }
        return true;
    }
    // main method
    public static void main(String[] args) {

        // 1.
        logNum(5);
        // 2.
        String[] arr = {"john", "Adam", "Berkley", "Smith"};
        contactArr(arr);
        // 3.
        int[] numArr = {0, 3, 7, 10, 13, 20, 11};
        arrLengthOddOrEven(numArr);
        // 4.
        int[] numEven = {2, 4, 6, 8, 10};
        int[] numOdd  = {3, 5, 7, 9, 11};
        System.out.println(isArrEven(numOdd));
        System.out.println(isArrEven(numEven));

    }
}

