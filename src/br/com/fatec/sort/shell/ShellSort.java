package br.com.fatec.sort.shell;

import br.com.fatec.sort.utils.Utils;

public class ShellSort {
    public static void sort(int[] arr) {
        int counter, traversingIndex, vtransportado, gap;

        for (gap = arr.length /2; gap > 0 ; gap=gap/2) { System.out.println("VÃO= "+gap);
            //DIVIDE O CONJUNTO EM 2 PARTES, REPETE ATÉ ZERO
            for (counter = gap; counter < arr.length; counter++) { //System.out.println("Counter= "+counter);
                // CONTADOR = VÃO OU METADE DO (SUB)CONJUNTO; SENDO < VALOR DA ÚLTIMA POSIÇÃO DO CONJUNTO; INCREMENTE 
                 System.out.println("Valor À DIREITA = "+arr[counter]);
                vtransportado = arr[counter]; System.out.println("Valor Transportado DA DIREITA= "+vtransportado);
                //VALOR TRANSPORTADO = VALOR Á DIREITA DO VÃO (VALOR NA POSIÇÃO DO CONTADOR)
                traversingIndex = counter - gap;                 //ÍNDICE=CONTADOR - VÃO
                Utils.printArray(arr);
                while (traversingIndex >= 0 && arr[traversingIndex] > vtransportado) {
                    //COMPARAÇÃO: VTRANSPORTADO X VALORES À SUA ESQUERDA;
                            //COMPARAÇÃO: ENQUANTO ÍNDICE >=ZERO && VALOR NA POSIÇÃO DAQUELE ÍNDICE > VALOR TRANPORTADO
                    arr[traversingIndex + gap] = arr[traversingIndex]; 
                    //JOGA O MAIOR PRA DIREITA
                            //POSIÇÃO DO ÍNDICE + VÃO = VALOR NA POSIÇÃO DO ÍNDICE
                    traversingIndex = traversingIndex - gap; System.out.println("posição da direita"+arr[traversingIndex + gap]+ "recebe o da esquerda"+arr[traversingIndex]);
                    //ÍNDICE-VÃO
                    Utils.printArray(arr);
                }                
                arr[traversingIndex + gap] = vtransportado; System.out.println("Valor Transportado DIREITA OU ESQUERDA = "+arr[traversingIndex + gap]);
                //TRAZ O VALOR TRANSPORTADO=MENOR PARA ESQUERDA
                            //VALOR NA POSIÇÃO ÍNDICE+VÃO = VALOR TRANSPORTADO
                Utils.printArray(arr);
            }
        }
    }

    public static void main(String[] args) {
        //int arr[] = {64,25,12,22,11};
        int arr[] = {12,34,54,2,3};
        System.out.println("Unsorted array:");
        Utils.printArray(arr);
        sort(arr);
        System.out.println("Sorted array:");
        Utils.printArray(arr);
    }
}
