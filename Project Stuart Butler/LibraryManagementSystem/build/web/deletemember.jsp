<%-- 
    Document   : delete
    Created on : 29 Jun, 2021, 3:25:13 PM
    Author     : vaibh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Delete Student</title>
                
    </head>
    <body>
         <!--Using JSP tag :  include "master.html" page-->
        <jsp:include page="Members.jsp"/>
        
        <h1>Delete Student</h1>
        
        <!--
        Create <form> accepting "student id",
        on "submit button" call action "delete"
        -->
        <form action="DeleteMember" method="get">
            <label>Enter a student ID:</label>
            <input type="text" name ="sid"/></br>
            <label></label><input type="submit" value ="Delete"/>
        </form>
    </body>
</html>
