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
        int sum = 0;
        for (int i = n; i >= 0; i--){
            sum += i;
        }
        return sum;
//        return null;
    }

    /**
     * @param n integer value input by client
     * @return the product of all integers between 0 and not including `n`
     */
    public static Integer getProductOfN(Integer n) {
        int sum = 1;
        for (int i = n; i >= 1; i--){
            sum *= i;
        }
        return sum;
//        return null;
    }

    /**
     * @param val integer value input by client
     * @return integer with identical digits in the reverse order
     */
    public static Integer reverseDigits(Integer val) {
        StringBuilder reversedVal = new StringBuilder(String.valueOf(val));
        reversedVal.reverse();
        int solution = Integer.valueOf(reversedVal.toString());
        return solution;
//        return null;
    }
}
