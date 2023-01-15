package com.guryanov;

public class task9 {
    public static void main(String[] args) {
        String myword = "АнтОнААЯЯшшш_12334#$%";
        String mywordLC= myword.toLowerCase();
        System.out.println(wordCheck(mywordLC));
    }
    public static String wordCheck(String myword) {
        char[] vowels = {'а', 'у', 'о', 'ы', 'и', 'э', 'я', 'ю', 'ё', 'е'};
        char[] consonant = {'б','в','г','д','ж','з','й','к','л','м','н','п','р','с','т','ф','х','ц','ч','ш','щ'};
        char[] stringtoarray = myword.toCharArray();
        int result = 0;
        int vowelsqty = 0;
        //int anotheqty = 0;
        int consonantqty =0;

        for (char ch : stringtoarray) {
            if (Character.isLetter(ch)) {
                for (char abc : vowels)
                    if (ch == abc) vowelsqty++;
                for (char abc:consonant)
                    if (ch==abc) consonantqty++;
            }
        }

        System.out.println("Гласных: " + vowelsqty);
        System.out.println("Согласных: " + consonantqty);

        if (vowelsqty > consonantqty) return ("Гласных больше");
        else if (vowelsqty > consonantqty) return ("Согласных больше");
        else return ("Одинаково");
    }
}
















