package tests;

import org.junit.jupiter.api.Test;
import ru.ollyeys.algorithms.SelectionSort;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SelectionSortTest {
    @Test
    void selectionSortTest() {
        int[] testArray = {123, 456, 3, 8, 9, 0, 45, 67, 8000};
        int[] expectedArray = {0, 3, 8, 9, 45, 67, 123, 456, 8000};
        SelectionSort.selectionSort(testArray);
        assertArrayEquals(expectedArray, testArray);
    }

    @Test
    void testEmptyArray(){
        int[] emptyArray = {};
        SelectionSort.selectionSort(emptyArray);
        assertTrue(Arrays.equals(emptyArray, new int[0]));
    }

    @Test
    void testSortedArray(){
        int[] sortedArray = {1,2,4,6,8, 10, 200};
        int[] expectedArray = {1,2,4,6,8, 10, 200};
        SelectionSort.selectionSort(sortedArray);
        assertArrayEquals(expectedArray, sortedArray);
    }

    @Test
    void testReverseArray() {
        int[] reverseArray = {800, 80, 9, 7, 6, 5, 4, 3, 2, 1};
        int[] expectedArray = {1, 2, 3, 4, 5, 6, 7, 9, 80, 800};
        SelectionSort.selectionSort(reverseArray);
        assertArrayEquals(expectedArray, reverseArray);
    }

}