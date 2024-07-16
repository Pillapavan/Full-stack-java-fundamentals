package com.java.Strings;

public class ConcatenateStrings {
    static String Concatenate(String str1,String str2){
        StringBuffer Result=new StringBuffer();
        for (int i=0;i<str1.length();i++){
            Result.append(str1.charAt(i));
        }
        for (int j=0;j<str2.length();j++){
            Result.append(str2.charAt(j));
        }
        return Result.toString();
    }

    public static void main(String[] args) {
      String Result =  ConcatenateStrings.Concatenate("Pavan ","kumar");
        System.out.println(Result);
    }
}
