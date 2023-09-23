package ru.ollyeys.algorithms;

import java.util.Arrays;

public class BubbleSort {
    private static void bubbleSort(int[] array) {
        boolean unsorted = true;
        int temp;
        while (unsorted) {
            unsorted = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    unsorted = true;
                }
            }
        }
    }

    private static void bubbleImplementation(int[] array) {
        int length = array.length;
        while (length != 0) {
            int maxIndex = 0;
            for (int i = 1; i < length; i++) {
                if (array[i - 1] > array[i]) {
                    int temp = array[i-1];
                    array[i-1] = array[i];
                    array[i] = temp;
                    maxIndex = i;
                }
            }
            length = maxIndex;
        }
    }

    public static void main(String[] args) {
        int[] testArray = {104, 12, 45, 44, 1, 4, 9, 10};
        bubbleSort(testArray);
        System.out.println(Arrays.toString(testArray));
        int[] testArray2 = {104, 12, 45, 44, 1, 4, 9, 10};
        bubbleImplementation(testArray2);
        System.out.println(Arrays.toString(testArray2));
    }
}
