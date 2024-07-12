package com.java.Static_And_Constructors;

public class Library {
    //Instance Variables: bookTitle (String), author (String).
    String bookTitle;
    String Author;

    //Static Variables: libraryName (String)
    final  static String LIBRARYNAME ="College Library";

    //Default Constructor
    Library(){
        bookTitle="unknown";
        Author="unknown";
    }

    //Parameterized Constructor
    Library(String bookTitle,String Author){
        this.bookTitle=bookTitle;
        this.Author=Author;
    }

    //Static Method
    static void getLibraryName(){
        System.out.println("Library Name:"+ LIBRARYNAME);

    }

    //Instance Method
    void  displayBookInfo(){
        System.out.println("Book Title:"+bookTitle);
        System.out.println("Auther Name:"+Author);
    }

}
