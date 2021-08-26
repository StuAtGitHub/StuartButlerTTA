Create database LibraryProjectDB;
use libraryprojectdb;

create table Administrators
(
AdminID integer primary key,
 AdminFName varchar(50),AdminSName varchar(50),
 AdminUname varchar(50),Adminpassword varchar(50)
 );
 
 create table Librarians
 (
 LibrarianID integer primary key,
 LibrarianFName varchar(50),LibrarianSName varchar(50),
 LibrarianUName varchar(50),LibrarianPassword varchar(50)
  );
  
  create table Members
  (
  MemberID integer primary key,
  MemberFName varchar(50), MemberSName varchar(50)
 );
  
  create table Books
  (
  BookID integer primary key,
  BookTitle varchar(100),
  BookAuthor varchar(50),
  BookCopiesIn integer,BookCopiesOut integer
  );
  
  create table Issues
  (
  IssuedID integer primary key auto_increment,
  BookIssued int,
  IssuedTo int,
  Foreign key (BookIssued) references Books(BookID),
  Foreign key (IssuedTo) references Members(memberId)
  );
 