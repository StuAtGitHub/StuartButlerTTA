<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <jsp:include page="Books.jsp"/>
        
        <form action="DeleteBook" method="get">
            <label>Enter a Book ID:</label>
            <input type="text" name ="bid"/></br>
            <label></label><input type="submit" value ="Delete"/>
        </form>
        
    </body>
</html>
