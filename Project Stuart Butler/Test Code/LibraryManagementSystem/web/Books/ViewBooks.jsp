<%@page import="java.sql.Connection"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
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
                        <li class="current"><a href="ViewBooks.jsp">View Books</a></li>
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
                            <!--Database code to display all records-->
                            <%
                                try {

                                    Connection con = MyConnection.connect();//get connection
                                    Statement stmt = con.createStatement();//create statement
                                    String qry = "select * from Books";//select query to display all records
                                    ResultSet rs = stmt.executeQuery(qry);//execute query
                            %>   
                            <table id="table-style">
                                <thead>
                                <tr>
                                    <th>ID</th>
                                    <th>Title</th>
                                    <th>Author</th>   
                                    <th>Copies held</th>
                                    <th>Copies issued</th>
                                    <th>Cover</th>
                                </tr>
                                </thead>
                                <%
                                    //get one by one record from ResultSet
                                    while (rs.next()) {
                                %>
                                <tbody>
                                <tr>
                                    <td><%= rs.getInt(1)%></td>
                                    <td><%= rs.getString(2)%></td>
                                    <td><%= rs.getString(3)%></td> 
                                    <td><%= rs.getInt(4)%></td>
                                    <td><%= rs.getInt(5)%></td>
                                    <td><img alt="No image on file" src="../images/bookimages/BookImageForBID<%=rs.getInt(1)%>.jpg" height="75px"/></td>
                                </tr>
                                </tbody>
                                <%

                                    }//while ends
                                %>
                            </table>        
                            <%
                                }//try ends
                                catch (Exception ex) {
                                    out.println("Display error :" + ex);
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
