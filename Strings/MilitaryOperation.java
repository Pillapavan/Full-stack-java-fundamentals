package com.java.Strings;
/*In a military operation, communication security is paramount. Messages containing critical information
about potential threats from terrorists need to be transmitted securely and decoded accurately by military officers.*/

class MilitaryOperation {
    static String Reversed(String deCodeMessage){
        char[] deCoder;
        deCoder = deCodeMessage.toCharArray();
        int left=0;
        int Right=deCoder.length-1;
            while(left<Right){
               char Temp=deCoder[left];
                deCoder[left]=deCoder[Right];
                deCoder[Right]=Temp;
                left++;
                Right--;
            }

        return new String(deCoder);
    }

    public static void main(String[] args) {
        String Information= MilitaryOperation.Reversed("REGNAD");
        System.out.println("DECODE message:"+Information);
    }
}
