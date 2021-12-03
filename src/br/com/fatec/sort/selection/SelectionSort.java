package br.com.fatec.sort.selection;

import br.com.fatec.sort.utils.Utils;

import static br.com.fatec.sort.utils.Utils.swap;

public class SelectionSort {
    static void sort(int arr[]) {

        int Prisao, Polisssa, ManoNaViatura; 

        for (Prisao = 0; Prisao < arr.length; Prisao++) {// COMEÇA EM ZERO!!!
            ManoNaViatura = Prisao;  
            System.out.println("POSIÇÃO QUE SERÁ COMPARADA COM O RESTO DA LISTA= "+ManoNaViatura); // VARREDURA DAS PRISÕES DA LISTA
            for (Polisssa = Prisao + 1; Polisssa < arr.length ; Polisssa++) { //ENCONTRA O MANO IDEAL PRA ESSA PRISÃO
            
                if (arr[Polisssa] < arr[ManoNaViatura]) {// QUEM É O MANO IDEAL PRA ESSA PRISÃO?
                    System.out.println("? "+ arr[Polisssa] + " É MENOR DO QUE "+arr[ManoNaViatura]+"?");
                    ManoNaViatura = Polisssa;
                    System.out.println("O NOVO MANO IDEAL PRA ESSA PRISÃO (VALOR MENOR) É = "+arr[ManoNaViatura]);
                }
            }
            System.out.println("DEPOIS DE COMPARAR COM O ESTO DA LISTA, TROQUE: ");
            swap(arr, Prisao, ManoNaViatura); // TROCA MANO IDEAL PRA ESSA PRISÃO = VALOR MENOR
            Utils.printArray(arr);
            System.out.println("================================");
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
