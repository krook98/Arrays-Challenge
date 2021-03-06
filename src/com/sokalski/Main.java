package com.sokalski;

// Create a program using arrays that sorts a list of integers in descending order.
// Descending order is highest value to lowest.
// In other words if the array had the values in it 106, 26, 81, 5, 15 your program should
// ultimately have an array with 106,81,26, 15, 5 in it.
// Set up the program so that the numbers to sort are read in from the keyboard.
// Implement the following methods - getIntegers, printArray, and sortIntegers
// getIntegers returns an array of entered integers from keyboard
// printArray prints out the contents of the array
// and sortIntegers should sort the array and return a new array containing the sorted numbers
// you will have to figure out how to copy the array elements from the passed array into a new
// array and sort them and return the new sorted array.

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myInts = getIntegers(5);
        int[] sorted = sortIntegers(myInts);
        printArray(sorted);
    }

    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " integer values.\r");
        int[] values = new int[number];

        for(int i=0; i<values.length; i++) {
            values[i] = scanner.nextInt();
        }

        return values;
    }

    public static void printArray(int[] values) {
        for (int i=0; i<values.length; i++) {
            System.out.println(values[i]);
        }
    }

    public static int[] sortIntegers(int[] values) {
        int[] sortedValues = new int[values.length];

        for (int i=0; i<values.length; i++) {
            sortedValues[i] = values[i];
        }

        boolean flag = true;
        int holder;

        while(flag) {
            flag = false;
            for(int i = 0; i < sortedValues.length - 1; i++) {
                if(sortedValues[i] < sortedValues[i+1]) {
                    holder = sortedValues[i];
                    sortedValues[i] = sortedValues[i+1];
                    sortedValues[i+1] = holder;
                    flag = true;
                }
            }
        }

        return sortedValues;
    }
}
