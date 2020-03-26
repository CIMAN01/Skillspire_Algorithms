/*

Create a method that, given an array of house prices, returns the average price.

Invoke the method in your main method.

 */

// Given an array of house prices, return the average price.

public class AveragePrices {

    // a method that returns the average price of houses
    public static int returnAveragePrice(int[] array) {
        // create variables to store sum and count
        int sum = 0; // average sum
        int count = array.length; // length of array
        // loop through the array
        for (int i = 0; i < count; i++) {
            // add each prices to the sum
            sum += array[i];
        }
        // divide the sum by count to get the average
        return sum / count; // return the average price
    }

    // main method
    public static void main(String[] args) {
        // an array of prices
        int prices[] = {275000, 540200, 750500, 910250, 1200000};
        // print the average price
        System.out.println("The average price of houses is $"+ returnAveragePrice(prices));
    }

}
