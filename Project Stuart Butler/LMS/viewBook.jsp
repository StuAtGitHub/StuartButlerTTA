<%-- 
    Document   : viewBook
    Created on : 28 Jul, 2021, 10:54:35 PM
    Author     : vaibh
--%>

<%@page import="java.io.*"%>
<%@page import="java.sql.*"%>
<%@page import="com.tta.model.MyConnection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <%
            try{
        Connection con = MyConnection.connect();
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("select * from books");
        
                int bookID,bookIn,bookOut;
                String bookName,bookAuthor;
                
                int count =0;
                
            while(rs.next())
            {
                
                String filepath = "C://Users//vaibh//Documents//TTA//Core Java//Project//ProductDemo//web//FromDb"+count+".jpg";

                
                Blob blob = rs.getBlob("BookImage");
                InputStream inputStream1 = blob.getBinaryStream();//blob-> binary stream
                
                OutputStream outputStream = new FileOutputStream(new File(filepath));
                int bytesRead = -1;
                byte[] buffer = new byte[4096];
                while ((bytesRead = inputStream1.read(buffer)) != -1) {
                    outputStream.write(buffer, 0, bytesRead);
                }   
                    
                inputStream1.close();
                outputStream.close();
                    
                bookID = Integer.parseInt(rs.getString(1));
                bookName = rs.getString(2);
                bookAuthor =rs.getString(3);
                bookIn = Integer.parseInt(rs.getString(5));
                bookOut = Integer.parseInt(rs.getString(6));
                
                %>
                
        <form action="book">

        <table border="1">           
            
                <tr>
                    
                    <td><input type="text" name="bookID" value=<%= bookID%>></td>
                    <td><%= bookName%></td>
                    <td><img  width="200px" height="200px" src="FromDb<%= count%>.jpg"></td>
                    <td><%= bookAuthor%></td>
                    <td><%= bookIn%></td>
                    <td><%= bookOut%></td>
                    <td><input type="radio" name="ir" value="issue"/>Issue Book</td>
                    <td><input type="radio" name="ir" value="return"/>Return Book</td>   
                    <td><input type="submit" value="Update"/></td>
                </tr>
        </table>
        </form>

                <%
               count++; 
            }//while ends
            }//try ends
            catch(Exception ex)
            {
            System.out.println("book error: "+ex);
            }
            %>
    </body>
</html>
