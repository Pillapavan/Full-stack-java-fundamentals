package com.java.Strings;
import java.util.Arrays;
/*2. Write a Java Program to check if two Strings are anagrams or
not?*/
public class Anagrams {
    static boolean checkIsAnagram(String Object1,String Object2){
        Object1=Object1.toLowerCase().replaceAll("[^a-z]","");
        Object2=Object2.toLowerCase().replaceAll("[^a-z]","");
        char[] String1=Object1.toCharArray();
        char[] String2=Object2.toCharArray();
        Arrays.sort(String1);
        Arrays.sort(String2);

      return Arrays.equals(String1,String2) ;
    }

    public static void main(String[] args) {
      boolean isAnagram=Anagrams.checkIsAnagram("Listen","Silent");
      if (isAnagram){
          System.out.println("The given two strings are Anagram: "+ isAnagram);
        }
      else{
          System.out.println("The given two strings are Anagram: "+ isAnagram);
      }

    }
}
