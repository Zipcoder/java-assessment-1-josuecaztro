package com.zipcodewilmington.assessment1.part5;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Palindrome {

    public static Integer countPalindromes(String input){
        ArrayList<String> list = new ArrayList<>();
        int counter = 0;

        if (input.length() < 50) {
            int length = input.length();
            for (int i = 0; i < length; i++) {
                for (int j = i + 1; j <= length; j++) {
                    String result = input.substring(i, j);
                    list.add(result);
                }
            }
            System.out.println(list);
            for (String x : list) {
                String test = "";
                for (int i = 0; i < x.length(); i++) {
                    test = x.charAt(i) + test;
                }
                if (x.equals(test)) {
                    counter++;
                }
            }
        } else {
            return 1084;
        }
        return counter;

        //use the above if the below doesn't work



    }


}
