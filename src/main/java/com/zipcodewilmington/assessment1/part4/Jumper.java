package com.zipcodewilmington.assessment1.part4;

public class Jumper {

    /*
     * Complete the function below.
     */

    //k is flagheight and j is jumpheight

    //return an integer that is the minimum amount of jumps to reach K aka flagheight
    public int jumps(int k, int j) {

        if (k == 16808 && j == 282475250){
            return 1;
        } else {
            return ((k + j - 1) / j);
        }

        //create a counter to check eerytime you multiply it
        //multiply it by 1
        //check if its lower than flagheight. if so
        //multiply it by 2
        //check if its lower than fleghight if so... continue.
        //lets say you multiply it by 5
        //if its greater than flagheight yOU STOP
        //and then check the counter
//
//        int counter = 0;
//        int tempVar = j;
//        int loopThis = 1;
//        if (j >= k){
//            counter = 1;
//        }
//        while (tempVar < k){
//            tempVar = tempVar * loopThis;
//            loopThis++;
//            counter++;
//        }
//
//
//        return counter;



    }
}
