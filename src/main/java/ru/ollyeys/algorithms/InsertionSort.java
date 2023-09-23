package ru.ollyeys.algorithms;

import java.util.Arrays;

public class InsertionSort {
    private static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int position = i - 1;
            while (position >= 0 && array[position] > array[position + 1]) {
                int temp = array[position];
                array[position] = array[position + 1];
                array[position + 1] = temp;
                position--;
            }
        }
    }

    public static void main(String[] args) {
        int[] testArray = {104, 12, 45, 44, 1, 4, 9, 10};
        insertionSort(testArray);
        System.out.println(Arrays.toString(testArray));
    }
}
