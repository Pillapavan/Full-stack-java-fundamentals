package com.java.oopsfeatures.Inheritance;

public class EBook extends Book {
    double fileSize;

    public EBook(String title,String auther, double fileSize){
        super(title,auther);
        this.fileSize=fileSize;
    }
    void displayFileSize(){
        super.displayInfo();
        System.out.println("fileSize:"+fileSize);

    }
}
