package org.example;

public class QuicikSort {



    private static void quickSort (int[] array, int start, int end){
        if (end <= start){
            return;
        }

        int pivot = 0;
        int j = start -1;
        for (int i = start; i <= end;i++){
            if (array [i] < array[end]){
                j++;
                int temp = array[j];
                array[j] = array[i];
                array[i] = temp;
            }
        }
        pivot = j;
        quickSort(array, start, pivot-1);
        quickSort(array, pivot+1, end);
    }


    private static void quicksort1 (int[] array, int start, int end){
        if (end <= start){
            return;
        }
        int pivot = partition1(array, start, end);
        quicksort1(array, start, pivot-1);
        quicksort1(array, pivot +1, end);
    }
    private static int partition1 (int []array, int start, int end){
        int j = start -1;
        for (int i = start; i <= end; i++){
            if (array[i] <= array[end]){
                j++;

                int temp = array [j];
                array[j] = array[i];
                array[i] = temp;
            }
        }
        return j;
    }
    public static void main (String [] args) {
        int[] array = {2, 4, 5, 4, 5, 3412, 4, 2, 5, 42, 42, 54};
        quicksort1(array, 0, array.length - 1);
        for (int i : array) {
            System.out.print(i + " ");
        }

    }
}
