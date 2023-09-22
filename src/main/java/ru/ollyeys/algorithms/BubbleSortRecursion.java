package ru.ollyeys.algorithms;

import java.util.Arrays;

public class BubbleSortRecursion {
    private static void bubbleSort(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                int temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;
                count++;
            }
        }
        if (count > 0) {
            bubbleSort(array);
        }
    }

    public static void main(String[] args) {
        int[] testArray = {104, 12, 45, 44, 1, 4, 9, 10};
        bubbleSort(testArray);
        System.out.println(Arrays.toString(testArray));
    }
}
