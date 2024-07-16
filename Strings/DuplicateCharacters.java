package com.java.Strings;

public class DuplicateCharacters {
    static  void duplicateCharacter(String customerName) {
             customerName=customerName.toLowerCase();
             char[] Duplicates=customerName.toCharArray();
             int Count;
        for(int i=0;i<customerName.length();i++){
            Count=1;
            for (int j=i+1;j<customerName.length();j++){
                if (Duplicates[i]==Duplicates[j] && Duplicates[i]!=' '){
                   Count++;
                   Duplicates[j]='0';

                }

            }

             if (Count>1&&Duplicates[i] != '0'){
            System.out.println(Duplicates[i]);
          }
        }
    }

    public static void main(String[] args) {
        DuplicateCharacters.duplicateCharacter("Tataji");

    }
}
