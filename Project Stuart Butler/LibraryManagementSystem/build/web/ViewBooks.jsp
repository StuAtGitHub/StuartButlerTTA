<%@page import="java.sql.Connection"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="com.tta.model.MyConnection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Display</title>
    </head>
    <body>
         
        <jsp:include page="Books.jsp"/>
        
        <h1>Current Library</h1>
        
        <!--Database code to display all records-->
        <%
            try
            {
                
                Connection con = MyConnection.connect();//get connection
                Statement stmt = con.createStatement();//create statement
                String qry = "select * from Books";//select query to display all records
                ResultSet rs = stmt.executeQuery(qry);//execute query
        %>   
        <table border="1">
            <tr>
                <th>ID</th>
                <th>Title</th>
                <th>Author</th>   
                <th>Copies held</th>
                <th>Copies issued</th>
                <th>Cover</th>
            </tr>
        <%    
                //get one by one record from ResultSet
                while(rs.next())
                {
        %>            
                    <tr>
                        <td><%= rs.getInt(1)%></td>
                        <td><%= rs.getString(2)%></td>
                        <td><%= rs.getString(3)%></td> 
                        <td><%= rs.getInt(5)%></td>
                        <td><%= rs.getInt(6)%></td>
                        <td><img alt="No image on file" src="images/bookimages/BookImageForBID<%=rs.getInt(1)%>.jpg"/></td>
                        <td>
                            
                        </td>
                    </tr>
        <%
                    
                }//while ends
        %>
        </table>        
        <%        
            }//try ends
            catch(Exception ex)
            {
                out.println("Display error :"+ex);
            }//catch ends
        
        %>
       
    </body>
</html>
