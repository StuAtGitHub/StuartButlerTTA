
package com.tta.model;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.PreparedStatement;//pre-compile statement
///import java.sql.ResultSet;
///import java.util.ArrayList;


public class MemberQuery {
    
    //1. Insert Student record
    public static int insert(Member s)
    {
        Connection con = MyConnection.connect();
        int row_insert = 0;
        try
        {
            String qry = "insert into members(MemberID,MemberFName,MemberSName) values(?,?,?)";
            PreparedStatement stmt = con.prepareStatement(qry);//query getting pre-compile
            
            //setting column values in student table
            stmt.setInt(1, s.getSid());
            stmt.setString(2, s.getFirstName());
            stmt.setString(3,s.getLastName());
            
            
            //stmt.setBlob(4, s.myPart.getInputStream());
        
            row_insert = stmt.executeUpdate();
            //System.out.println(s.getSid());
            //System.out.println(s.getFirstName());
            //System.out.println(s.getLastName());
            //System.out.println(s.getMyPart().getName());
            

//testing purposes
        }//try ends
        catch(Exception ex)
        {
            System.out.println("Insert error :"+ex);//print error on server logs
        }//catch ends
        
        return row_insert;
        
    }//insert ends
    
    //write method to delete student record by sid
    public static int delete(int sid)
    {
       //code to be added 
        int temp=0;
        
        Connection con= MyConnection.connect();
        try
        {
        Statement myStmt=con.createStatement();
        String qry="delete from members where MemberID="+sid;
         temp=myStmt.executeUpdate(qry);
        }
        catch(Exception ex)
        {
        temp=0;
        System.out.println("Delete error :"+ex);
        }
      return temp;
    }
    
    //write method to update student record(score) by sid
    public static int update(int sid , int score)
    {
        //code to be added
        int temp=0;
        
        Connection con= MyConnection.connect();
        try
        {
        Statement myStmt=con.createStatement();
        String qry="update members set score="+score+" where sid="+sid;
         temp=myStmt.executeUpdate(qry);
        }
        catch(Exception ex)
        {
        temp=0;
        System.out.println("Update error :"+ex);
        }
      return temp;
    }
    
    
}//class ends
