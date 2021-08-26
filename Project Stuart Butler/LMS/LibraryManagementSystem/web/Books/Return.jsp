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
                        <li><a href="home.jsp">Home</a></li>
                        <li><a href="AddBook.jsp">Add Book</a></li>
                        <li><a href="viewBook.jsp">View Books 1</a></li>
                        <li><a href="ViewBooks.jsp">View Books 2</a></li>
                        <li><a href="DeleteBook.jsp">Delete Book</a></li>
                        <li ><a href="Issue.jsp">Issue Book</a></li>
                        <li class="current"><a href="Return.jsp">Return Book</a></li>
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
                                <h2>RETURN BOOK</h2>
                            </header>
                            <form action="/ReturnBook" method="post">
                                <table border="1" cellpadding="15">
                                    <tr>
                                        <td>Book ID: <input type="number" name="BookIssued"/></td>
                                    </tr>
                                    <tr>
                                        <td>Member ID: <input type="number" name="IssuedTo"/></td>
                                    </tr>
                                    <tr>
                                        <td><input type="submit" value="Return Book"/></td>
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

