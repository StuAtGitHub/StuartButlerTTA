<%-- 
    Document   : create
    Created on : 29 Jun, 2021, 3:24:45 PM
    Author     : vaibh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Create Student</title>
                <link rel="stylesheet" href="style.css" type="text/css">
    </head>
    <body>
        
        <!--Using JSP tag :  include "master.html" page-->
        <jsp:include page="master.html"/>
        
        <h1>Student Create</h1>
        
        <!--create form for student records-->

        <form action="create" method="get">
            <label> Student ID:</label><input type="text" name="sid"/>
            <br/>
            <label>First Name:</label><input type="text" name="fname"/>
            <br/>
            <label>Last Name:</label><input type="text" name="lname"/>
            <br/>
            <label>Score:</label><input type="text" name="score"/>
            <br/>
            <label></label><input type="submit" value="Insert"/>
        </form>
        
        
        
    </body>
</html>
