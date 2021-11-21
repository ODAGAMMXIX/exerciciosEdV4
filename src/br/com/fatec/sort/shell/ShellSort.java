package br.com.fatec.sort.shell;

import br.com.fatec.sort.utils.Utils;

public class ShellSort {
    public static void sort(int[] arr) {
        int counter, traversingIndex, key, gap;

        for (gap = arr.length /2; gap > 0 ; gap=gap/2) {
            for (counter = gap; counter < arr.length; counter++) {
                key = arr[counter];
                traversingIndex = counter - gap;
                while (traversingIndex >= 0 && arr[traversingIndex] > key) {
                    arr[traversingIndex + gap] = arr[traversingIndex];
                    traversingIndex = traversingIndex - gap;
                }
                arr[traversingIndex + gap] = key;

            }
        }

    }

    public static void main(String[] args) {
        int arr[] = {64,25,12,22,11};
        System.out.println("Unsorted array:");
        Utils.printArray(arr);
        sort(arr);
        System.out.println("Sorted array:");
        Utils.printArray(arr);
    }
}
