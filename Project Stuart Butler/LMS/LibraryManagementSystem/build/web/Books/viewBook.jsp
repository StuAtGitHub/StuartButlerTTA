<%-- 
    Document   : viewBook
    Created on : 28 Jul, 2021, 10:54:35 PM
    Author     : vaibh
--%>

<%@page import="java.io.FileOutputStream"%>
<%@page import="java.io.File"%>
<%@page import="java.io.OutputStream"%>
<%@page import="java.io.InputStream"%>
<%@page import="java.sql.Blob"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="com.tta.model.MyConnection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Library Management System</title>
        <meta charset="utf-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no"/>
        <link rel="stylesheet" href="<%=request.getContextPath()%>/css/main.css" />
    </head>
    <body  class="is-preload">
         <div id="page-wrapper">
            <!-- Header -->
            <div id="header">
                <!-- Logo -->
                <h1>
                    <a href="home.jsp" id="logo">Library <em>Management System</em></a>
                </h1>

                <!-- Nav -->
                <nav id="nav">
                    <ul>
                        <li><a href="home.jsp">Home</a></li>
                        <li><a href="AddBook.jsp">Add Book</a></li>
                        <li class="current"><a href="viewBook.jsp">View Books 1</a></li>
                        <li><a href="ViewBooks.jsp">View Books 2</a></li>
                        <li><a href="DeleteBook.jsp">Delete Book</a></li>
                        <li><a href="Issue.jsp">Issue Book</a></li>
                        <li><a href="Return.jsp">Return Book</a></li>
                        <li><a href="<%=request.getContextPath()%>/Member/displaymembers.jsp">Members</a></li>
                        <li><form action="<%=request.getContextPath()%>/logout" method="post"><input type="submit" value="Logout" id="logout-button"/></form></li>
                    </ul>
                </nav>
            </div>
                     <!-- Main -->
            <section class="wrapper style1">
                <div class="container">
                    <div id="content">
                        <!-- Content --> 

                        <center>
                            <header>
                                <h2>Current Library</h2>
                            </header>
                    
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
                
                String filepath = "C://Users//yoliv//Desktop//TechTalent//LMS//LibraryManagementSystem//web//images//bookimages//FromDb"+count+".jpg";

                
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
                
        <form action="<%=request.getContextPath()%>/book">

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
            </center>

                    </div>
                </div>
            </section>

            <!-- Copyright -->
            <div class="copyright">
                <ul class="menu">
                    <li>&copy; Untitled. All rights reserved</li>
                    <li>Design: <a href="http://html5up.net">HTML5 UP</a></li>
                </ul>
            </div>
        </div>

        <!-- Scripts -->
        <script src="assets/js/jquery.min.js"></script>
        <script src="assets/js/jquery.dropotron.min.js"></script>
        <script src="assets/js/browser.min.js"></script>
        <script src="assets/js/breakpoints.min.js"></script>
        <script src="assets/js/util.js"></script>
        <script src="assets/js/main.js"></script>

    </body>
</html>
