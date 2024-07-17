package com.java.oopsfeatures.Inheritance;

public class Book {
    String title;
    String auther;

   public Book(){

    }

   public Book(String title,String auther){
        this.title=title;
        this.auther=auther;
    }

    void displayInfo(){
        System.out.println("Book Title:"+title);
        System.out.println("Book auther:"+auther);
    }
}
