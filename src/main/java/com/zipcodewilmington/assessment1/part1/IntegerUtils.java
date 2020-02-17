package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class IntegerUtils {


    /**
     * @param n integer value input by client
     * @return the sum of all integers between 0 and not including `n`
     */
    public static Integer getSumOfN(Integer n) {
        Integer sum =0;
        for (Integer i=1;  i<= n;  i++)
        sum += i;
        return sum;
    }


    /**
     * @param n integer value input by client
     * @return the product of all integers between 0 and not including `n`
     */
    public static Integer getProductOfN(Integer n) {
            Integer product =1;
            for (Integer i=1;  i<= n;  i++)
                product *= i;
            return product;
    }

    /**
     * @param val integer value input by client
     * @return integer with identical digits in the reverse order
     */
    public static Integer reverseDigits(Integer val) {
      int rev =0;
        while(val != 0) {
            int digit = val % 10;
            rev = rev * 10 + digit;
            val /= 10;
        }
        return rev;}
    }

