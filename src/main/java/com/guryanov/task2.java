package com.guryanov;


public class task2 {
    public static void main(String[] args) {
        int[] myarray = {1, 2, 500, 15000, 5, 40};
        int maxnum = findMaxValue(myarray);
        System.out.println("Максимальное число:"+maxnum);
    }
    public static int findMaxValue(int[] myarray) {

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
    return myarray[0];
    }
}
