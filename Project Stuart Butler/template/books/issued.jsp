<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="com.lms.model.MyConnection"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<!--
        Arcana by HTML5 UP
        html5up.net | @ajlkn
        Free for personal and commercial use under the CCA 3.0 license (html5up.net/license)
-->
<html>
    <head>
        <title>Library Management System</title>
        <meta charset="utf-8" />
        <meta
            name="viewport"
            content="width=device-width, initial-scale=1, user-scalable=no"
            />
        <link rel="stylesheet" href="<%=request.getContextPath()%>/Librarian/assets/css/main.css" />
    </head>
    <body class="is-preload">
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
                        <li><a href="create.jsp">Add Book</a></li>
                        <li><a href="display.jsp">View Books</a></li>
                       <!-- <li><a href="update.jsp">Update Book</a></li>-->
                        <li><a href="delete.jsp">Delete Book</a></li>
                        <li><a href="issue.jsp">Issue Book</a></li>
                        <li class="current"><a href="issued.jsp">Issued Books</a></li>
                        <li><a href="return.jsp">Return Book</a></li>
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
                                <h2>VIEW ALL ISSUED BOOKS</h2>
                            </header>
                            <!--DB code to display all records-->
                            <%
                                try {

                                    Connection con = MyConnection.connect();//get connection
                                    Statement stmt = con.createStatement();//create statement
                                    String qry = "Select * from Books";//select query to display all records
                                    ResultSet rs = stmt.executeQuery(qry);//execute query
                            %>
                            <table id="table-style">
                                <thead>
                                    <tr>
                                        <th>Book ID</th>
                                        <th>Book Title</th>
                                        <th>Author</th>
                                        <th>Book Cover</th>
                                        <th>Number of Copies</th>
                                        <th>Copies Issued</th>

                                    </tr>
                                </thead>
                                <%
                                    //get one by one record from Result
                                    while (rs.next()) {
                                %>            

                                <tbody>
                                    <tr>
                                        <td><%= rs.getInt(1)%></td>
                                        <td><%= rs.getString(2)%></td>
                                        <td><%= rs.getString(3)%></td>
                                        <td><%= rs.getBlob(4)%></td>
                                        <td><%= rs.getInt(5)%></td>
                                        <td><%= rs.getInt(6)%></td>

                                    </tr>
                                </tbody>    
                                <%
                                    }//while ends
                                %>       
                            </table>        
                            <%
                                }//try ends
                                catch (Exception ex) {
                                    System.out.println("Display error :" + ex);
                                }//catch ends

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
