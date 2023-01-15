package com.guryanov;

public class task7 {
    public static void main(String[] args) {
        System.out.println(delCharArray("This is my Word", 'W','d','i','T','m'));
    }
    public static String delCharArray(String mystring, char...mychar) {

   for (int i=0;i<mystring.length();i++){
       for (char ch:mychar) {
           if (mystring.charAt(i)==ch) {
               String param1 = "" + ch;
               mystring = mystring.replace(param1, " ");
           }
       }
   }

   return mystring;
    }
}

