package com.java.primitivedatatypes;

public class Conversions {
    public static void main(String[] args) {
        //Automatic Conversion or implicit
        //conversion
        int companyProfits = 23445;
        double companyIncome = companyProfits ;
        System.out.println("conversion before:"+ companyProfits);
        System.out.println("conversion after" + companyIncome);


        //explicit casting.
        double customerExpensive = 23251.56;
        int approximateExpensives = (int)customerExpensive;
        System.out.println("customerExpensives:"+ customerExpensive);
        System.out.println("approximateExpensives:" + approximateExpensives);


        //character conversion
        char Gender = 'F';
        int genderUnicode = (int)Gender;
        System.out.println("genderunicode:"+genderUnicode);

        //unicode to character conversion
        int uniCode = 165;
        char unicodeCharacter = (char)uniCode;
        System.out.println("unicodecharacter:"+unicodeCharacter);
    }
}
