package org.example;

import java.lang.module.ResolutionException;

public class ZigzagConversion {
    public static String solution (String s, int numRows){
        StringBuilder newString = new StringBuilder();
        int k = 2*(numRows-1);

        for (int i = 0; i<= numRows-1; i++){
            int index = i;
            while (index <= s.length() -1) {
                newString.append(s.charAt(i));
                if (i != 0 && i != numRows - 1) {
                    int k1 = k - 2 * i;
                    int k2 = index + k1;
                    newString.append(s.charAt(k2));
                }
                index = i + k;
            }
        }
        return newString.toString();
    }

    public static void main (String [] args){
        String s = "GSLFKGJSDFLKTWR";
        System.out.println(solution(s, 5));
    }
}
