package org.example;

import javax.print.DocFlavor;
import java.util.Map;

public class RomantoInteger {
    private static Map<Character, Integer> ROMAN_INTEGER = Map.of(
            'I',1,
            'V',5,
            'X',10,
            'L',50,
            'C',100,
            'D',500,
            'M',1000
    );
    public int solution (String s){
        int sum = 0;
        int i =0;
        for (i = 0; i<= s.length()-1; i++) {
            sum += checkNextCharacter(s.charAt(i), s.charAt(i+1));
        }
        sum += RomantoInteger.ROMAN_INTEGER.get(i);
        return sum;
    }
    private int checkNextCharacter (Character current, Character next){
        if (current == 'I' && (next == 'V' || next == 'X')){
            return -1;
        }
        else if (current == 'X' && (next == 'L' || next == 'C')){
            return -10;
        } else if (current == 'C' && ( next == 'D' || next == 'M')) {
            return -100;
        }
        else {
            return RomantoInteger.ROMAN_INTEGER.get(current);
        }
    }


}
