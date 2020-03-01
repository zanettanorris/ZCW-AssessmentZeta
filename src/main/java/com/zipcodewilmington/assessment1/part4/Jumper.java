package com.zipcodewilmington.assessment1.part4;

public class Jumper {

    /*
     * Complete the function below.
     */
    public int jumps(int k, int j) {
//       int jumps = 0;
//        if (k < j){
//            jumps = k;}
//        else if (k == j){
//            jumps = 1;}
//        else if ( k % j == 0){
//            jumps = k / j; }
//         if ( k % j != 0) {
//        int jumps = k / j + k%j;}
//        All this over-complication refactors to:

           int jumps = k / j + k%j;

        return jumps;
        }
    }

