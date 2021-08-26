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
                        <li><a href="<%=request.getContextPath()%>/Books/home.jsp">Home</a></li>
                        <li><a href="<%=request.getContextPath()%>/Books/AddBook.jsp">Add Book</a></li>
                        <li><a href="<%=request.getContextPath()%>/Books/ViewBooks.jsp">View Books</a></li>
                        <li><a href="<%=request.getContextPath()%>/Books/Issue.jsp">Issue Book</a></li>
                        <li><a href="<%=request.getContextPath()%>/Books/Return.jsp">Return Book</a></li>
                        <li class="current"><a href="displaymembers.jsp">Members</a></li>
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
                                <h2>VIEW ALL MEMBERS</h2>
                            </header>
                            <!--DB code to display all records-->
                            <%
                                try {

                                    Connection con = MyConnection.connect();//get connection
                                    Statement stmt = con.createStatement();//create statement
                                    String qry = "Select * from Members";//select query to display all records
                                    ResultSet rs = stmt.executeQuery(qry);//execute query
                            %>
                            <table id="table-style">
                                <thead>
                                    <tr>
                                        <th>Member ID</th>
                                        <th>First Name</th>
                                        <th>Second Name</th>
                                        <th>Profile Picture</th>
                                        
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
                                        <td><img alt="No image on file" src="../images/memberImages/MemberImageForMID<%=rs.getInt(1)%>.jpg" height="75px"/></td>
                                        
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
                            <header>
                                <h2>ADD MEMBER</h2>
                            </header>
                            <form name="fileform" action="<%=request.getContextPath()%>/CreateMember" method="post" enctype="multipart/form-data">
                                <table border="1" cellpadding="15">
                                    <tr>
                                        <td>Member ID: <input type="text" name="MemberID"/></td>
                                    </tr>
                                    <tr>
                                        <td>First Name: <input type="text" name="MemberFName"/></td>
                                    </tr>
                                    <tr>
                                        <td >Second Name: <input type="text" name="MemberSName"/></td>
                                    </tr>
                                    <tr>
                                        <td >Profile Picture: 
                                            <input type="file" size="50" name="MemberImage" id="custom-upload"/>
                                        </td>
                                    </tr>
                                    
                                    <tr>
                                        <td><input type="submit" value="Add"/></td>
                                    </tr>

                                </table>

                           
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
