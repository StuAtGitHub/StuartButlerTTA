/*
BookID integer primary key,
    BookTitle varchar(100),
    BookAuthor varchar(50),
    BookImage mediumblob,
    BookCopiesIn integer,
    BookCopiesOut integer
 */
package com.tta.model;

import java.sql.Blob;


public class Book {
    
    int BookID;
    String BookTitle;
    String BookAuthor;
    Blob BookImage;
    int BookCopiesIn;
    int BookCopiesOut;

    public Book() {
    }

    public Book(int BookID, String BookTitle, String BookAuthor, Blob BookImage, int BookCopiesIn, int BookCopiesOut) {
        this.BookID = BookID;
        this.BookTitle = BookTitle;
        this.BookAuthor = BookAuthor;
        this.BookImage = BookImage;
        this.BookCopiesIn = BookCopiesIn;
        this.BookCopiesOut = BookCopiesOut;
    }

    public int getBookID() {
        return BookID;
    }

    public void setBookID(int BookID) {
        this.BookID = BookID;
    }

    public String getBookTitle() {
        return BookTitle;
    }

    public void setBookTitle(String BookTitle) {
        this.BookTitle = BookTitle;
    }

    public String getBookAuthor() {
        return BookAuthor;
    }

    public void setBookAuthor(String BookAuthor) {
        this.BookAuthor = BookAuthor;
    }

    public Blob getBookImage() {
        return BookImage;
    }

    public void setBookImage(Blob BookImage) {
        this.BookImage = BookImage;
    }

    public int getBookCopiesIn() {
        return BookCopiesIn;
    }

    public void setBookCopiesIn(int BookCopiesIn) {
        this.BookCopiesIn = BookCopiesIn;
    }

    public int getBookCopiesOut() {
        return BookCopiesOut;
    }

    public void setBookCopiesOut(int BookCopiesOut) {
        this.BookCopiesOut = BookCopiesOut;
    }
    
    
    
}
