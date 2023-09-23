package ru.ollyeys.algorithms;

import java.util.Arrays;

public class SelectionSort {
    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minInd = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[minInd] > array[j]) {
                    minInd = j;
                }
            }
            if (minInd != i) {
                int temp = array[i];
                array[i] = array[minInd];
                array[minInd] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] testArray = {104, 12, 45, 44, 1, 4, 9, 10};
        selectionSort(testArray);
        System.out.println(Arrays.toString((testArray)));
    }
}
