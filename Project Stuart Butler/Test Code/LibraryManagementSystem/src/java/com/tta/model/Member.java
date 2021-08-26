
package com.tta.model;
import java.sql.Blob;
import javax.servlet.http.Part;

public class Member {
    int sid;
    String firstName;
    String lastName;
    //Part myPart;
    //default Constructor
    public Member() {
    }

    //parameter constructor
    public Member(int sid, String firstName, String lastName) {
        this.sid = sid;
        this.firstName = firstName;
        this.lastName = lastName;
        //this.myPart=myPart;
    }

   
    
    //getter and setter
    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    
    
        
        
}//class ends
