<%-- 
    Document   : update
    Created on : 29 Jun, 2021, 3:25:24 PM
    Author     : vaibh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Update Student</title>
    </head>
    <body>
         <!--Using JSP tag :  include "master.html" page-->
        <jsp:include page="master.html"/>
        
        <h1>Update Student</h1>
        
        <!--
        Create a <form> for accepting "sid" and "score"
        on "submit button" call action "update"
        
        -->
        <form action="UpdateScore" method="get">
            <label>Enter a student ID:</label>
            <input type="text" name ="sid"/></br>
            <label>Enter a score:</label>
            <input type="text" name="score"/></br>
            <label></label><input type="submit" value ="Update"/>
        </form>
    </body>
</html>
