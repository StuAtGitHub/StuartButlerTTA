
package com.tta.model;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.PreparedStatement;//pre-compile statement
import java.sql.ResultSet;
import java.util.ArrayList;


public class StudentQuery {
    
    //1. Insert Student record
    public static int insert(Student s)
    {
        Connection con = MyConnection.connect();
        int row_insert = 0;
        try
        {
            String qry = "insert into student(sid,firstName,lastName,score) values(?,?,?,?)";
            PreparedStatement stmt = con.prepareStatement(qry);//query getting pre-compile
            
            //setting column values in student table
            stmt.setInt(1, s.getSid());
            stmt.setString(2, s.getFirstName());
            stmt.setString(3,s.getLastName());
            stmt.setInt(4, s.getScore());
        
            row_insert = stmt.executeUpdate();
            
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
        String qry="delete from student where sid="+sid;
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
        String qry="update student set score="+score+" where sid="+sid;
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
