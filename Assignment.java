import java.util.Arrays;
import java.util.Scanner;
/*
 *   GROUP 14 - ASSIGNMENT
 *   THIS PROGRAM FINDS THE NEAREST VALUE OF THE INPUT IN A GIVEN SORTED ARRAY
 *   THIS PROGRAM USES MODIFIED BINARY SEARCH ALGORITHM TO FIND THE CORRECT VALUES
 * */

public class Assignment {

    //This method will break the array on each recursive call
    private static int[] sliceTheArray(int[] sortedArray, int leftSide, int rightSide) {
        return Arrays.copyOfRange(sortedArray, leftSide, rightSide);
    }
    //This method will find the position of the element in array
    private static int positionOfElement(int[] sortedArray, int nearestValue) {
        for (int i = 0; i < sortedArray.length; i++) {
            if (sortedArray[i] == nearestValue) {
                return i;
            }
        }
        return 0;
    }

    //This is recursive method to find the nearest value, it is modified version of the binary search
    private static int modifiedBinarySearch(int[] sortedArray, int input) {
        int midpoint = sortedArray.length / 2;

        if (sortedArray[midpoint] == input) { //This case handles when the value entered is present in the loop
            return midpoint;
        }
        if (sortedArray.length == 2) { //This case handles the nearest value search
            return input - sortedArray[0] > input - sortedArray[1] ? sortedArray[1] : sortedArray[0];
        }
        if (sortedArray[midpoint] > input) {
            return modifiedBinarySearch(sliceTheArray(sortedArray, 0, midpoint), input);
        } else {
            return modifiedBinarySearch(sliceTheArray(sortedArray, midpoint, sortedArray.length), input);
        }
    }

    public static void main(String[] args) {
        //Array of 20 sorted numbers
        int[] sortedArray = {1, 2, 4, 6, 7, 8, 9, 11, 19, 21, 99, 119, 254, 256, 301, 400, 500, 542, 600, 610};
        Scanner reader = new Scanner(System.in); //Scanner object for reading input from user
        System.out.println("Given Array is : 1,2,4,6,7,8,9,11,19,21,99,119,254,256,301,400,500,542,600,610");
        System.out.println("Please enter a value to find the closest value in the array");
        int input = reader.nextInt(); //User input
        //Output result
        System.out.print("Value near to input : " + input + " is => " + modifiedBinarySearch(sortedArray, input) +
                " and position of the value in the array is => " + positionOfElement(sortedArray, modifiedBinarySearch(sortedArray, input)));


    }
}

