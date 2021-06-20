import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.Scanner;

// student table queries
public class ManagerQuery 
{
    
    //1. insert -> int
    public int insert()
    {
        int row_insert = 0;
        String fullName,shift;
        int MID;
        double salary;
           
        try
        {
            Connection con = MyConnection.connect();//get connection
            Statement stmt = con.createStatement();
            Scanner sc = new Scanner(System.in); 
            
            System.out.println("Please Enter Manager ID:");
            MID=sc.nextInt();
            
            System.out.println("Please Enter Manager First Name:");
            fullName=sc.next();
            System.out.println("Please Enter Manager Last Name:");
            fullName=fullName+" "+sc.next();
            
            System.out.println("Please Enter Manager Shift (Night,Day,Swing etc:");
            shift=sc.next();
            
            System.out.println("Please enter Salary (numbers only):");
            salary=sc.nextDouble();
            
            
            String qry = "insert into manager values('" + fullName + "' , '" + shift + "' , " + salary +" , " + MID +")";
            //System.out.println(qry);//for testing purposes
            row_insert = stmt.executeUpdate(qry);
            
            System.out.println("Record created for "+ fullName +" (Id: "+MID +")");
        }
        catch(Exception ex)
        {
            System.out.println("Insert Error :"+ex);
        }
        
        return row_insert;
    }
    
    //2. update -> int
    public int updateSalary()
    {
        int row_update = 0;
        double up_sal;
        int mid;
        
        try
        {
            Connection con = MyConnection.connect();//get connection
            Statement stmt = con.createStatement();
            Scanner sc = new Scanner(System.in); 
            
            System.out.println("Please Enter Manager ID:");
            mid=sc.nextInt();
                                 
            System.out.println("Please enter new Salary (numbers only):");
            up_sal=sc.nextDouble();
            
            
            String qry = "update manager set Salary="+up_sal+" where mid="+mid;
            
            row_update = stmt.executeUpdate(qry);
            
            System.out.println("Salary updated for Manager ID "+mid);
        }
        catch(Exception ex)
        {
            System.out.println("Update Error :"+ex);
        }
        
        return row_update;
    }
    
    //3. delete -> int
    public int delete()
    {
        int row_delete = 0;
        int mid;
        try
        {
            Connection con = MyConnection.connect();//get connection
            Statement stmt = con.createStatement();
            Scanner sc = new Scanner(System.in);
            
            System.out.println("Please enter Manager Id to delete:");
            mid=sc.nextInt();
            
            String qry = "delete from Manager where mid="+mid;
            
            row_delete = stmt.executeUpdate(qry);
        }
        catch(Exception ex)
        {
            System.out.println("Delete Error :"+ex);
        }
        
        return row_delete;
    }
    
    //4. select -> void
    public void display()
    {
        try
        {
            Connection con = MyConnection.connect();//get connection
            Statement stmt = con.createStatement();
            
            String qry = "select * from manager";
            
            ResultSet rs = stmt.executeQuery(qry);//return ResultSet-> holds all rows from table
            
            //read all data
            //next() -> check if next row is present
            while(rs.next())
            {
                
                String f = rs.getString(1);
                String l = rs.getString(2);
                double s = rs.getInt(3);
                int i = rs.getInt(4);
                
                System.out.println("MID :"+i);
                System.out.println("NAME :"+f);
                System.out.println("SHIFT :"+l);
                System.out.println("SALARY :"+s);
                
                System.out.println("========================");
                
            }//while ends
            
        }
        catch(Exception ex)
        {
            System.out.println("Display Error :"+ex);
        }
    }
    public void managerMenu()
    {
        int selection=0;
        
        Scanner sc = new Scanner(System.in); 
        while(selection!=5)
        {
            System.out.println("Select Option");
            System.out.println("1.Display all | 2.Insert a record | 3.Delete a record | 4.Update Salary | 5.Quit");
            
            try
                {
                selection = sc.nextInt();
                }
            catch(Exception ex)
                {
                selection=0;// so we get the default behaviour
                sc.nextLine();// to clear for the next input
                }
        switch(selection)
        {
            case 1:
                //1. display all data
                display();
                break;
             case 2:
                //2. insert a record
                insert();
                break;   
            case 3:
                //3. delete a record
                delete();
                break;    
            case 4:
                //4. update a record
                updateSalary();
                break;    
            case 5:
                // don't need to do anything as this will just kill our loop
                break;
            default:// if the input is any other number just loop around (also on error)
                System.out.println("Invalid Choice - please try again");
                
        }// end switch block
        }//end main input loop
    }
}
