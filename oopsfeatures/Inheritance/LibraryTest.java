package com.java.oopsfeatures.Inheritance;

public class LibraryTest {
    public static void main(String[] args) {
        EBook ebook = new EBook("THE sun","Williams",27.8);
        PrintedBook printedBook=new PrintedBook("THE moon","Shakesphere",280);

        ebook.displayFileSize();

        System.out.println();

        printedBook.displayNumPages();
    }
}
