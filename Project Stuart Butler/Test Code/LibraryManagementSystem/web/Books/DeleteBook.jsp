<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Library Management System</title>
        <meta charset="utf-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no"/>
        <link rel="stylesheet" href="<%=request.getContextPath()%>/css/main.css" />
    </head>
    <body>
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
                    <li><a href="ViewBooks.jsp">View Books</a></li>
                    <li class="current"><a href="DeleteBook.jsp">Delete Book</a></li>
                    <li ><a href="Issue.jsp">Issue Book</a></li>
                    <li ><a href="Return.jsp">Return Book</a></li>
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
                            <h2>DELETE BOOK</h2>
                        </header>
                        <form action="<%=request.getContextPath()%>/DeleteBook" method="get">
                            <table>
                                <tr>
                                    <td>Enter a Book ID:<input type="text" name ="bid"/></td>
                                </tr>
                                <tr>
                                    <td><input type="submit" value ="Delete"/></td>
                                </tr>
                            </table>
                        </form>
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
 
</body>
</html>
