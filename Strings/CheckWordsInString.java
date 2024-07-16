package com.java.Strings;

public class CheckWordsInString {
    static int Words(String Str1) {
        int Words = 0;
        boolean inWord = false;
        for (int i = 0; i < Str1.length(); i++) {
            char Word = Str1.charAt(i);
            if (Word == ' ') {
                Words++;
                inWord = false;
            } else {
                inWord = true;
            }
        }
        if (inWord) Words++;

        return Words;
    }

    public static void main(String[] args) {
       int  Words = CheckWordsInString.Words("hello world pavan tataji deekshith");
        System.out.println("WORDS CONTAINS IN STRING: "+Words);
    }
}
