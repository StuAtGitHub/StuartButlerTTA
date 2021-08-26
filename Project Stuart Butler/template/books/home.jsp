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
                        <li class="current"><a href="home.jsp">Home</a></li>
                        <li><a href="create.jsp">Add Book</a></li>
                        <li><a href="display.jsp">View Books</a></li>
                        <!--<li><a href="update.jsp">Update Book</a></li>-->
                        <li><a href="delete.jsp">Delete Book</a></li>
                        <li><a href="issue.jsp">Issue Book</a></li>
                        <li><a href="issued.jsp">Issued Books</a></li>
                        <li><a href="return.jsp">Return Book</a></li>
                        <li><form action="<%=request.getContextPath()%>/logout" method="post"><input type="submit" value="Logout" id="logout-button"/></form></li>
                    </ul>
                </nav>
            </div>

            <!-- Banner -->
            <section id="banner"></section>

            <!-- Gigantic Heading -->
            <section class="wrapper style2">
                <div class="container">
                    <header class="major">
                        <h2>THE WONDERFUL WORLD OF READING</h2>
                        <p>Current books in our catalog</p>
                    </header>
                </div>
            </section>

            <!-- Posts -->
            <section class="wrapper style1">
                <div class="container">
                    <div class="row">
                        <section class="col-6 col-12-narrower">
                            <div class="box post">
                                <a href="#" class="image left"
                                   ><img src="images/book1.jpg" alt=""
                                      /></a>
                                <div class="inner">
                                    <h3>The First Thing</h3>
                                    <p>
                                        Duis neque nisi, dapibus sed mattis et quis, nibh. Sed et
                                        dapibus nisl amet mattis, sed a rutrum accumsan sed.
                                        Suspendisse eu.
                                    </p>
                                </div>
                            </div>
                        </section>
                        <section class="col-6 col-12-narrower">
                            <div class="box post">
                                <a href="#" class="image left"
                                   ><img src="images/book2.jpg" alt=""
                                      /></a>
                                <div class="inner">
                                    <h3>The Second Thing</h3>
                                    <p>
                                        Duis neque nisi, dapibus sed mattis et quis, nibh. Sed et
                                        dapibus nisl amet mattis, sed a rutrum accumsan sed.
                                        Suspendisse eu.
                                    </p>
                                </div>
                            </div>
                        </section>
                    </div>
                    <div class="row">
                        <section class="col-6 col-12-narrower">
                            <div class="box post">
                                <a href="#" class="image left"
                                   ><img src="images/book3.jpg" alt=""
                                      /></a>
                                <div class="inner">
                                    <h3>The Third Thing</h3>
                                    <p>
                                        Duis neque nisi, dapibus sed mattis et quis, nibh. Sed et
                                        dapibus nisl amet mattis, sed a rutrum accumsan sed.
                                        Suspendisse eu.
                                    </p>
                                </div>
                            </div>
                        </section>
                        <section class="col-6 col-12-narrower">
                            <div class="box post">
                                <a href="#" class="image left"
                                   ><img src="images/book4.jpg" alt=""
                                      /></a>
                                <div class="inner">
                                    <h3>The Fourth Thing</h3>
                                    <p>
                                        Duis neque nisi, dapibus sed mattis et quis, nibh. Sed et
                                        dapibus nisl amet mattis, sed a rutrum accumsan sed.
                                        Suspendisse eu.
                                    </p>
                                </div>
                            </div>
                        </section>
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

            <!-- Scripts -->
            <script src="assets/js/jquery.min.js"></script>
            <script src="assets/js/jquery.dropotron.min.js"></script>
            <script src="assets/js/browser.min.js"></script>
            <script src="assets/js/breakpoints.min.js"></script>
            <script src="assets/js/util.js"></script>
            <script src="assets/js/main.js"></script>
        </div>
    </body>
</html>

