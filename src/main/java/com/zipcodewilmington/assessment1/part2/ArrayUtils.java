package com.zipcodewilmington.assessment1.part2;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by leon on 2/16/18.
 */
public class ArrayUtils {
    /**
     * @param objectArray   an array of any type of Object
     * @param objectToCount any non-primitive value
     * @return the number of times the specified `value` occurs in the specified `objectArray`
     * Given an array of objects, named `objectArray`, and an object `objectToCount`, return the number of times the `objectToCount` appears in the `objectArray`
     */
    public static Integer getNumberOfOccurrences(Object[] objectArray, Object objectToCount) {
        Integer counter = 0;
        for (Object x : objectArray){
            if (x == objectToCount){
                counter++;
            }
        }
        return counter;
//        return null;
    }

    /**
     * @param objectArray    an array of any type of Object
     * @param objectToRemove a value to be removed from the `objectArray`
     * @return an array with identical content excluding the specified `objectToRemove`
     * Given an array of objects, name `objectArray`, and an object `objectToRemove`, return an array of objects with identical contents excluding `objectToRemove`
     */
    public static Object[] removeValue(Object[] objectArray, Object objectToRemove) {
//        ArrayList<Object> newList = new ArrayList<>();
//
//        for (Object x : objectArray){
//            if (x != objectToRemove){
//                newList.add(x);
//            }
//        }
//        Object[] solution = newList.toArray(new Object[0]);
//        return solution;
//        return null;



            ArrayList<Object> arr_new = new ArrayList<>();
            for(int i=0;i<objectArray.length;i++){
                if(!objectArray[i].equals(objectArray)){
                    arr_new.add(objectArray[i]);

                }
            }
                Object[] solution = arr_new.toArray(new Object[0]);

return solution;
    }

    /**
     * @param objectArray an array of any type of Object
     * @return the most frequently occurring object in the array
     * given an array of objects, named `objectArray` return the most frequently occuring object in the array
     */
    public static Object getMostCommon(Object[] objectArray) {

        int count = 1, tempCount;
        Object popular = objectArray[0];
        Object temp;
        for (int i = 0; i < (objectArray.length - 1); i++){
            temp = objectArray[i];
            tempCount = 0;
            for (int j = 1; j < objectArray.length; j++){
                if (temp == objectArray[j]){
                    tempCount++;
                }
                if (tempCount > count){
                    popular = temp;
                    count = tempCount;
                }
            }
        }
        return popular;






//        return null;
    }


    /**
     * @param objectArray an array of any type of Object
     * @return the least frequently occurring object in the array
     * given an array of objects, named `objectArray` return the least frequently occuring object in the array
     */
    public static Object getLeastCommon(Object[] objectArray) {
//    Object[] results = new Object[objectArray.length];
//    int minCount = Integer.MAX_VALUE;
//    for (int i = 0; i < objectArray.length; i++){
//        for (int j = 0; j < objectArray.length; j++){
//            if (objectArray[j] == objectArray[i]){
//                results[i]++;
//            }
//        }
//    }

        int count = 1, tempCount;
        Object popular = objectArray[0];
        Object temp;
        for (int i = 0; i < (objectArray.length - 1); i++){
            temp = objectArray[i];
            tempCount = 0;
            for (int j = 1; j < objectArray.length; j++){
                if (temp == objectArray[j]){
                    tempCount++;
                }
                if (tempCount < count){
                    popular = temp;
                    count = tempCount;
                }
            }
        }
        return popular;


    }

    /**
     * @param objectArray      an array of any type of Object
     * @param objectArrayToAdd an array of Objects to add to the first argument
     * @return an array containing all elements in `objectArray` and `objectArrayToAdd`
     * given two arrays `objectArray` and `objectArrayToAdd`, return an array containing all elements in `objectArray` and `objectArrayToAdd`
     */
    public static Object[] mergeArrays(Object[] objectArray, Object[] objectArrayToAdd) {
////        Object[] solution = ArrayUtils.addAll(objectArray, objectArrayToAdd);
//        Object[] combinedArr = new Object[objectArrayToAdd.length + objectArray.length];
//        int index = objectArrayToAdd.length;
//        for (int i = 0; i < objectArrayToAdd.length; i++){
//            combinedArr[i] = objectArrayToAdd[i];
//        }
//        for (int i = 0; i < objectArray.length; i++){
//            combinedArr[i + index] = objectArray[i];
//        }
//        return combinedArr;

//        ArrayList<Object> list = new ArrayList<>();
//
//        list.addAll(Arrays.asList(objectArray));
//
//        list.addAll(Arrays.asList(objectArrayToAdd));
//
//        Object[] answer = list.toArray(new Object[0]);
//        return answer;


        Object[] result = new Object[objectArray.length + objectArrayToAdd.length];
        int index = 0;
        for (Object item : objectArray){
            result[index++] = item;
        }
        for (Object item : objectArrayToAdd){
            result[index++] = item;
        }
        return result;

    }
}
