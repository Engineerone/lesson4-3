package com.guryanov;


public class task5 {
    public static void main(String[] args) {
        int[] myarray = {1, 2, 500, 300, 5, 40, 6, 7, 8, 9, 3, 0};
        int[] sortarray = doSortArray(myarray);
        for (int i : sortarray) System.out.println(i);
    }

    public static int[] doSortArray(int[] myarray) {
        boolean sorted = false;
        int temp;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < myarray.length - 1; i++) {
                if (myarray[i] < myarray[i + 1]) {
                    temp = myarray[i];
                    myarray[i] = myarray[i + 1];
                    myarray[i + 1] = temp;
                    sorted = false;
                }
            }
        }
        return myarray;
    }
}