package br.com.fatec.sort.merge;

import br.com.fatec.sort.utils.Utils;

public class MergeSort {


    public static void main(String[] args) {
        int arr[] = {64,25,12,22,11};
        System.out.println("Unsorted array:");
        Utils.printArray(arr);
        sort(arr, 0, arr.length);//CHAMADA DA RECURSÃO DE ZERO ATÉ O FINAL DA LISTA
        System.out.println("Sorted array:");
        Utils.printArray(arr);
    }

    private static void sort(int[] arr, int start, int end) { // FUNÇÃO RECURSIVA
        if (end - start > 1) { //VERIFICA SE A FAIXA DE VALORES CHEGOU AO LIMITE MÍNIMO (CASO BASE)
            int middle = (start + end) / 2; // DIVISÃO DO ARRAY (OPÇÃO: ARRENDONDA PRA BAIXO)
            System.out.println("-----------LADO ESQUERDO---------");
            System.out.println("POSIÇÃO INÍCIO:"+start);
            System.out.println("POSIÇÃO MEIO: "+middle);
            Utils.printArrayRange(arr, start, middle);
            System.out.println("-----------LADO DIREITO---------");
            System.out.println("POSIÇÃO MEIO: "+middle);
            System.out.println("POSIÇÃO FIM:"+end);
            Utils.printArrayRange(arr, middle, end);
            System.out.println("========================");

            sort(arr, start, middle); // 1a RECURSÃO DA RECURSÃO: INÍCIO ATÉ O MEIO
            sort(arr, middle, end); // 2a RECURSÃO DA RECURSÃO: MEIO ATÉ O FIM
            merge(arr, start, middle, end); //CHAMADA DO MÉTODO DE FUSÃO
        }
    }

    private static void merge(int[] arr, int start, int middle, int end) { //MÉTODO DE FUSÃO
        // 
        int[] leftSide = new int[middle - start]; // LADO ESQUERDO 
        int[] rightSide = new int[end - middle]; // LADO DIREITO

        for (int i = 0; i < leftSide.length; i++) {
            leftSide[i] = arr[start + i]; // COPIA OS ELEMENTOS DO LADO ESQUERDO P/ LISTA ESQUERDA
        }

        for (int i = 0; i < rightSide.length; i++) {
            rightSide[i] = arr[middle + i]; // COPIA OS ELEMENTOS DO LADO DIREITO P/ LISTA DIREITA
        }

        int topLeft = 0;
        int topRight = 0;
        System.out.println("VAMOS FUNDIR OS ARRAYS:");
        System.out.println("LEFTSIDE:"); Utils.printArray(leftSide);
        System.out.println("RIGHTSIDE:");Utils.printArray(rightSide);

        for (int i = start; i < end ; i++) {
            // SITUAÇÃO SEMI-FINAL: QDO EXAURIU AS POSIÇÕES DA ESQUERDA, COPIA OS REMANESCENES DA DIREITA
            if (topLeft >= leftSide.length) { 
                arr[i] = rightSide[topRight];
                System.out.println("AGORA, VEM AQUELE QUE SOBROU DO LADO DIREITO: "+rightSide[topRight]);
                topRight++;
                
            }// SITUAÇÃO SEMI-FINAL: QDO EXAURIU AS POSIÇÕES DA DIREITA, COPIA OS REMANESCENES DA ESQUERDA
            else if (topRight >= rightSide.length) {
                arr[i] = leftSide[topLeft];
                System.out.println("AGORA, VEM AQUELE QUE SOBROU DO LADO ESQUERDO: "+leftSide[topLeft]);
                topLeft++;
                
            } // SUJEITO DA ESQUERDA É MENOR QUE O DA DIREITA?
            else if (leftSide[topLeft] < rightSide[topRight]) {
                System.out.println("menor SUJEITO+AAESQUERDA, DA ESQUERDA:"+leftSide[topLeft]+" < menor SUJEITO+AADIREITA, DA DIREITA"+rightSide[topRight]);
                arr[i] = leftSide[topLeft]; // SE SIM, INSERE O SUJEITO DA ESQUERDA
                topLeft++;
            } else  { // SENÃO, INSERE O SUJEITO DA DIREITA
                System.out.println("menor SUJEITO+AADIREITA, DA DIREITA:"+rightSide[topRight]+" < menor SUJEITO+AAESQUERDA, DA ESQUERDA:"+leftSide[topLeft]);
                arr[i] = rightSide[topRight];                
                topRight++;
            }
            Utils.printArrayRange(arr, start, end);
            System.out.println("************************************");
        }

    }
}
