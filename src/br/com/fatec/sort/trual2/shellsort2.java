
package br.com.fatec.sort.trual2;

import br.com.fatec.sort.utils.Utils;

public class shellsort2 {
    public static void sort(int[] arr) {
        int counter, traversingIndex, vtransportado, gap;

        for (gap = arr.length /2; gap > 0 ; gap=gap/2) 
            //DIVIDE O CONJUNTO EM 2 PARTES, REPETE ATÉ ZERO
            for (counter = gap; counter < arr.length; counter++) { //System.out.println("Counter= "+counter);
                // CONTADOR = VÃO OU METADE DO (SUB)CONJUNTO; SENDO < VALOR DA ÚLTIMA POSIÇÃO DO CONJUNTO; INCREMENTE 
                 
                vtransportado = arr[counter]; 
                //VALOR TRANSPORTADO = VALOR Á DIREITA DO VÃO (VALOR NA POSIÇÃO DO CONTADOR)
                traversingIndex = counter - gap;                 //ÍNDICE=CONTADOR - VÃO
                Utils.printArray(arr);
                while (traversingIndex >= 0 && arr[traversingIndex] > vtransportado) {
                    //COMPARAÇÃO: VTRANSPORTADO X VALORES À SUA ESQUERDA;
                            //COMPARAÇÃO: ENQUANTO ÍNDICE >=ZERO && VALOR NA POSIÇÃO DAQUELE ÍNDICE > VALOR TRANPORTADO
                    arr[traversingIndex + gap] = arr[traversingIndex]; 
                    //JOGA O MAIOR PRA DIREITA
                            //POSIÇÃO DO ÍNDICE + VÃO = VALOR NA POSIÇÃO DO ÍNDICE
                    traversingIndex = traversingIndex - gap; 
                    //ÍNDICE-VÃO
                    Utils.printArray(arr);
                }                
                arr[traversingIndex + gap] = vtransportado; 
                //TRAZ O VALOR TRANSPORTADO=MENOR PARA ESQUERDA
                            //VALOR NA POSIÇÃO ÍNDICE+VÃO = VALOR TRANSPORTADO
                Utils.printArray(arr);
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