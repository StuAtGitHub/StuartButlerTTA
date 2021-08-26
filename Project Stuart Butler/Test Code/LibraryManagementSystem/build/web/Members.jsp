<%-- 
    Document   : Members
    Created on : 17-Jul-2021, 13:35:27
    Author     : rach2
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <jsp:include page="master.html"/>
        <nav>
                <a href="displaymembers.jsp">View Members</a>                
                <a href="createnewmember.jsp">Register new Member</a>                
                <a href="deletemember.jsp">Delete Member</a>                
                <a href="">Edit Member</a>                
        </nav>   
    </body>
</html>
