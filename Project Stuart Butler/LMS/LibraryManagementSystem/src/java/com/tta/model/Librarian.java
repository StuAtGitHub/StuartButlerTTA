/*
Table name: Librarians
 
        LibrarianID integer primary key,
        LibrarianFName varchar(50),
        LibrarianSName varchar(50),
        LibrarianImage mediumblob,
        LibrarianUName varchar(50),
        LibrarianPassword varchar(50)
 */

package com.tta.model;

import java.sql.Blob;

    

public class Librarian {
    
    int LibrarianID;
    String LibrarianFName;
    String LibrarianSName;
    Blob LibrarianImage;
    String LibrarianUName;
    String LibrarianPassword;

    public Librarian() {
    }

    public Librarian(int LibrarianID, String LibrarianFName, String LibrarianSName, Blob LibrarianImage, String LibrarianUName, String LibrarianPassword) {
        this.LibrarianID = LibrarianID;
        this.LibrarianFName = LibrarianFName;
        this.LibrarianSName = LibrarianSName;
        this.LibrarianImage = LibrarianImage;
        this.LibrarianUName = LibrarianUName;
        this.LibrarianPassword = LibrarianPassword;
    }

    public int getLibrarianID() {
        return LibrarianID;
    }

    public void setLibrarianID(int LibrarianID) {
        this.LibrarianID = LibrarianID;
    }

    public String getLibrarianFName() {
        return LibrarianFName;
    }

    public void setLibrarianFName(String LibrarianFName) {
        this.LibrarianFName = LibrarianFName;
    }

    public String getLibrarianSName() {
        return LibrarianSName;
    }

    public void setLibrarianSName(String LibrarianSName) {
        this.LibrarianSName = LibrarianSName;
    }

    public Blob getLibrarianImage() {
        return LibrarianImage;
    }

    public void setLibrarianImage(Blob LibrarianImage) {
        this.LibrarianImage = LibrarianImage;
    }

    public String getLibrarianUName() {
        return LibrarianUName;
    }

    public void setLibrarianUName(String LibrarianUName) {
        this.LibrarianUName = LibrarianUName;
    }

    public String getLibrarianPassword() {
        return LibrarianPassword;
    }

    public void setLibrarianPassword(String LibrarianPassword) {
        this.LibrarianPassword = LibrarianPassword;
    }
    
    
    
}
