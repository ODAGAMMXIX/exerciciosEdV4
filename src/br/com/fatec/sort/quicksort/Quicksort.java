package br.com.fatec.sort.quicksort;

import br.com.fatec.sort.utils.Utils;

import static br.com.fatec.sort.utils.Utils.swap;


public class Quicksort {

    public static void main(String[] args) {
        int arr[] = {64,25,12,22,11};
        System.out.println("Unsorted array:");
        Utils.printArray(arr);
        sort(arr, 0 , arr.length - 1);
        System.out.println("Sorted array:");
        Utils.printArray(arr);
    }

    private static void sort(int[] arr, int start, int end) {
        if(start < end) {
            int pivot = partition(arr, start, end);
            sort(arr, start, pivot -1);
            sort(arr, pivot + 1, end -1);
        }
    }

    private static int partition(int[] arr, int start, int end) {
        int pivot = arr[end];
        int pivotIndex = start;
        int counter;
        for (counter = start; counter < end; counter++) {
            if (arr[counter] <= pivot) {
                swap(arr, pivotIndex, counter);
                pivotIndex++;
            }
        }
        swap(arr, pivotIndex, end);
        return pivotIndex;
    }
}
