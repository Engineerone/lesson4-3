package com.guryanov;
public class task8 {
    public static void main(String[] args) {
        int[] myarray = {1, 1, 7, 4, 1};
        if (getElement(myarray)) System.out.println(true); else System.out.println(false);
    }

    public static boolean getElement (int...myarray)
    {
        boolean elementfind = false;
        for (int i = 0; i < myarray.length; i++) {
            int temp = myarray[i];
            myarray[i] = 0;
            if (temp == getArraySum(myarray)) {
                System.out.println(i + 1 + "й элемент равен сумме остальных цифр массива");
                elementfind = true;
            }
            myarray[i] = temp;

        }
        return elementfind;
    }
    public static int getArraySum(int... array) {
        int sum = 0;
        for (int i : array)
            sum += i;
        return sum;
    }
}
