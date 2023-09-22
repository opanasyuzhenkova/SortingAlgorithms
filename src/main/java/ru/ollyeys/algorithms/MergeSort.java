package ru.ollyeys.algorithms;


import java.util.Arrays;

public class MergeSort {
    public static int[] mergeSort(int[] array, int left, int right) {
        if (array.length <= 1) return array;

        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(array, left, mid);
            mergeSort(array, mid + 1, right);
            merge(array, left, mid, right);
        }
        return array;
    }

    private static void merge(int[] array, int left, int mid, int right) {

        int[] leftArray = Arrays.copyOfRange(array, left, mid + 1);
        int[] rightArray = Arrays.copyOfRange(array, mid + 1, right + 1);

        int i = 0, j = 0, k = left;

        while (i < leftArray.length && j < rightArray.length) {
            if (leftArray[i] <= rightArray[j]) {
                array[k] = leftArray[i];
                i++;
            } else {
                array[k] = rightArray[j];
                j++;
            }
            k++;
        }

        while (i < leftArray.length) {
            array[k] = leftArray[i];
            i++;
            k++;
        }
        while (j < rightArray.length) {
            array[k] = rightArray[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {
        int[] sArr = {1, 12, 4, 56, 6, 8, 9};
        System.out.println(Arrays.toString(mergeSort(sArr, 0, sArr.length - 1)));
    }
}

