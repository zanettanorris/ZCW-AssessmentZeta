package com.zipcodewilmington.assessment1.part5;

public class Palindrome {

    public Integer countPalindromes(String input) {
        Integer total = 0;
        int r = (input.length() )- 1;
        for (int i = 0; i < input.length()/2; i++, r--)
            if (input.charAt(i) == input.charAt(r)) ;
            total += 1;

        return total;
    }
}