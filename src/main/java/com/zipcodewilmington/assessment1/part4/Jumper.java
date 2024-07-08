package com.zipcodewilmington.assessment1.part4;

public class Jumper {

    /*
     * Complete the function below.
     */

    //k is flagheight and j is jumpheight

    //return an integer that is the minimum amount of jumps to reach K aka flagheight
    public int jumps(int k, int j) {

        int counter = 0;
            if (j >= k){
                counter = 1;
            } else {
                for (int i = 1; i < (k * k); i++){
                    int temp = j * i;
                    counter++;
                    if (temp >= k){
                        break;
                    }
                }
            }
            return counter;

//
//
//        int temp = j;
//        int counter = 0;
//
//        if (j >= k){
//            counter = 1;
//        }
//
//
//        else {
//            for (int i = 1; temp == k; i++) {
//                temp = j * i;
//                counter++;
//            }
//        }
//        return counter;

//        int x = k;
//        int y = j;
//        int jumps = (x + y - 1) / y;
//        return jumps;

//        Integer solution = (int) Math.ceil((double)(k / j));
//        return solution;



        //create a counter to check eerytime you multiply it
        //multiply it by 1
        //check if its lower than flagheight. if so
        //multiply it by 2
        //check if its lower than fleghight if so... continue.
        //lets say you multiply it by 5
        //if its greater than flagheight yOU STOP
        //and then check the counter



//        return -1;
    }
}
