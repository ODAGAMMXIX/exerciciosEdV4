package br.com.fatec.sort.quicksort;
import br.com.fatec.sort.utils.Utils;
import static br.com.fatec.sort.utils.Utils.swap;

public class Quicksort {

    public static void main(String[] args) {
        int arr[] = {64,25,12,22,11,20};
        System.out.println("Unsorted array:");
        Utils.printArray(arr);
        sort(arr, 0 , arr.length - 1); // INÍCIO DA RECURSÃO
        System.out.println("Sorted array:"); 
        Utils.printArray(arr);
    }

    private static void sort(int[] arr, int start, int end) { //ORDENAÇÃO
        if(start < end) { //CASO BASE
            int pivot = partition(arr, start, end); // ACHA O PIVÔ, POSICIONA-SE-LHE, ORDENA AS SUBLISTAS;
            
            sort(arr, start, pivot -1); // ESQUERDA 

            sort(arr, pivot + 1, end -1); // DIREITA
        }
    }

    private static int partition(int[] arr, int start, int end) { 
        int pivot = arr[end];
        int pivotIndex = start; // POSIÇÃO IDEAL DO PIVÔ
        int counter;
        System.out.println("POSIÇÕES:"); 
        System.out.println("Pos. de Início: "+start);
        System.out.println("Pos. de Fim: "+end);
        System.out.println("VALOR do Pivô: "+pivot);
        System.out.println("POSIÇÃO IDEAL DO PIVÔ: "+pivotIndex);
        System.out.println("*******************");
                
        for (counter = start; counter < end; counter++) {
            System.out.println(arr[counter]+" É MENOR DO QUE O PIVÔ "+pivot+"?");
            
            if (arr[counter] <= pivot) {
                System.out.println("trocando o valor na POSIÇÃO:"+ counter+ "(" + arr[counter] +") pela POSIÇÃO IDEAL do PIVÔ: "+pivotIndex+"("+arr[pivotIndex]+")");
                Utils.printArrayRange(arr, start, end+1);
                swap(arr, pivotIndex, counter);
                Utils.printArrayRange(arr, start, end+1);
                pivotIndex++;
                System.out.println("(Devo deixar todos os MENORES à esquerda do Pivô)");
                System.out.println("nOVA POSIÇÃO IDEAL DO PIVÔ: "+pivotIndex);
                System.out.println("=========================");
            }
        }
        System.out.println("Colocando o pivô no lugar Ideal: "+ pivotIndex);
        Utils.printArrayRange(arr, start, end+1);
        swap(arr, pivotIndex, end);
        Utils.printArrayRange(arr, start, end+1);
        System.out.println("--------------------------------");
        return pivotIndex;
    }
}
