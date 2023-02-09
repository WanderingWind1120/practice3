package org.example;

public class JumpGame {
    public boolean solution (int [] array){
        int boundary = 0;
        for (int i = 0; i<= boundary; i++){
            boundary = array[i];
            if (boundary > array.length-1){
                return false;
            }
        }
        return false;
    }
}
