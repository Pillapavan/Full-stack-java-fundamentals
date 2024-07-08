package com.java.loops;

public class PatternExample {
    static void Pattern(int asciiValue, char ch) {
        int midIndex = asciiValue-'A';
        for (int i = 0; i <= midIndex; i++)//rows
        {
            char temp=ch;
            for (int j = 0; j <= midIndex-i; j++) {
                if ((int)temp<=asciiValue) {
                    System.out.print(temp + " ");
                    if ((int)temp<asciiValue) {
                        temp++;
                    }
                    else{
                        temp--;
                    }
                }
            }
                for (int k = 1; k <= 2 * i - 1; k++) {
                    System.out.print("  ");
                }
                if(i>0) {
                    temp--;
                }
                for (int l = 0; l <= midIndex-i; l++) {
                    System.out.print(temp + " ");
                    temp--;
                   if ((int)temp<(int)ch){
                       break;
                   }
                }

            System.out.println();


        }
    }
    public static void main(String[] args) {
         Pattern(70,'A');
    }
}
