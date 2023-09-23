package ru.ollyeys.algorithms;

import java.util.Arrays;

// Hoar's Sort
public class QuickSort {
    private static int partition(int[] array, int low, int high) {
        int pivot = array[low + (high - low) / 2];
        int i = low, j = high;

        while (i <= j) {
            while (array[i] < pivot) {
                i++;
            }
            while (array[j] > pivot) {
                j--;
            }
            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }
        return i;
    }

    public static void quickSort(int[] array, int low, int high) {
        if (array.length == 0) return;
        if (low >= high) return;

        int delimiter = partition(array, low, high);

        quickSort(array, low, delimiter - 1);
        quickSort(array, delimiter, high);
    }

    public static void main(String[] args) {
        int[] testArray = {104, 12, 45, 44, 1, 4, 9, 10};
        quickSort(testArray, 0, testArray.length - 1);
        System.out.println(Arrays.toString(testArray));

    }

}
