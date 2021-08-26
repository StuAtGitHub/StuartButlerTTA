
package com.tta.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;


public class LibrarianQuery {
    
    
    
    
    
    //Update Librarian Username & Password
    public static int update(String LibrarianUName, String LibrarianPassword, int LibrarianID){
        int row_update = 0;
        try{
            Connection con = MyConnection.connect();
            Statement stmt = con.createStatement();
            
            String qry = "update Librarians set LibrarianUName='"+LibrarianUName+"' ,LibrarianPassword='"+LibrarianPassword+"' where LibrarianID='"+LibrarianID+"'";
            
            row_update = stmt.executeUpdate(qry);
            
        }//try ends
        catch(Exception ex){
            System.out.println("Update Error: "+ex);
        }//catch ends
       
        return row_update;
    }
    
    
    //Delete Librarian
    
    public static int delete(int LibrarianID){
        int row_delete = 0;
        try{
            
            Connection con = MyConnection.connect();
            Statement stmt = con.createStatement();
            
            String qry = "delete from Librarians where LibrarianID="+LibrarianID;
            
            row_delete = stmt.executeUpdate(qry);
            
        }//try ends
        catch(Exception ex){
            
            System.out.println("Delete Error: "+ex);
            
        }//catch ends
        
        return row_delete;
        
    }//delete ends
    
    
}
