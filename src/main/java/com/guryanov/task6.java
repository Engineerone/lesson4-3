package com.guryanov;

public class task6 {
    public static void main(String[] args) {
        System.out.println(delChar("Word", 'W'));
    }
    public static String delChar(String mystring, char mychar) {
        String param1 = "" + mychar;
        mystring = mystring.replace(param1, " ");
        return mystring;
    }
}

