package br.com.fatec.sort.selection;

import br.com.fatec.sort.utils.Utils;

import static br.com.fatec.sort.utils.Utils.swap;

public class SelectionSort {
    static void sort(int arr[]) {
//        Initialize 3 new variables. Counter, Traversing index, Minimum index;
        int counter, traversingIndex, minimumIndex;
//        Set Counter equal to 0, minimum index equal to counter, and Traversing index equal to 1 plus the Counter;
        for (counter = 0; counter < arr.length; counter++) {
            minimumIndex = counter;
            for (traversingIndex = counter + 1; traversingIndex < arr.length ; traversingIndex++) {
//                Search the list from the Counter through the end of the data using our Traversing Index,
//                and compare every element we pass over to the value stored at the minimum index;

                if (arr[traversingIndex] < arr[minimumIndex]) {
//                    If the value is less than the value stored at the minimum index,
//                    We re-set minimum index to whatever our Traversing Index is;
                    minimumIndex = traversingIndex;
                }
            }
//            After traversing the whole list, we swap the values counting at the Counter and the Minimum Index;
            swap(arr, counter, minimumIndex);
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
