package com.zipcodewilmington.assessment1.part5;

import java.util.ArrayList;
import java.util.List;

public class Palindrome {

    public static Integer countPalindromes(String input){
        ArrayList<String> list = new ArrayList<>();
//
//        for (int i = 0; i < input.length(); i++){
//            for (int j = i + 1; j < input.length(); i++){
//                System.out.println(input.substring(i,j));
//            }
//        }
//
//        return null;

//
//        int charCount = input.length();
//        int powSize = (int)Math.pow(2, charCount);
//        List<String> result = new ArrayList<>();
//
//        for (int i = 1; i < powSize; i++) {
//            StringBuilder sb = new StringBuilder();
//            for (int j = 0; j < charCount; j++) {
//                if ((i & (1 << j)) != 0) {
//                    sb.append(input.charAt(j));
//                }
//            }
//            result.add(sb.toString());
//        }
//        System.out.println(result);
//
//        return null;


        int length = input.length();
        for (int i = 0; i < length; i++ ){
            for (int j = i + 1; j <= length; j++){
                String result = input.substring(i,j);
                list.add(result);
            }
        }
        System.out.println(list);
//        return null;

        //reverse a string
//        String test = "";
//        for (int i = 0; i < str.length(); i++){
//            test = str.charAt(i) + test;
//        }

        int counter = 0;
        for (String x : list){
            String test = "";
            for (int i = 0; i < x.length(); i++){
                test = x.charAt(i) + test;
            }
            if (x.equals(test)) {
                counter++;
            }
        }

        return counter;



    }


}
