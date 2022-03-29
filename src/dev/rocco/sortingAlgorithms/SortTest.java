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

    public static int getMedian(int[] elements) {
        insertionSort(elements);
        double temp;
        if (elements.length % 2 == 0) {
            temp = ((elements.length + 1) / 2.0) - 1;
            int lower = (int) (temp - 0.5);
            int upper = (int) (temp + 0.5);
            temp = (elements[lower] + elements[upper]) / 2;
        } else {
            temp = elements[elements.length / 2];
        }
        return (int) temp;
    }

    public static void main(String[] args) {
        int[] arr1 = {3, 86, -20, 14, 40};
        System.out.println("Original: " + Arrays.toString(arr1));
        selectionSort(arr1);
        System.out.println("Selection Descending: " + Arrays.toString(arr1));
        insertionSort(arr1);
        System.out.println("Insertion Ascending: " + Arrays.toString(arr1));
        System.out.println("Median Value: " + getMedian(arr1));
    }
}
