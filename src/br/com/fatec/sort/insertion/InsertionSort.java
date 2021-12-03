package br.com.fatec.sort.insertion;

import br.com.fatec.sort.utils.Utils;

public class InsertionSort {
    public static void sort(int[] arr) {
        int counter, shifter, key;

        for (counter = 1; counter < arr.length; counter++) { //COUNTADOR < TAMANHO DA LISTA
            key = arr[counter]; // SUJEITO 
            shifter = counter - 1; //SUBLISTA 
            System.out.println("SUJEITO=MANO NA VIATURA="+key+"  ENCAMINHAR PRA DELEGACIA="+shifter);
            while (shifter >= 0 && arr[shifter] > key) {//percorre a lista ATÉ DEIXAR DE SER MENOR
                arr[shifter+1] = arr[shifter]; // INDIVÍDUO EMPURRADO PRA FORA DA SUBLISTA
                System.out.println("INDIVÍDUO EMPURRADO PRA FORA DA SUBLISTA= "+arr[shifter+1]);
                System.out.println("LISTA ORDENADA NESSA RODADA: ");
                Utils.printArray(arr);
                System.out.println("==========================");
                shifter = shifter - 1;
            }
            arr[shifter + 1] = key;
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
