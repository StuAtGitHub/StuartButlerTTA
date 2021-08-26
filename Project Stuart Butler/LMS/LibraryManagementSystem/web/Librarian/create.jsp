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
        <meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no"/>
        <link rel="stylesheet" href="<%=request.getContextPath()%>/css/main.css" />
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
                        <li class="current"><a href="create.jsp">Add Librarian</a></li>
                        <li><a href="display.jsp">View Librarian</a></li>
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
                                <h2>ADD LIBRARIAN</h2>
                            </header>

                            <form name="fileform" action="<%=request.getContextPath()%>/LibrarianUpload" method="post" enctype="multipart/form-data">
                                <table border="1" cellpadding="15">
                                    <tr>
                                        <td>Librarian ID: <input type="text" name="LibrarianID"/></td>
                                    </tr>
                                    <tr>
                                        <td>First Name: <input type="text" name="LibrarianFName"/></td>
                                    </tr>
                                    <tr>
                                        <td >Last Name: <input type="text" name="LibrarianSName"/></td>
                                    </tr>
                                    <tr>
                                        <td >Profile Picture: 
                                            <input type="file" size="50" name="LibrarianImage" id="custom-upload"/>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td>User Name: <input type="text" name="LibrarianUName"/></td>
                                    </tr>
                                    <tr>
                                        <td>Password: <input type="password" name="LibrarianPassword"/></td>
                                    </tr>
                                    <tr>
                                        <td><input type="submit" value="Add"/></td>
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
        <script src="assets/js/jquery.min.js"></script>
        <script src="assets/js/jquery.dropotron.min.js"></script>
        <script src="assets/js/browser.min.js"></script>
        <script src="assets/js/breakpoints.min.js"></script>
        <script src="assets/js/util.js"></script>
        <script src="assets/js/main.js"></script>

    </body>
</html>

