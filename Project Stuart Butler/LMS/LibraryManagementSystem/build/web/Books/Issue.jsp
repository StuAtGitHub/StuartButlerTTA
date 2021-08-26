<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="com.tta.model.MyConnection"%>
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
        <link rel="stylesheet" href="<%=request.getContextPath()%>/css/main.css"/>
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
                        <li><a href="AddBook.jsp">Add Book</a></li>
                        <li><a href="viewBook.jsp">View Books 1</a></li>
                        <li><a href="ViewBooks.jsp">View Books 2</a></li>
                        <li><a href="DeleteBook.jsp">Delete Book</a></li>
                        <li class="current"><a href="Issue.jsp">Issue Book</a></li>
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
                                <h2>ISSUE BOOK</h2>
                            </header>
                            <form action="/Issue" method="post">
                                <table border="1" cellpadding="15">
                                    <tr>
                                        <td>Book ID: <input type="text" name="BookIssued"/></td>
                                    </tr>
                                    <tr>
                                        <td>Member ID: <input type="text" name="IssuedTo"/></td>
                                    </tr>
                                    <tr>
                                        <td><input type="submit" value="Issue Book"/></td>
                                    </tr>
                                </table>
                            </form>

                            <header>
                                <h2>ALL ISSUED BOOKS</h2>
                            </header>
                            <!--DB code to display all records-->
                            <%
                                try {

                                    Connection con = MyConnection.connect();//get connection
                                    Statement stmt = con.createStatement();//create statement
                                    String qry = "Select Books.BookID, Books.BookTitle, Members.MemberID, Members.MemberFName, Members.MemberContact from (( Issues Inner join Members on issues.IssuedTo = Members.MemberID)Inner join Books on issues.BookIssued = Books.BookID)";//select query to display all records
                                    ResultSet rs = stmt.executeQuery(qry);//execute query
                            %>
                            <table id="table-style">
                                <thead>
                                    <tr>
                                        <th>Book ID</th>
                                        <th>Book Title</th>
                                        <th>Member ID</th>
                                        <th>Member Name</th>
                                        <th>Member Contact</th>


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
                                        <td><%= rs.getInt(3)%></td>
                                        <td><%= rs.getString(4)%></td>
                                        <td><%= rs.getInt(5)%></td>


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
    <script src="js/jquery.min.js"></script>
    <script src="js/jquery.dropotron.min.js"></script>
    <script src="js/browser.min.js"></script>
    <script src="js/breakpoints.min.js"></script>
    <script src="js/util.js"></script>
    <script src="js/main.js"></script>
</body>
</html>

