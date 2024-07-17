package com.java.oopsfeatures.Inheritance;

public class PrintedBook extends Book {
    int numPages;

    PrintedBook(String title,String auther,int numPages){
       super(title,auther);
        this.numPages=numPages;
    }
    void displayNumPages(){
        super.displayInfo();
        System.out.println("Book Pages:"+numPages);
    }

}
