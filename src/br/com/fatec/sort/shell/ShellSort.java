package br.com.fatec.sort.shell;

import br.com.fatec.sort.utils.Utils;

public class ShellSort {
    public static void sort(int[] arr) {
        int counter, traversingIndex, key, gap;

        for (gap = arr.length /2; gap > 0 ; gap=gap/2) { System.out.println("Gap= "+gap);
            for (counter = gap; counter < arr.length; counter++) { System.out.println("Counter= "+counter);
                key = arr[counter]; System.out.println("Key= "+key);
                traversingIndex = counter - gap; System.out.println("tIndex= "+traversingIndex);
                Utils.printArray(arr);
                while (traversingIndex >= 0 && arr[traversingIndex] > key) {
                    arr[traversingIndex + gap] = arr[traversingIndex]; System.out.println("Gap= "+gap);
                    traversingIndex = traversingIndex - gap; System.out.println("tIndex= "+traversingIndex);
                }                
                arr[traversingIndex + gap] = key; System.out.println("Valor Transportado = "+arr[traversingIndex + gap]);

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
