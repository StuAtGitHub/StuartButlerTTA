
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
        <link rel="stylesheet" href="assets/css/main.css" />
    </head>
    <body class="is-preload">
        <div id="page-wrapper">
            <!-- Header -->
            <div id="header">
                <!-- Logo -->
                <h1>
                    <a href="admin.jsp" id="logo">Library <em>Management System</em></a>
                </h1>

                <!-- Nav -->
                <nav id="nav">
                    <ul>
                        <li><a href="admin.jsp">Home</a></li>
                        <li><a href="create.jsp">Add Librarian</a></li>
                        <li class="current"><a href="display.jsp">View Librarian</a></li>
                        <li><a href="update.jsp">Update Librarian</a></li>
                        <li><a href="delete.jsp">Delete Librarian</a></li>
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
                                <h2>VIEW ALL LIBRARIANS</h2>
                            </header>


                            <!--DB code to display all records-->
                            <%
                                try {

                                    Connection con = MyConnection.connect();//get connection
                                    Statement stmt = con.createStatement();//create statement
                                    String qry = "Select * from Librarians";//select query to display all records
                                    ResultSet rs = stmt.executeQuery(qry);//execute query
                            %>
                            <table id="table-style">
                                <thead>
                                    <tr>
                                        <th>Librarian ID</th>
                                        <th>First Name</th>
                                        <th>Last Name</th>
                                        <th>Photo</th>
                                        <th>User Name</th>
                                        <th>Password</th>

                                    </tr>
                                </thead>
                                <%
                                    //get one by one record from Result
                                    while (rs.next()) {
                                %>            

                                <tbody>
                                    <tr>
                                        <td class="dis"><%= rs.getInt(1)%></td>
                                        <td class="dis"><%= rs.getString(2)%></td>
                                        <td class="dis"><%= rs.getString(3)%></td>
                                        <td class="dis"><%= rs.getBlob(4)%></td>
                                        <td class="dis"><%= rs.getString(5)%></td>
                                        <td class="dis"><%= rs.getString(6)%></td>

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
