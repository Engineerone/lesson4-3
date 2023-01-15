package com.guryanov;

import java.util.Random;

public class task1 {
    public static void main(String[] args) {
        int[] myarray = createRandomArray(15);
        for (int x:myarray) System.out.println(x);
    }
    public static int[] createRandomArray(int s) {
        int[] myarray = new int[s];
        for (int i= 0; i < myarray.length; i++){
            myarray[i] = new Random().nextInt(100 - 0);}
        return myarray;
    }
}



