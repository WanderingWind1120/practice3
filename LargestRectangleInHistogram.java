package org.example;

public class LargestRectangleInHistogram {
    public int solution (int [] array){
        int [] lessthanleft = new int[array.length];
        int [] lessthanright = new int[array.length];
        lessthanright [array.length-1] = array.length-1;
        lessthanleft[0] = 0;
        int ans = 0;

        for (int i = 1; i <= array.length-1; i++){
            int p = i;
            while (p-1 >= 0 && array[p-1] > array[p]){
                p = lessthanleft[p-1];
            }
            lessthanright[i] = p;
        }

        for (int j = array.length-2; j >= 0; j--){
            int p = j;
            while (p+1 <= array.length-1 && array[p+1] > array[p]){
                p = lessthanright[p+1];
            }
            lessthanright[j] = p;
        }
        for (int i = 0; i <= array.length-1; i++) {


            ans = Math.max(ans, array[i] * (lessthanright[i] - lessthanleft[i] +1));
        }
        return ans;
    }
}
