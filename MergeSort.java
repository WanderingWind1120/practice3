package org.example;

public class MergeSort {
    public void mergeSort (int [] array){
        if (array.length <=1){
            return;
        }

        int high = array.length-1;
        int low = 0;
        int middle = (int) (high - low)/2;
        int[] leftarray = new int[middle];
        int[] rightarray = new int[array.length-middle];
        int j =0;

        for (int i = 0; i <= array.length-1; i++ )   {
            if (i <= middle-1){
                leftarray[i] = array[i];
            }
            else{
                rightarray[j] = leftarray[i];
                j++;
            }
        }
        mergeSort(leftarray);
        mergeSort(rightarray);
        merge(leftarray, rightarray, array);
    }
    public void merge (int[] leftarray, int[] rightarray, int[] array){
        int i =0, j=0, k =0;
        while (i <= leftarray.length-1 && j<= rightarray.length -1 ){
            if (leftarray[i] < rightarray[j]){
                array[k] = leftarray[i];
                k++;
                i++;
            }
            else {
                array[k] = rightarray[j];
                k++;
                j++;
            }
        }
        while (i <= leftarray.length-1){
            array[k] = leftarray[i];
            k++;
            i++;
        }
        while (j <= rightarray.length-1){
            array[k] = rightarray[j];
            k++;
            j++;
        }
    }
}
