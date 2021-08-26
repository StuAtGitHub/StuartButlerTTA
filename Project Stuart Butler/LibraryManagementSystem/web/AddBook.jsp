

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <jsp:include page="Books.jsp"/>
        <hr/>
        <br/>
        <h1>Add new book</h1>
        <form action="NewBook" method="POST" enctype="multipart/form-data">
            <label> Book ID:</label><input type="text" name="bid"/>
            <br/>
            <label>Title:</label><input type="text" name="btitle"/>
            <br/>
            <label>Author:</label><input type="text" name="bauthor"/>
            <br/>
            <label>Cover:</label><input type="file" name ="photo"/>
            <br/>
            <label>Copies</label><input type="text" name="bcopies"/>
            <br/>
            <label></label><input type="submit" value="Insert"/>
        </form>
    </body>
</html>
