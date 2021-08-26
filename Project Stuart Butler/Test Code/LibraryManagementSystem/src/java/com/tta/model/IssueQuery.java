
package com.tta.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;


public class IssueQuery {
     //Issue Book 
    
    public static int issueBook(Issue i){
        Connection con = MyConnection.connect();
        int issueBook_update = 0;
        try{
            
            String qry = "insert into Issues (BookIssued,IssuedTo) values(?,?)";
            PreparedStatement stmt = con.prepareStatement(qry);
            
            stmt.setInt(1, i.getBookIssued());
            stmt.setInt(2, i.getIssuedTo());
            
            issueBook_update = stmt.executeUpdate();
            
        }//try ends
        catch(Exception ex){
            
            System.out.println("Book issue error: "+ex);
            
        }//catch ends
        
        return issueBook_update;
       
    }


    //Return Book
    
    public static int returnBook(int BookIssued, int IssuedTo){
        int returnBook_update = 0;
        try{
            
            Connection con = MyConnection.connect();
            Statement stmt = con.createStatement();
            
            String qry = "delete from Issues where BookIssued="+BookIssued+" and IssuedTo="+IssuedTo;
            
            returnBook_update = stmt.executeUpdate(qry);
            
        }//try ends
        catch(Exception ex){
            
            System.out.println("Delete Error: "+ex);
            
        }//catch ends
        
        return returnBook_update;
    }
}
