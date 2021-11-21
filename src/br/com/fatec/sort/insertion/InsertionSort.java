package br.com.fatec.sort.insertion;

import br.com.fatec.sort.utils.Utils;

public class InsertionSort {
    public static void sort(int[] arr) {
        int counter, traversingIndex, key;

        for (counter = 1; counter < arr.length; counter++) {
            key = arr[counter];
            traversingIndex = counter - 1;
            while (traversingIndex >= 0 && arr[traversingIndex] > key) {
                arr[traversingIndex+1] = arr[traversingIndex];
                traversingIndex = traversingIndex - 1;
            }
            arr[traversingIndex + 1] = key;
        }
    }
    public static void main(String[] args) {
        int arr[] = {64,25,12,22,11};
        System.out.println("Unsorted array:");
        Utils.printArray(arr);
        sort(arr);
        System.out.println("Sorted array:");
        Utils.printArray(arr);

        System.out.println("Best case");
        int arr1[] = {1,2,3,4,5};
        System.out.println("Given an sorted array:");
        Utils.printArray(arr);
        sort(arr1);
        System.out.println("Sorted array:");
        Utils.printArray(arr1);
    }
}
