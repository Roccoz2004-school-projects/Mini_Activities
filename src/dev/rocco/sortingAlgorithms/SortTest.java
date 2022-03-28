package dev.rocco.sortingAlgorithms;

import java.util.Arrays;

public class SortTest {
    public static void selectionSort(int[] elements) {
        for (int index = 0; index < elements.length - 1; index++) {
            int maxIndex = index;
            for (int index2 = index + 1; index2 < elements.length; index2++) {
                if (elements[index2] > elements[maxIndex]) {
                    maxIndex = index2;
                }
            }
            int temp = elements[index];
            elements[index] = elements[maxIndex];
            elements[maxIndex] = temp;
        }
    }

    public static void insertionSort(int[] elements) {
        for (int j = 1; j < elements.length; j++) {
            int temp = elements[j];
            int possibleIndex = j;
            while (possibleIndex > 0 && temp < elements[possibleIndex - 1]) {
                elements[possibleIndex] = elements[possibleIndex - 1];
                possibleIndex--;
            }
            elements[possibleIndex] = temp;
        }
    }

    public static void getMedian(int[] elements) {

    }

    public static void main(String[] args) {
        int[] arr1 = {3, 86, -20, 14, 40};
        System.out.println(Arrays.toString(arr1));
        selectionSort(arr1);
        System.out.println(Arrays.toString(arr1));
    }
}
