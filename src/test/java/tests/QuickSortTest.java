package tests;

import org.junit.jupiter.api.Test;
import ru.ollyeys.algorithms.QuickSort;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class QuickSortTest {

    @Test
    public void testQiockSort() {
        int[] testArray = {104, 12, 45, 44, 1, 4, 9, 10};
        int[] expectedArray = {1, 4, 9, 10, 12, 44, 45, 104};
        QuickSort.quickSort(testArray, 0, testArray.length - 1);
        assertArrayEquals(expectedArray, testArray);
    }

    @Test
    public void testEmptyArray() {
        int[] emptyArray = {};
        QuickSort.quickSort(emptyArray, 0, emptyArray.length - 1);
        assertTrue(Arrays.equals(emptyArray, new int[0]));
    }

    @Test
    public void testSortedArray() {
        int[] sortedArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] expectedArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        QuickSort.quickSort(sortedArray, 0, sortedArray.length - 1);
        assertArrayEquals(expectedArray, sortedArray);
    }

    @Test
    public void testReverseArray() {
        int[] reverseArray = {5, 4, 3, 2, 1};
        int[] expectedArray = {1, 2, 3, 4, 5};
        QuickSort.quickSort(reverseArray, 0, reverseArray.length - 1);
        assertArrayEquals(expectedArray, reverseArray);
    }
}