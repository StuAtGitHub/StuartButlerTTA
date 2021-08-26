
package test;

import com.tta.model.MyConnection;
import java.sql.Connection;//to test DB Connection

public class Test {
    public static void main(String[] args) {
        
        try
        {
            Connection con = MyConnection.connect();
            if(con != null)
            {
                System.out.println("Connection ok");
            }//if ends
            
        }//try ends
        catch(Exception ex )
        {
            System.out.println("DB Error :"+ex);
        }//catch ends
                
        
    }//main ends
}//class ends
