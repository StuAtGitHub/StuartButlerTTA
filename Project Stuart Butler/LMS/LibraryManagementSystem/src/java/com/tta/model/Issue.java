/*

Table Name: Issues
  
  IssuedID integer primary key auto_increment,
  BookIssued int,
  IssuedTo int,
  Foreign key (BookIssued) references Books(BookID),
  Foreign key (IssuedTo) references Members(memberId)
 */

package com.tta.model;


public class Issue {
    
    int BookIssued;
    int IssuedTo;

    public Issue() {
    }

    public Issue(int BookIssued, int IssuedTo) {
        this.BookIssued = BookIssued;
        this.IssuedTo = IssuedTo;
    }

    public int getBookIssued() {
        return BookIssued;
    }

    public void setBookIssued(int BookIssued) {
        this.BookIssued = BookIssued;
    }

    public int getIssuedTo() {
        return IssuedTo;
    }

    public void setIssuedTo(int IssuedTo) {
        this.IssuedTo = IssuedTo;
    }
    
    
    
}
