package com.zipcodewilmington.assessment1.part1;
/**
 * Created by leon on 2/16/18.
 */
public class BasicStringUtils {
    /**
     * @param str string input from client
     * @return string with identical content, and the first character capitalized
     */
    public static String camelCase(String str) {
        String capStr = str.substring(0,1).toUpperCase() + str.substring(1);
        return capStr;
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in the reverse order
     */
    public static String reverse(String str) {
        String test = "";
        for (int i = 0; i < str.length(); i++){
            test = str.charAt(i) + test;
        }
        return test;

//        return null;
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in reverse order, with first character capitalized
     */
    public static String reverseThenCamelCase(String str) {
        String test = "";
        for (int i = 0; i < str.length(); i++){
            test = str.charAt(i) + test;
        }
        String solution = test.substring(0,1).toUpperCase() + test.substring(1);
        return solution;
//        return null;
    }


    /**
     * @param str a string input from user
     * @return string with identical contents excluding first and last character
     */
    public static String removeFirstAndLastCharacter(String str) {
        String str1 = str.substring(1,str.length() - 1);
        return str1;
//        return null;
    }

    /**
     * @param str a string input from user
     * @return string with identical characters, each with opposite casing
     */
    public static String invertCasing(String str) {
        char[] charArr = str.toCharArray();
        for (int i = 0; i < charArr.length; i++){


            char x = charArr[i];
            if (Character.isUpperCase(x)) {

                charArr[i] = Character.toLowerCase(x);
            } else if (Character.isLowerCase(x)) {

                charArr[i] = Character.toUpperCase(x);
            }


        }
        return new String(charArr);
//        return null;
    }
}
