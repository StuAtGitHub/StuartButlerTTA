

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
                <title>Create Student</title>
                <link rel="stylesheet" href="style.css" type="text/css">
    </head>
    <body>
        
        <!--Using JSP tag :  include "master.html" page-->
        <jsp:include page="Members.jsp"/>
        
        <h1>Add a new Member</h1>
        
        <!--create form for student records-->

        <form action="CreateMember" method="POST" enctype="multipart/form-data">
            <label> Member ID:</label><input type="text" name="sid"/>
            <br/>
            <label>First Name:</label><input type="text" name="fname"/>
            <br/>
            <label>Last Name:</label><input type="text" name="lname"/>
            <br/>
            <label>Photo:</label><input type="file" name ="photo"/>
            <br/>
            <label></label><input type="submit" value="Insert"/>
        </form>
        
        
        
    </body>
</html>
